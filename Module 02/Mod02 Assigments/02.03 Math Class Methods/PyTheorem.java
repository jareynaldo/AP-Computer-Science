/**
 * The purpose of this project is to find the hypotenuse of two right triangles
 *
 * @author Jose Reynaldo
 * @version 09/26/22
 */
public class PyTheorem {

    public static void main(String[] args) {

        int howManyTimes = 2;

        for (int i = 0; i < howManyTimes; i++) {
            int currentTriangle = i + 1;
            int sideA = (int) (Math.random() * 18) + +5;
            int sideB = (int) (Math.random() * 18) + +5;

            double hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));

            System.out.println(
                    "Triangle " + currentTriangle + "\t" + "Side 1: " + sideA + "\t" + "Side 2: " + sideB + "\t"
                            + "Hypotenuse: " + hypotenuse);

        }
    }

}