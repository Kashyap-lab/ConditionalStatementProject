import java.util.Scanner;

public class VottingEligibility {
    //Ans 11. Voters should be eligible to vote older than or equal to 18 years old
    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.print("What is your age?");
        age=sc.nextInt();
        if(age>=18)
            System.out.println("Congratulations You are eligible to vote.");
        else
            System.out.println("Sorry You are not eligible to vote.");
    }
}
