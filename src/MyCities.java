import java.util.Scanner;

public class MyCities {
    //Ans 10: Find out A-F city name accordingly, And any other alphabet should be Invalid
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Letter");
        char city = scanner.next().charAt(0);
       switch (city) {
           case 'A' :
               System.out.println("Aurangabad");
               break;
           case 'B' :
               System.out.println("Bombay");
               break;
           case 'C' :
               System.out.println("Calcutta");
               break;
           case 'D' :
               System.out.println("Dubai");
               break;
           case 'E' :
               System.out.println("ElephantaCaves");
               break;
           case 'F' :
               System.out.println("Faridabad");
               break;

           default:
               System.out.println("Invalid Entry");

    }
}
}
