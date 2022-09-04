package javaCodes;
import java.util.Scanner;
class convertDegreeCentigradeToFahrenheit  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //---------Code-----------//
        System.out.print("Ender Degree Centigrade: ");
        int degreeCentigrade = input.nextInt();
        System.out.println(((9*degreeCentigrade)/5)+32);
    }
}

  