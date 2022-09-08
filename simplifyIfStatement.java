public class Main {
	public static void main(String[] args) {
		int income=120_000;
		boolean hasHighIncome = false;
		if (income>100_000){
		  hasHighIncome = true;
		};
		System.out.println(hasHighIncome);
		//or 
		boolean hasHighIncome2 = (income>100_000);
		System.out.println(hasHighIncome2);
		
	}
}