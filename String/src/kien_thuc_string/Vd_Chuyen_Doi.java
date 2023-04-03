package kien_thuc_string;

import java.util.Scanner;

public class Vd_Chuyen_Doi {

	public static void main(String[] args) {
// Viết chương trình nhập đơn giá và số lượng từ nextLine() của scanner sau đó chuyển đổi sang kiểu số nguyên và số thực để tính toán
			
		String soluong;
		String dongia ;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap so luong san pham: " );
		soluong = sc.nextLine();
		int a = Integer.parseInt(soluong);
	
		System.out.print("nhap don gia: " );
		dongia = sc.nextLine();
		float b = Float.parseFloat(dongia);

		float z = a*b;
		System.out.printf("tong gia tri can tra la: %.1f dong  ",z  );
		sc.close();

	}

}
