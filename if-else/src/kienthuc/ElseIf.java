package kienthuc;

import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("nhap gia tri cua x: ");
		int x = sc.nextInt();
		
		if( x <= 10 )
		{
			 System.out.print("dat loai gioi ");	
		}
		else if(x>=7 && x<9)
		{
			System.out.println("dạt loai kha");
		}
		else if (x>=4 && x<7)
		{
			System.out.println("dat loai trung binh");
		}
		else if (x>0 && x<4) {
			System.out.println("dat loai yeu ");
		}
		else 
			System.out.println("khong dat gia tri nao  ");
		
	
		sc.close();

	}

}
