import java.text.NumberFormat;
public class Main {
	public static void main(String[] args) {
		NumberFormat currency= NumberFormat.getCurrencyInstance();
		String result = currency.format(12345);
		System.out.println(result);
		NumberFormat percent= NumberFormat.getPercentInstance();
		String result2 = percent.format(1);
		System.out.println(result2);
		//another method 
		String r = NumberFormat.getPercentInstance().format(0.2);
		System.out.println(r);
	}
}