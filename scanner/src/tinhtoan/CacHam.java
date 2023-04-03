package tinhtoan;

import java.util.Scanner;

public class CacHam {

	public static void main(String[] args) {
		
		double sum;
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap gia tri a ");
		double a = sc.nextDouble();
		System.out.print("nhap gia tri b ");
		double b = sc.nextDouble();
		sc.close();
		sum = Math.pow(a,b);
		System.out.println("sum = " +sum);
		

	
	}

}
