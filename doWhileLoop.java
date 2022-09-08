import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		String Input = "";
		do {
		  System.out.print("input: ");
		  Input = input.next().toLowerCase();
		  System.out.println(Input);
		}while (!Input.equals("q"));
	}
}