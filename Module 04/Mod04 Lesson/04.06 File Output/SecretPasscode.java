
/**
 * Randomly generate passwords.
 *
 * @author Jose Reynaldo
 * @version 11/23/22
 * 
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class SecretPasscode {
    public static void main(String[] args) throws IOException {
        String userChoice = "Y";
        int pwLength = 0;
        int randNum = 0;
        String password = "";

        // initialize scanner and print writer
        Scanner in = new Scanner(System.in);

        // construct an object called outFile to allow access to output methods of the
        // PrintWriter class
        PrintWriter outFile = new PrintWriter(new File("pass.txt"));

        System.out.println("**********************************************************");
        System.out.println(
                "Welcome to a simple password generator. \nThe password will include lowercase, uppercase, & numbers.");

        // the user wants to continue
        System.out.print("Enter a password Length ( 6 or more): ");
        int passLength = in.nextInt();

        while (passLength < 6) {
            System.out.println("Password length too short. Please try again.");
            System.out.print("Enter a password Length ( 6 or more): ");
            passLength = in.nextInt();

        }

        int randomNum;
        for (int i = 0; i < passLength; i++) {
            randomNum = (int) (Math.random() * 223) + 33;
            password += (char) randomNum;
        }
        outFile.println(password);

        outFile.close();
        // generate a random character in the correct character set

        // concatenate the character to the password

        // write the password to the file

        // when the user is done, close the text file so that it can be re-opened and
        // read

        // Read passwords back from text file and display to the screen

    }// end main
}// end class
