/**
 * 
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 * 
 * 
 * @ author Jose Reynaldo
 * 
 * @ version V6
 * 
 */

public class CalculationsV6 {

    public static void main(String[] args) {

        // Declare variables
        int iNum1 = 25;
        int iNum2 = 9;
        double dNum1 = 43.21;
        double dNum2 = 3.14;
        // Addition
        double dNum = (int) 38.78;
        System.out.print(dNum);

        System.out.println("Addition");
        System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
        System.out.println(dNum1 + " + " + dNum2 + " = " + (dNum1 + dNum2));
        System.out.println();

        // Declare variables
        int iNum3 = 11;
        int iNum4 = 9;
        int iNum5 = 25;
        double dNum3 = 3.14;
        double dNum4 = 10.0;

        // Subtraction

        System.out.println("Subtraction");
        System.out.println(iNum3 + " - " + iNum4 + " - " + iNum5 + " = " + (iNum3 - iNum4 - iNum5));
        System.out.println(dNum3 + " - " + dNum4 + " = " + (dNum3 - dNum4));
        System.out.println();

        // Declare variables
        int iNum6 = 25;
        int iNum7 = 9;
        double dNum5 = 3.14;
        double dNum6 = 10.0;

        // Multiplication

        System.out.println("Multiplication");
        System.out.println(iNum6 + " * " + iNum7 + " = " + (iNum6 * iNum7));
        System.out.println(dNum5 + " * " + dNum6 + " * " + dNum6 + " = " + (dNum5 * dNum6 * dNum6));
        System.out.println();

        // Declare variables
        double dNum7 = 43.21;
        // Division
        System.out.println("Division");
        System.out.println(iNum7 + " / " + iNum6 + " = " + (iNum7 / iNum6));
        System.out.println(dNum7 + " / " + dNum6 + " = " + (dNum7 / dNum6));
        System.out.println();

        // Declare variables
        double dNum8 = 3.14;
        // Modulus operator
        System.out.println("Modulus");
        System.out.println(iNum3 + " % " + iNum7 + " = " + (iNum3 % iNum7));
        System.out.println(dNum6 + " % " + dNum8 + " = " + (dNum6 % dNum8));
        System.out.println();

        // 1.08 Additional int Equations
        System.out.println("Additional int Equations");
        System.out.println(
                iNum3 + " % " + iNum7 + " * " + iNum2 + " + " + iNum6 + " = " + (iNum3 % iNum7 * iNum2 + iNum6));
        System.out.println();

        // 1.09 Additional double Equations
        System.out.println("Additional double Equations");
        System.out.println(
                dNum2 + " * " + dNum5 + " / " + dNum4 + " % " + dNum8 + " = " + (dNum2 * dNum5 / dNum4 % dNum8));

    }

}
