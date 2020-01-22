import java.util.Scanner;

public class OddEvenTurnery {
    //Ans: 1. Input any TWO number and find out it is Odd or Even (Turnery Operator)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        String evenOdd = (num % 2 == 0)? "even number":"odd number";
        System.out.println(num + " is " + evenOdd );

    }
}
