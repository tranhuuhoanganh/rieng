// viết chương trình giải phương trình bậc hai trong đó hệ số a,b,c nhập từ bàn phím 
package bai_tap;

import static bai_tap.bai5.phuongTrinhBacNhat;
import java.util.Scanner;

public class Bai2 {
    public static void phuongTrinhBacHai(float a , float b , float c) {   
        //giai phuong trình a*x^2 + b*x + c = 0
        if(a!=0)
        {
           float delta= b*b - 4*a*c;
           if(delta>0){
            System.out.println("phuon trinh co 2 nghiệm: ");
            float x1 = (float)(-b + Math.sqrt(delta))/(2*a);
            float x2 = (float)(-b - Math.sqrt(delta))/(2*a);
               System.out.println("x1 = " +x1);
               System.out.println("x2 = " +x2);

           }
           else if (delta<0)
           {
               System.out.println("phuon trinh vo nghiem ");
           }
           else //delta = 0
           {
               System.out.println("phuong trinh co nghiem kep: ");
               
               System.out.println("x1 = x2 = " +(-b/(a*a)));
           }  
        }
        else //a=0
        {
                    phuongTrinhBacNhat(a,b);
                    
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("nhap a : ");
        float a = sc.nextFloat();
        System.out.print("nhap b : ");
        float b = sc.nextFloat();  
        System.out.print("nhap c : ");
        float c = sc.nextFloat();
        phuongTrinhBacHai(a,b,c);
    }
}
