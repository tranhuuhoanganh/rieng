package tinhtoan;

import java.util.Scanner;

public class BaiHai {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap canh a: ");
		double a = sc.nextDouble();
		System.out.print("nhap canh b: ");
		double b = sc.nextDouble();
		sc.close();
		
		double cv = (a+b)*2;			// tinh chu vi
		double dt = a*b;				// tính diện tích
		double min = Math.min(a,b);		// chiều rộng 
		
		System.out.println("chu vi hinh chu nhat la " +cv);
		System.out.println("dien tich hinh chu nhat la " +dt);
		System.out.println("chieu rong bang " +min );
		
	}

}
