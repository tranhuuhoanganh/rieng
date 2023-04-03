package baitap;

import java.util.Scanner;

public class BaiCuoi {

	public static void main(String[] args) {

		float dongia;
		int soluong;
		
		Scanner s = new Scanner(System.in);
		
	
		System.out.print("nhap don gia : " );
		String st = s.nextLine();
		dongia = Float.parseFloat(st);
	
		
		System.out.print("nhap so luong: " );
		st = s.nextLine();
		soluong = Integer.parseInt(st);
		
		float tong = dongia * soluong;
		
		System.out.println("don gia cua san pham: " +dongia);
		System.out.println("so luong can mua: " +soluong);
		System.out.println("tong gia tri san pham: " +tong);
		
		s.close();
		
	}

}
