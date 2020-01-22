import java.util.Scanner;

public class LeapYear {
    //Ans 2: Find out entered Year is Leap Year or not
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter any Year ");
        int year = scanner.nextInt();
        if (year%4 == 0)
        {
            System.out.println("Year " + year+ " is a leap year");
            }
        else
        {
            System.out.println("Year " + year+ " is not a leap year");
        }
    }

}
