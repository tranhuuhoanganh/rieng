package tinhtoan;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		
		String hoten="";
		float diemtb=0;
		Scanner sss = new Scanner(System.in);
		System.out.print("nhap ho va ten: ");
		hoten = sss.nextLine();
		
		System.out.print("nhap diem:");
		diemtb = sss.nextFloat();
		
		System.out.printf("%s co diem trung binh la %.1f",hoten,diemtb);
	sss.close();
	}

}

