
/**
 * The purpose of this program is to read data from
 * an input file.
 *
 * @author Charles Babbage
 * @version 06/05/17
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Family {
    public static void main(String[] args) throws IOException {

        String token = "";
        String strToken;
        File fileName = new File("data3.txt");
        Scanner inFile = new Scanner(fileName);
        int numOfFams;

        int twoBoys = 0;
        int twoGirls = 0;
        int oneEach = 0;

        // while loop will continue while inFile has a next token to read
        while (inFile.hasNext()) {
            strToken = inFile.nextInt(); // read next token from file\

            if (strToken.equals("BB")) {
                twoBoys++;
            } else if (strToken.equals("GG")) {
                twoGirls++;
            } else {
                oneEach++;
            }
            numOfFams++;
        } // end while

        System.out.println("Total Number of families "
                + numOfFams);
        System.out.println();

        System.out.println("Number of familes with: ");
        System.out.println("2 Boys: " + twoBoys +
                "\t reprecents "
                + percentTwoBoys +
                "%");
        System.out.println("2 Girls: " + twoGirls +
                "\t reprecents "
                + percentTwoGirls +
                "%");
        System.out.println("1 boy and 1 girl: "
                + oneEach +
                "\t reprecents "
                + percentOneEach +
                "%");

        inFile.close(); // close input file

    }
}
