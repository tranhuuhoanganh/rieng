package kien_thuc_string;

public class NoiChuoi {

	public static void main(String[] args) {
		
		String a = " yeu";
		String b = "huyen";
		System.out.println( a + " " + b );
		/* Toán Từ " + " có thể kết hợp 2 chuỗi với nhau
		 * " " khoảng trắng để thêm khoảng cách giữa 2 ký tự 
		 */
		System.out.println(a .concat( b ));
		/* Hoặc có thể dùng " concat()"
		 * Cú Pháp 		a.concat( b )
		 */
	
		
	}

}
