package Javacoban;

import java.util.Scanner;

public class Bai1 {


	public static void main (String[] args) {
		String chuoi;
		System.out.print("Truong chinh doi chu hoa thanh chu thuong");
		System.out.print("\nNhap Chuoi: ");
		Scanner sc = new Scanner (System.in);
		chuoi = sc.nextLine();
		System.out.print("Doi thanh chu hoa: " + chuoi.toUpperCase());
	}
}
