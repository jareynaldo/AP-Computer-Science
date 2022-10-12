import java.util.Scanner;

public class trying {
    public static void main(String[] args) {
        String phone = "407-555-3326";
        int indexOfDash = phone.indexOf("-");
        String newPhone = "(" + phone.substring(0, indexOfDash) + ")" + phone.substring(indexOfDash + 1);
        System.out.println(newPhone);
        System.out.println();

        String number = "4075553326";
        String pt1 = number.substring(0, 3);
        String pt2 = number.substring(3, 6);
        String pt3 = number.substring(6);
        String newNum = pt1 + "." + pt2 + "." + pt3;
        System.out.println(newNum);

        String str = "Shakespeare";
        System.out.println(str.substring(2, 6));

        String name = "Christopher Marlowe";
        int x = name.indexOf("t") / 3;
        String yesnan = name.substring(x, x + 3);
        System.out.println(yesnan);

        String oldString = "Programming";
        System.out.println(oldString.indexOf("g"));

    }
}
