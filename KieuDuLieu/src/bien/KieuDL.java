package bien;

import java.util.Scanner;

public class KieuDL {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap ho ten cua bn ");
		String hoten = sc.nextLine();
		System.out.print("nhap tuoi cua bn ");
		int tuoi = sc.nextInt();
		System.out.print("nhap diem cua bn ");
		float diem = sc.nextFloat();
		sc.close();
		
		System.out.println("ho ten : " +hoten);
		System.out.println("tuoi : " +tuoi);
		System.out.println("diem : " +diem);
		
		
		
		
		
		
	}
}
