
/**
 * This program illustrates the use of the
 * AND logical operator to determine eligibility.
 *
 * @author Jose Reynaldo
 * @version 11/12/2022
 */
import java.util.Scanner;

public class TDEE {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Please enter your name:"); // ask for required info
        String name = in.nextLine();

        System.out.print("Please enter your BMR:");
        String bmr = in.nextLine();

        System.out.print("Please enter your gender (M/F): ");
        String gender = in.nextLine();

    }
}
