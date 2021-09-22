package thietkelop;

import java.util.Scanner;

public class Bai2 {
	int a,b ,c, d, kq1, kq2;
	void khoitao () {
		System.out.print("Phân Số");
		System.out.print("\nNhap tu so: ");
		Scanner sc = new Scanner (System.in);
		a = sc.nextInt();
		System.out.print("Nhap mau so: ");
		b = sc.nextInt();
		while (b==0) {
			System.out.print("nhap lai mau so khac 0: ");
			b = sc.nextInt();
		}
	}
	void inphanso () {
		System.out.print("Phân Số hoan chinh: " + a +" / "+ b);
	}
	void phansonghichdao() {
		int lg = 0;
		lg = a;
		a = b;
		b = lg;
		System.out.print("\nPhân Số nghich dao: " + a +" / "+ b);
		lg = a; //tra lai ve gia tri ban dau
		a = b;
		b = lg;
	}
	void pheptoanphanso() {
		System.out.print("\n\nNhap Phân Số thu 2");
		System.out.print("\nNhap tu so: ");
		Scanner sc = new Scanner (System.in);
		c = sc.nextInt();
		System.out.print("Nhap mau so: ");
		d = sc.nextInt();
		while (d==0) {
			System.out.print("nhap lai mau so khac 0: ");
			d = sc.nextInt();
		}
		System.out.print("Phân Số thu 2 hoan chinh: " + c +" / "+ d);
		//1. cong phan so
		if (b == d) {
			kq1 = a + c;
			kq2 = b;
		} else if(b%d==0) {
			int tam = b/d;
			kq1 = a + c*tam;
			kq2 = b;
		} else if(d%b==0) {
			int tam = d/b;
			kq1 = a*tam + c;
			kq2 = d;
		}
		else {
			kq1 = a*d + c*b;
			kq2 = b*d;
		}
		//kiem tra mau so am
		if (kq2 < 0) {
			kq1 = -kq1;
			kq2 = -kq2;
		}
		// toi gian
		if (kq1 == kq2)
		{
			kq1 = kq1 / kq2;
			System.out.print("\nKet qua tong 2 phan so la(toi gian mau va tu so): " + kq1);
		} 
			else 
			for (int i=(kq1+kq2); i>=1; i--) {
				if (kq1%i == 0 & kq2%i == 0) {
					kq1 = kq1/i;
					kq2 = kq2/i;
				}
			}
		System.out.print("\nTong 2 Phân Số: " + kq1 +" / "+ kq2);
		//2. hieu 2 phan so
				if (b == d) {
					kq1 = a - c;
					kq2 = b;
				} else if(b%d==0) {
					int tam = b/d;
					kq1 = a - c*tam;
					kq2 = b;
				} else if(d%b==0) {
					int tam = d/b;
					kq1 = a*tam - c;
					kq2 = d;
				}
				else {
					kq1 = a*d - c*b;
					kq2 = b*d;
				}
				//kiem tra mau so am
				if (kq2 < 0) {
					kq1 = -kq1;
					kq2 = -kq2;
				}
				// toi gian
				if (kq1 == kq2)
				{
					kq1 = kq1 / kq2;
					System.out.print("\nKet qua hieu 2 phan so la(toi gian mau va tu so): " + kq1);
				} 
					else 
					for (int i=(kq1+kq2); i>=1; i--) {
						if (kq1%i == 0 & kq2%i == 0) {
							kq1 = kq1/i;
							kq2 = kq2/i;
						}
					}
				System.out.print("\nHieu 2 Phân Số: " + kq1 +" / "+ kq2);
				//3. tich 2 phan so
				kq1 = a*c;
				kq2 = b*d;
				//kiem tra mau so am
				if (kq2 < 0) {
					kq1 = -kq1;
					kq2 = -kq2;
				}
				// toi gian
				if (kq1 == kq2)
				{
					kq1 = kq1 / kq2;
					System.out.print("\nKet qua tich 2 phan so la(toi gian mau va tu so): " + kq1);
				} 
					else 
					for (int i=(kq1+kq2); i>=1; i--) {
						if (kq1%i == 0 & kq2%i == 0) {
							kq1 = kq1/i;
							kq2 = kq2/i;
						}
					}
				System.out.print("\nTich 2 Phân Số: " + kq1 +" / "+ kq2);
				//4. thuong 2 phan so
				int lg = c;
				c = d;
				d = lg;
				kq1 = a*c;
				kq2 = b*d;
				//kiem tra mau so am
				if (kq2 < 0) {
					kq1 = -kq1;
					kq2 = -kq2;
				}
				// toi gian
				if (kq1 == kq2)
				{
					kq1 = kq1 / kq2;
					System.out.print("\nKet qua Thuong 2 phan so la(toi gian mau va tu so): " + kq1);
				} 
					else 
					for (int i=(kq1+kq2); i>=1; i--) {
						if (kq1%i == 0 & kq2%i == 0) {
							kq1 = kq1/i;
							kq2 = kq2/i;
						}
					}
				System.out.print("\nThuong 2 Phân Số: " + kq1 +" / "+ kq2);
				
	}
	public static void main(String[] args) {
		
		Bai2 a = new Bai2 ();
		a.khoitao();
		a.inphanso();
		a.phansonghichdao();
		a.pheptoanphanso();
		
	}
}
