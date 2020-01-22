import java.util.Scanner;

public class AverageNumber {
    //Ans 7. Input any Five number and then find out Average of Five Numbers
    public static void main(String[] args) { // main method
        double Number1, Number2, Number3, Number4, Number5; // with the specific double object
        Scanner scanner = new Scanner(System.in); // method to get input from user
        System.out.println("Enter the Number 1"); // print result enter the value of number 1
        Number1 = scanner.nextInt(); // store input from user
        System.out.println("Enter the Number 2"); // print result enter the value of number 2
        Number2 = scanner.nextInt(); // store input from user
        System.out.println("Enter the Number 3"); // print result enter the value of number 3
        Number3 = scanner.nextInt(); // store input from user
        System.out.println("Enter the Number 4"); // print result enter the value of number 4
        Number4 = scanner.nextInt(); // store input from user
        System.out.println("Enter the Number 5"); // print result enter the value of number 5
        Number5 = scanner.nextInt(); // store input from user
        System.out.println("Average of the Number is = "+ (Number1 + Number2 + Number3 + Number4 + Number5)/5);
                // print result average of total 5 Numbers
    }

}
