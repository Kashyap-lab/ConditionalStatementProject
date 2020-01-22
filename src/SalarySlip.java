import java.util.Scanner;

        public class SalarySlip {
            //Ans 6: Input Employ ID, Name, Basic Salary, then find HRA, TA, DA, PF and Gross Salary
        public static void main(String[] args) {
            Scanner scanner =new Scanner(System.in);
            System.out.println( "Enter employee id =");
            int id =scanner.nextInt();
            System.out.println( "Enter employee name =");
            String name =scanner.next();
            System.out.println( "Enter employee salary =");
            int salary =scanner.nextInt();
            System.out.print("HRA = " );
            System.out.println( salary*10/100);
            System.out.print("DA = " );
            System.out.println(salary*8/100);
            System.out.print( "TA = ");
            System.out.println( salary*9/100);
            System.out.print( "PF = " );
            System.out.println( salary*20/100);
            System.out.print( "Gross salary =");
            System.out.println(salary +(salary*10/100)+(salary*8/100)+(salary*9/100)-(salary*20/100));
        }
        }
