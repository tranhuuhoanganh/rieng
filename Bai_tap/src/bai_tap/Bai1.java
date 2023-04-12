
package bai_tap;

import java.util.Scanner;


public class Bai1 {

    
    public static void main(String[] args) {

        int thang;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap nam: ");
        int nam = sc.nextInt();
        System.out.print("Nhap thang: ");
        thang = sc.nextInt();
        switch (thang) {
            case 2:{
                if(thang % 4 ==0 && thang % 100 !=0)
                    System.out.println("thang co 29 ngay ");
                    else 
                    System.out.println("thang co 28 ngay");
                    
            }
            break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("thang co 30 ngay");
            default:
                System.out.println("thang co 31 ngay");     
        }
           
    }
    
}
