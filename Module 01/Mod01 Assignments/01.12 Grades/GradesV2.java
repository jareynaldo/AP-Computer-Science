
/**
 * this program that will calculate the total points and average grade each time
 * a new score is added to the total.
 * tickets sold and the amount of money received.
 * 
 * @author Jose Reynaldo
 * @version 09/11/2022
 */
public class GradesV2 {

    public static void main(String[] args) {
        // local variables
        int numTests = 0; // counts number of tests
        int testGrade = 0; // individual test grade
        int totalPoints = 0; // total points for all tests
        double average = 0.0; // average grade2

        int[] testScores = { 95, 73, 91, 82, 34, 73, 100, 76, 99 };

        for (int i = 0; i < testScores.length; i++) {
            numTests++;
            testGrade = testScores[i];
            totalPoints += testScores[i];
            average = ((double) totalPoints) / numTests;
            System.out.println("Test # " + numTests + "\t" + "Test Grade: " + testGrade + "\t" + "Total Points: "
                    + totalPoints + "\t" + "Average Scores: " + average);
        }

    }
}
