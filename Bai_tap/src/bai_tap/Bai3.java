
package bai_tap;

import java.util.Scanner;

public class Bai3 {
    public static void tinhTienDien() {
        float tien;
        float sodien;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so dien da dung trong thang: ");
        sodien = sc.nextInt();
        if(sodien<50) 
        {
            tien = sodien * 1000;
        }
        else 
        {
            tien = (50*1000) + (sodien-50)*1200;
        }
        
        System.out.println(tien);
    }
    public static void main(String[] args) {
        tinhTienDien();
    }
}
