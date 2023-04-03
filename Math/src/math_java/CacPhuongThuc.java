package math_java;

public class CacPhuongThuc {

	public static void main(String[] args) {
		int a = 9;
		int b = 20;
		int c = -9;
		float d = 2.2f;
		System.out.println(Math.max(a,b));		// Tìm giá trị lớn nhất
		System.out.println(Math.min(a,b));		// Tìm giá trị nhỏ nhất
		System.out.println(Math.sqrt(a));		// tìm căn bấc 2 của a 
		System.out.println(Math.abs(c));		// Tìm giá trị tuyệt đối của a 
		System.out.println(Math.random());		// xuất hiện 1 giá trị từ 0.0 -> 1.0
		System.out.println(Math.ceil(d));		// Làm tròn tăng giá trị 
		System.out.println(Math.floor(d));		// Làm tròn giảm giá trị 
		System.out.println(Math.pow(a,b));		// lũy thừa a^b
		

	}

}
