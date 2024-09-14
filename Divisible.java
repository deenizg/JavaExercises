//twoThreeSix method containing conditionals that
// output (print to console) whether the parameter
// is divisible by two, three, and/or six.
import java.util.Scanner;


public class Divisible {

    public static void twoThreeSix(int a){
        boolean divisibleByTwo = ((a % 2) == 0);
        boolean divisibleByThree = ((a % 3) == 0);
  
        if(divisibleByTwo && !divisibleByThree){
            System.out.println(a + "is divisible by 2");
        } else if (divisibleByThree && !divisibleByTwo) {
            System.out.println(a + "is divisible by 2");
        } else if (divisibleByTwo && divisibleByThree) {
            System.out.println(a + "is divisible by 6");
        }

    }
   public static void main(String[] args){
    Scanner console = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int a = console.nextInt();
    twoThreeSix(a);
   }
    
}
