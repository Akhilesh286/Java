public class Main {
	public static void main(String[] args) {
		short x = 1;
		int y = x+2;
		System.out.println(y);
		
		double a = 1.1;
		int b = (int)x+2; // int b = x+2; get error
		System.out.println(b);
		
		String p = "1";
		int q = Integer.parseInt(p)+2;
		System.out.println(q);
	}
}