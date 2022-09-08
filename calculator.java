import java.util.*;
import java.text.NumberFormat;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final byte month = 12;
		final byte percentage = 100;
		System.out.print("Principal: ");
		int principal= input.nextInt();
		System.out.print("Annual Interest: ");
		float AnnualIntrest = input.nextFloat();
		System.out.print("Period: ");
		byte period = input.nextByte();
		float monthlyIntrest = AnnualIntrest/percentage/month;
		int numberOfPayment = period*month;
		double mortgage= principal*monthlyIntrest*Math.pow(1+monthlyIntrest,numberOfPayment)/(Math.pow(1+monthlyIntrest,numberOfPayment)-1);
		
		//int hai = input.nextInt();
	
		System.out.println(NumberFormat.getCurrencyInstance().format(mortgage));
	}
}