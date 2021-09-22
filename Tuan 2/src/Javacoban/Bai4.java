package Javacoban;

import java.util.Scanner;

public class Bai4 {
	public static void main (String[] args) {
		int n , a= 0;
		Scanner sc = new Scanner (System.in);
		System.out.print("chương trình tính tổng của dãy số từ 1 đến n");
		System.out.print("\nNhap so n: ");
		n = sc.nextInt();
		for (int i = 0; i<=n ;i++)
		{
			a = a + i;
		}
		System.out.print("\ntổng của dãy số từ 1 đến"+ n +" la:"+ a);
	}
}
