// viết chương trình giải phương trình bậc hai trong đó hệ số a,b,c nhập từ bàn phím 
package bai_tap;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        
        float delta;
        float x,x1,x2;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("nhap a: ");
        float a = sc.nextFloat();
        System.out.print("nhap b: ");
        float b = sc.nextFloat();
        System.out.print("nhap c: ");
        float c = sc.nextFloat();
        
        //giai phuong trình a*x^2 + b*x + c = 0
        
        if(a!=0)
        {
           delta= b*b - 4*a*c;
           if(delta>0){
            System.out.println("phuon trinh co 2 nghiệm: ");
            x1 = (float)(-b + Math.sqrt(delta))/2*a;
            x2 = (float)(-b - Math.sqrt(delta))/2*a;
               System.out.println("x1 = " +x1);
               System.out.println("x2 = " +x2);

           }
           else if (delta<0)
           {
               System.out.println("phuon trinh vo nghiem ");
           }
           else
           {
               System.out.println("phuong trinh co nghiem kep: ");
               
               System.out.println("x1 = x2 = " +(-b/(a*a)));
           }  
        }
        else 
        {
            System.out.println("phương trìn co nghiem x = " +(-c/b));
        }

        
    }
    
}
