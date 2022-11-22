
/**
 * This program will determine the ticket price 
 * for carnival admission based off a set of questions
 * and generate an ID based off it. 
 *
 * @author Jose Reynaldo
 * @version 11/12/2022
 */
import java.util.Scanner;

public class CarnivalTickets {

    public static void printTicket(String name, String id, double price) {
        System.out.println("#############################################");
        System.out.println();
        System.out.println("Welcome to the APCS Carnival, " + name + "!");
        System.out.println("Your user ID is  " + id);
        System.out.println("The cost of your ticket is $" + price + ".");
        System.out.println("Have a great time at the APCS Carnival today!");
        System.out.println();
        System.out.println("#############################################");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Hello! Please input your name(First Last): ");
        String name = in.nextLine();

        System.out.print("How old are you? ");
        String askedAge = in.nextLine();
        int age = Integer.parseInt(askedAge);

        System.out.print("Are you a veteran(Y or N)? ");
        String veteran = in.nextLine();

        System.out.print("Are you a First Responder(Y or N)? ");
        String firstResponder = in.nextLine();

        System.out.println();
        System.out.println();

        Boolean discount = false;// if dicount is needeed
        if (firstResponder.equalsIgnoreCase("y") || veteran.equalsIgnoreCase("y")) {
            discount = true;
        }

        double ticketPrice;// figuering out ticket price w/o discount
        if (age < 3) {
            ticketPrice = 2;
        } else if (age < 6) {
            ticketPrice = 9;
        } else if (age < 18) {
            ticketPrice = 11;
        } else {
            ticketPrice = 12;
        }

        if (discount && age > 18) {
            ticketPrice *= .5;
        }

        int index = name.indexOf(" ") + 1;
        String id = name.substring(0, 1) + name.substring(index) + (int) (Math.random() * 1000);

        printTicket(name, id, ticketPrice);

    }
}
