package Javacoban;

import java.util.Scanner;

public class Bai3 {
	public static void main (String[] args) {
		int a, b,c;
		double denta, n1, n2;
		Scanner sc = new Scanner (System.in);
		System.out.print("giải phương trình bậc 2: ax^2 + bx + c =0");
		System.out.print("\nNhap a: ");
		a = sc.nextInt();
		System.out.print("Nhap b: ");
		b = sc.nextInt();
		System.out.print("Nhap c: ");
		c = sc.nextInt();
		denta = b*b-4*a*c;
		if (denta > 0) {
			System.out.print("Phuong trinh co 2 nghiem");
			n1 = (-b + Math.sqrt(denta))/(2*a);
			n2 = (-b - Math.sqrt(denta))/(2*a);
			System.out.print("\nnghiem 1= " + n1 +"\nNghiem 2= "+ n2);
		}
		else if (denta == 0) {
			System.out.print("Phuong trinh co 1 nghiem duy nhat");
			n1 = -b/(2*a);
			System.out.print("\nnghiem= " + n1);
		}
		else {
			System.out.print("Phuong trinh vo nghiem");
		}
	}
}
