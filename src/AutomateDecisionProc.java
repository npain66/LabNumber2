import java.util.Scanner;

/**
 *
 * Created by Nicole on 2/1/2017.
 */

public class AutomateDecisionProc  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //next assign scanner

        //Assigning Variable/String whats required
        int userCount = 1; //value text

        //User generates integers between 1 - 100 (inclusive)
        System.out.println("Enter Integers");
        userCount = scan.nextInt();

        //Generate integers output
        while (userCount == 1);

        if ((userCount % 2 == 1) && (userCount < 60)) {
            System.out.print("Odd");
        } else if ((userCount % 2 == 0) && (userCount >= 2) && (userCount <= 25)) {
            System.out.println("Even and less than 25");
        } else if ((userCount % 2 == 0) && (userCount > 26) && (userCount <= 26)) {
            System.out.println("Even");
        } else if ((userCount % 2 == 0) && (userCount >= 60)) {
            System.out.println("The number entered is Even");
        } else if ((userCount % 2 == 1) && (userCount > 60)) {
            System.out.println("The number entered and Odd");
        }else{
            System.out.println("Exit");

        }

        }
}










































