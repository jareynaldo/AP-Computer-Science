/**
 * 
 * @author Jose Reynaldo
 * @date 06/01/2023
 * 
 *       This is a cool math trick!
 *       (or a funny one actually)
 *
 */

public class MathTrick {

	public static int getRandomNum() { // getting the firt random numd
		int num = 0;
		int firstDigit = 0;
		int lastDigit = 0;

		do {
			num = (int) (Math.random() * 900 + 100);

			firstDigit = num / 100;
			lastDigit = num % 10;

		} while (Math.abs(firstDigit - lastDigit) < 2);
		return num;
	}

	public static int reverseDigits(int num) { // reversing the digits in a int
		int reverse = 0;
		while (num > 0) {
			reverse = (reverse * 10) + (num % 10);
			num /= 10;
		}
		return reverse;

	}

	public static String replaceLtr(String str) { // replacing characters accoring to the chart
		str = str.replace('0', 'Y');
		str = str.replace('1', 'M');
		str = str.replace('2', 'P');
		str = str.replace('3', 'L');
		str = str.replace('4', 'R');
		str = str.replace('5', 'O');
		str = str.replace('6', 'F');
		str = str.replace('7', 'A');
		str = str.replace('8', 'I');
		str = str.replace('9', 'B');

		return str;
	}

	public static String reverseString(String str) { // reversing the string

		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.substring(i, i + 1);
		}
		return reverse;
	}

	public static void main(String[] args) {
		// 1. Generate a random 3-digit number so that the first and third digits differ
		// by more than one.
		int num1 = getRandomNum();
		System.out.println("1. The starting number is: " + num1);

		// 2. Now reverse the digits to form a second number.
		int num2 = reverseDigits(num1);
		System.out.println("2. The reversed number is: " + num2);

		// 3. Subtract the smaller number from the larger one.
		int num3 = Math.abs(num2 - num1);
		System.out.println("3. The difference is: " + num3);

		// 4. Now reverse the digits in the answer you got in step 3 and add it to that
		// number.
		int num4 = reverseDigits(num3) + num3;
		System.out.println("4. The reversed number added to the difference: " + num4);

		// 5. Multiply by one million.
		num4 *= 1000000;
		System.out.println("5. Number x one million: " + num4);

		// 6. Subtract 733,361,573.
		num4 -= 733361573;

		// 7. Convert the number to a string in order to replace the numbers with
		// letters.
		// Ex: String str = String.valueOf(myNumber);
		// Then, replace each of the digits in your answer, with the letter it
		// corresponds to using the table in the instructions.

		String str = String.valueOf(num4);
		System.out.println("6. Number substracted and convereted to a String: " + str);

		str = replaceLtr(str);
		System.out.println("7. Replaced string: " + str);
		// 8. Now reverse the letters in the string to read your message backward.

		str = reverseString(str);
		System.out.println("8. Reversed string: " + str);

	}
}