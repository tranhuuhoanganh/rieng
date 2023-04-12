
package bai_tap;

import java.util.Scanner;


public class lab2 {
    public static void menu() {
        System.out.println("------------------------");
        System.out.println("1 giai phuong trinh bac nhat");
        System.out.println("2 giai phuong trinh bac hai");
        System.out.println("3 tinh tien dien");
        System.out.println("------------------------");
        System.out.print("chon chuc nang: ");
        
        
        Scanner sc = new Scanner(System.in);
        int chon = sc.nextInt();
      
        switch (chon) {
            case 1 -> {
                System.out.print("nhap a : ");
                float a = sc.nextFloat();
                System.out.print("nhap b : ");
                float b = sc.nextFloat();  
                bai5.phuongTrinhBacNhat(a,b);
                break;
            }
            case 2 -> {
                System.out.print("nhap a : ");
                float a = sc.nextFloat();
                System.out.print("nhap b : ");
                float b = sc.nextFloat();  
                System.out.print("nhap c : ");
                float c = sc.nextFloat();
                Bai2.phuongTrinhBacHai(a,b,c);
                break;
            }
            case 3 -> {
                Bai3.tinhTienDien();
                break;
            }
            default -> System.exit(0);
        }
        
    }
    public static void main(String[] args) {
        menu();
    }
}
