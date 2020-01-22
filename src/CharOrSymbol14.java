import java.util.Scanner;

public class CharOrSymbol14 {
    // Ans 13: Input any two no and ask user to enter their Symbol (+,-,/,*)
    // and find addition,subtraction,multiplication, & division
    public static void main(String [] args )    { // main method
        Scanner scanner=new Scanner(System.in); //method to get input from user
        System.out.print("please enter any character "); // statement asking user to input
        char char1 =scanner.next().charAt(0); // store value for users input
        if((char1>=48 && char1<=57) || char1 == 45) { // condition if input is digit
            System.out.println("char is Digit");  // print result if input is digit
        }
        else if((char1>='a' && char1<='z')||(char1>='A' && char1<='Z')) {  // condition if input is Alphabet
            System.out.println("char is Alphabet"); //print result if input is Alphabet
        }
        else {
            System.out.println("char is special character"); //print result if input is Special character e.g. &,£,$ etc
        }
    }
}
