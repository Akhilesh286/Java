import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		int[][] numbers = new int[2][3];
		numbers[0][0] = 1;
		numbers[0][1] = 4;
		System.out.println(Arrays.deepToString(numbers));
		// in {}
		int [][] number = {{1,3,4},{2,5,6}};
		System.out.println(Arrays.deepToString(number));
		
	}
}