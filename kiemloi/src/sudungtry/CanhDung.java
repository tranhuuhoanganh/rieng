package sudungtry;

import java.util.Scanner;

public class CanhDung {

	public static void main(String[] args) {
		
		try {
			int dung;
			System.out.print("nhap: ");
			Scanner sc = new Scanner(System.in);
			dung = sc.nextInt();
			System.out.println("da nhap " +dung);
			sc.close();
		}
		catch(Exception e) {
			System.out.print("nhap lai di sai roi kia : ");
			int coi ;
			Scanner aa = new Scanner(System.in);
			coi = aa.nextInt();

			System.out.println("so da nhap:  " +coi);
			System.out.println("gio moi dung nek tk ngu ");
			aa.close();	
		}
		
	
		
	
	}


}
