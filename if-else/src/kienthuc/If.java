package kienthuc;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("nhap gia tri cua x: ");
		int x = sc.nextInt();
		
		System.out.print("nhap gia tri cua y: ");
		int y = sc.nextInt();
		
		if (x > y) {
		  System.out.printf("%d > %d la dung",x,y);
		
		/* Ý nghĩa : nếu điều kiện trong " if " là đúng thì thực hiện câu lệnh
		 * Cú Pháp : if( điều kiện ) { câu lệnh   }
		 */
		}
		else {
			System.out.printf("%d > %d la sai",x,y);
		/* Ý nghĩa : nếu điều kiện trong " if " là sai thì thực hiện câu lệnh trong " else " 
		 * Cú Pháp :  	if( condition ) { command }
		 *  			else { command }
		 */
		}
		sc.close();
	}

}
