package javaCodes;
import java.util.Scanner;
class oddOrEven  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //---------Code-----------//
        System.out.println("ender a number: ");
        int number = input.nextInt();
        if (number%2 == 0){
          System.out.println("number is even");
        }else {
          System.out.println("number is odd");
        }
    }
}

  