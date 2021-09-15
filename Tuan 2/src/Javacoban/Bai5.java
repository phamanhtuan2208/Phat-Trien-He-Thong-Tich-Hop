package Javacoban;

import java.util.Scanner;

public class Bai5 {
	public static void main (String[] args) {
		int n;
		float tong=0;
		Scanner sc = new Scanner (System.in);
		System.out.print("chương trình cho nhập vào 1 dãy số thực. Tính tổng của các số dương trong dãy đó.");
		System.out.print("\nNhap so phan tu: ");
		n = sc.nextInt();
		System.out.print("Nhap cac phan tu: \n");
		float arr[]= new float[n];
			for (int i=0; i < n; i++) {
				System.out.printf("so thu %d: ", i+1);
				arr[i] = sc.nextFloat();
				if (arr[i] > 0)
				tong= tong + arr[i];
			}
			System.out.printf("tổng của các số thực dương trong dãy la: %f",tong);
	}
}
