import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		int [] numbers = new int[5];
		numbers[0] = 1;
		numbers[2] = 2;
		System.out.println(numbers);
		System.out.println(Arrays.toString(numbers));
		// new
		 
		int [] numbers2 = {2,4,1,6};
		Arrays.sort(numbers2);
		System.out.println(numbers2);
		System.out.println(numbers2.length);
		
		
		
	}
}