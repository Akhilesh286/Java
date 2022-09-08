import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		byte age = input.nextByte();
		System.out.println("Age:"+age);
		System.out.print("  Name:- ");
		String name = input.next();
		System.out.println("  Name:"+name);
		System.out.print("   Name2 :");
		String name2 = input.nextLine();
		System.out.println("Name : "+name2);
		
	}
}