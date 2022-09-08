import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		//break
		Scanner input =new Scanner(System.in);
		String Input = "";
		while (!Input.equals("q")){
		  System.out.print("Input: ");
		  Input=input.next().toLowerCase();
		  if (Input.equals("q")) {
		    break;
		  }
		  System.out.println(Input);
		}
		//Scanner input =new Scanner(System.in);
		String Input2 = "";
		while (true){
		  System.out.print("Input: ");
		  Input2=input.next().toLowerCase();
		  if (Input2.equals("pass")) {
		    continue;
		  }
		  System.out.println(Input);
	}
}
}