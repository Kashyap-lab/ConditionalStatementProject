import java.util.Scanner;

public class StudentMarksheet2 {
    //Ans 4: Input students Name, Roll No., 3 Subjects marks and need to find out Pass in all the subjects
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Name");
        String name = scanner.next();
        System.out.println("Enter Roll Number");
        String RollNumber = scanner.next();
        System.out.println("Enter Maths Marks");
        int Maths = scanner.nextInt();
        System.out.println("Enter English Marks");
        int English = scanner.nextInt();
        System.out.println("Enter Science Marks");
        int Science = scanner.nextInt();
        System.out.println("Total Marks");
        System.out.println(Maths + English + Science);
        if (Maths < 35 || Science < 35 || English < 35) {
            System.out.println("Fail");
        } else {
            System.out.println("Pass");
        }

    }
}
