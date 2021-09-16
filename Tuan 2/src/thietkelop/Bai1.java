package thietkelop;

import java.util.Scanner;

public class Bai1 {
	int x = 0;
	int y = 0;
	double kq = 0;
	void gantoado () {
		x = 3;
		y = 4;
	}
	void nhaptoado () {
		System.out.print("Điểm trong không gian 2 chiều");
		System.out.print("\nNhap x: ");
		Scanner sc = new Scanner (System.in);
		x = sc.nextInt();
		System.out.print("Nhap y: ");
		y = sc.nextInt();
	}
	void inmanhinh () { 
		System.out.print("Diem toa do la: ("+ x + ", "+ y + ")");
	}
	void tinh () {//o	Phương thức tính khoảng cách từ điểm đó đến gốc tọa độ (0,0)
		System.out.print("\nkhoảng cách từ điểm đó đến gốc tọa độ (0,0) la: ");
		kq = Math.sqrt(x*x+y*y);
		System.out.print(kq);
	}

	public static void main (String[] args) {
		Bai1 a = new Bai1();
		a.gantoado();
		a.nhaptoado();
		a.inmanhinh();
		a.tinh();
	}
}
