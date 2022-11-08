
/**
 * This program illustrates the use of the if-else-if structure 
 * and determines a student's letter grade based on an average.
 *
 * @author George Boole
 * @version 06/04/17
 */
import java.util.Scanner;

public class BMI {

    public static double shortenInt(double x) {
        int temp = (int) (x * 100.0);
        double shortDouble = ((double) temp) / 100.0;
        return shortDouble;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Gather input
        System.out.println("Please enter your name (first last):");
        String fullName = in.nextLine();
        // String lastName = in.nextLine();

        System.out.println("Please enter your weight in pounds:");
        int weightInAmerican = in.nextInt();
        double weight = weightInAmerican * 0.453592;

        System.out.println("Please enter your height in feet and inches (6 2):");
        int heightInFeet = in.nextInt();
        int heightInInInchest = in.nextInt();
        double heightInAmerican = heightInInInchest + (12 * heightInFeet);

        double inRestOfWorld = heightInAmerican * 0.0254;

        double BMI = weight / (inRestOfWorld * inRestOfWorld);

        double heightInMeters = shortenInt(inRestOfWorld);
        double publishableBMI = shortenInt(BMI);
        double publishableWeight = shortenInt(weight);

        String catagory = "";
        if (BMI >= 29.9)
            catagory = "Obese";
        else if (BMI >= 25 && BMI <= 29.9)
            catagory = "Overweight";
        else if (BMI >= 18.5 && BMI <= 24.9)
            catagory = "Normal or Healthy Weight";
        else
            catagory = "Underweight";

        System.out.println("Body Mass Index Calculator");
        System.out.println("==========================");

        System.out.println("Name: " + fullName);
        System.out.println("Height (m): " + heightInMeters);
        System.out.println("Weight ()Kg: " + publishableWeight);
        System.out.println("BMI: " + publishableBMI);
        System.out.println("Catagory: " + catagory);

    }
}
