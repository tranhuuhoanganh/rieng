package kien_thuc_string;

public class CacPhuongThucCoSan {

	public static void main(String[] args) {
		String a = "Hoang Anh";
		System.out.println("do dai cua chuoi la: " +a.length());	
		/* Độ dài của chuỗi có thể tìm thấy được bời length()
		 * Cú Pháp :     variable.length()
		 */
		System.out.println("ky tu duoc viet hoa nhu sau: " +a.toUpperCase());
		/* Viết hoa hết các ký tự 
		 * Cú pháp: 	Variable.toUpperCase()
		 */
		System.out.println("ky tu duoc viet thuong nhu sau: " +a.toLowerCase());	
		/* Viết thường hết các ký tự 
		 * Cú pháp: 	Variable.toLowerCase()
		 */ 
		System.out.println("ky tu nam o vi tri thu: " +a.indexOf("g"));
		/* Phương thức này trả về nơi ký tự xuất hiện đầu tiên tính từ 0...
		 * Có cả khoảng trống 
		 * Nếu ký tự đó ko tồn tại thì sẽ trả về giá trị " -1 "
		 * Cú pháp:		Variable.indexOf("")
		 */
		
	}
}
