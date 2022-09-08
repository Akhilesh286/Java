import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int i=1;
		while (i>0){
		  System.out.println(i);
		  i--;
		}
		Scanner input =new Scanner(System.in);
		String Input = "";
		while (!Input.equals("q")){
		  System.out.print("Input: ");
		  Input=input.next().toLowerCase();
		}
	}
}