package Javacoban;

import java.util.Scanner;

public class Bai2 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int number, a=0;
		System.out.print("Kiem tra so nguyen to");
		System.out.print("\nNhap so: ");
		number = sc.nextInt();
		for (int i=1; i<=number; i++)
		{
			if (number%i == 0)
			{
				a++;
			}
		}
		if (a == 2) {
			System.out.print("\nSo " + number + " thuoc so nguyen to" );
		}
		else
			System.out.print("\nSo " + number + " khong thuoc so nguyen to" );
	}
	
}
