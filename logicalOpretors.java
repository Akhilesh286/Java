public class Main {
	public static void main(String[] args) {
		int temperature=22;
		boolean isWarm = temperature<30;
		System.out.println(isWarm);
		boolean hasHighIncome = true;
		boolean hasGoodCredit = true;
		boolean isEligible = hasHighIncome || hasGoodCredit;
		System.out.println(isEligible);
		boolean hasCrimianlRecord = false;
		isEligible = (hasHighIncome || hasGoodCredit) && !hasCrimianlRecord;
		System.out.println(isEligible);
	}
}