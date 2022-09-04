package javaCodes;
import java.util.Scanner;
class average  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //---------Code-----------//
        System.out.print("ender how many number you have: ");
        int howManyNumbers = input.nextInt();
        float total = 0;
        for (int i = 0; i<howManyNumbers;i++){
          System.out.print("ender Numbers: ");
          int Numbers = input.nextInt();
          total = total+Numbers;
        }
        System.out.println(total/howManyNumbers);
    }
}

  