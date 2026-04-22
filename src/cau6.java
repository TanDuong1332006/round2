
public class cau6 {
	public void cau6(String s) {
	    if (s == null || s.trim().isEmpty()) {
	        System.out.println("Chuỗi có 0 từ");
	        return;
	    }
	    
	    // Loại bỏ khoảng trống thừa và cắt theo một hoặc nhiều khoảng trắng
	    String[] words = s.trim().split("\\s+");
	    System.out.println("Chuỗi đó có " + words.length + " từ");
	}
}
