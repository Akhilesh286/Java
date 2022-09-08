import java.util.*;
import java.text.NumberFormat;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final byte month = 12;
		final byte percentage = 100;
		
		int principal = 0;
		while (true){
		System.out.print("Principal: ");
		principal= input.nextInt();
		if (principal>=1000 && principal<=1000000) {
		  break;
		}else {
		  System.out.println("Ender a number between 1k and 1M ");
		  continue;
		}
		}
		float AnnualIntrest = 0;
		while (true){
		  System.out.print("Annual Interest: ");
		  AnnualIntrest = input.nextFloat();
		  if (AnnualIntrest<=30){
		    break;
		  } else {
		    System.out.println("Ender a Number less than 30");
		  }
		}
		
		byte  period = 0;
		while (true){
		  System.out.print("Period: ");
		  period = input.nextByte();
		  if (period<=30){
		    break;
		  }else {
		    System.out.println("Ender a value between 0 and 30");
		  }
		}
		
		
		float monthlyIntrest = AnnualIntrest/percentage/month;
		int numberOfPayment = period*month;
		double mortgage= principal*monthlyIntrest*Math.pow(1+monthlyIntrest,numberOfPayment)/(Math.pow(1+monthlyIntrest,numberOfPayment)-1);
		
		//int hai = input.nextInt();
	
		System.out.println(NumberFormat.getCurrencyInstance().format(mortgage));
	}
}