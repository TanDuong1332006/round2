

public class Snippet {
	public void cau4(long n) {
	    long original = n;
	    int count = 0;
	    n = Math.abs(n); // Xử lý cả số âm
	    
	    if (n == 0) {
	        System.out.println("Số 0 không có số 2");
	        return;
	    }
	    
	    while (n > 0) {
	        if (n % 10 == 2) {
	            count++;
	        }
	        n /= 10;
	    }
	    System.out.println("Số " + original + " có " + count + " số 2");
	}
}