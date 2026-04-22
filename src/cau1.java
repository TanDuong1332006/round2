
public class cau1 {
	public void cau1(int n) {
	    if (n <= 0) {
	        System.out.println("Nhập sai");
	        return;
	    }
	    long f1 = 1, f2 = 1;
	    for (int i = 1; i <= n; i++) {
	        System.out.print(f1 + " ");
	        long next = f1 + f2;
	        f1 = f2;
	        f2 = next;
	    }
	}
}
