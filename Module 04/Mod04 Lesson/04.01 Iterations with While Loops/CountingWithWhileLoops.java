
/**
 * The purpose of this program is to illustrate the use of the
 * while loop as a counter.
 *
 * @author Charles Babbage
 * @version 06/05/17
 */
public class CountingWithWhileLoops {
    public static void main(String[] args) {
        // int counter = 43;
        // int theTerminator = 100; // initialize the terminating value

        // while (counter < theTerminator) // test the terminating condition
        // {
        // System.out.println("counter = " + counter);
        // counter--;
        // } // end of while loop

        int numOfStonesPicked = 0;

        int purpleStones = 0;

        int yellowStones = 0;

        while (numOfStonesPicked < 20) {
            numOfStonesPicked++;
            double randNum = Math.random();
            if (randNum < 0.4) {
                purpleStones++;

            } else {
                yellowStones++;
            }
        }
        System.out.println("You have " + purpleStones + " purple stones and " + yellowStones + " yellow stones");

    }// end of main method
}// end of class
