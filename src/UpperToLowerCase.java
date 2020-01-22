import java.util.Scanner;

public class UpperToLowerCase {

            public static void main(String[] args) {
                //Ans 12: Input any alphabet in uppercase and print it in lowercase
            Scanner sc = new Scanner( System.in );
            char ch;
            int temp;
            System.out.println("Enter any character in UPPERCASE");
            ch=sc.next().charAt( 0);
            temp=(int)ch;
            temp=temp+32;
            ch=(char)temp;
            System.out.println("Lower case is:" +ch);
        }
}
