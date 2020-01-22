import java.util.Scanner;

public class InterchangedValue {

         //Ans 5: Input any two no's. and then print to their Interchange value
        public static void main(String[] args) {
            int a,b,c;
            Scanner in = new Scanner(System.in);
            System.out.println("Input the first number:" );
            a = in.nextInt();
            System.out.println("Input the second number:");
            b = in.nextInt();

            c = a;
            a = b;
            b = c;

            System.out.println(" Interchanged values area: " + a + " and " + b);
        }
        }
