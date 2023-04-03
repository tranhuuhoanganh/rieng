package kienthuc;

import java.util.Scanner;

public class Vd_Boolean {

	public static void main(String[] args) {
		
		// nhập 3 cạnh xem có tạo nên 1 tam giac không 
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap canh a: ");
		int a = sc.nextInt();
		
		System.out.print("nhap canh b: ");
		int b = sc.nextInt();
	
		System.out.print("nhap canh c: ");
		int c = sc.nextInt();
		
		boolean z = (a+b>c||a+c>b||c+b>a);
		
		System.out.println(z == true ? "3 canh tao nen 1 tam giac " : "3 canh khong tao nen mot tam giac ");
		sc.close();
	}

}
