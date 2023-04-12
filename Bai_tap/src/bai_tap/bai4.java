
package bai_tap;

import java.util.Scanner;


public class bai4 {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu dai: ");
        float chieudai = sc.nextFloat();
        System.out.println("nhap chieu rong: ");
        float chieurong = sc.nextFloat();
        float chuvi = chuViHinhChuNhat(chieudai,chieurong);
        System.out.println(chuvi);

     
        System.out.println("nhap ban kinh: ");
        float bankinh =sc .nextFloat();
        System.out.println ( dienTichHinhTron(bankinh));
    }
    public static float chuViHinhChuNhat (float chieudai,float chieurong) {
        float chuvi = (chieudai + chieurong) /2;
        return chuvi ;
    }
        public static float dienTichHinhTron(float bankinh) {
        float dientichtron = (float) (bankinh * 3.14);
        return dientichtron;
    }*/
       
 
  final float Pi = 3.14f;
    float r;
    float cv;
    float dt;

    public void nhapBanKinh()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh r: "); 
        r = sc.nextFloat();
   
    }

    public void tinhChuvi()
    {
        cv = 2 * r * Pi;
    }    

    public void tinhDienTich()
    {
        dt = r * r * Pi;
    }

    public void inThongso()
    {
        System.out.printf("Chu vi cua hinh tron co r = %f la: %f",r,cv);
        System.out.printf("\nDien tich cua hinh tron co r = %f la: %f",r,dt);

    }
}



   

   
    
          

