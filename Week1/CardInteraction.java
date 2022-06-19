/*
 * OOP Assignment 1
 * Contains methods for interaction with user
 */
import java.util.Scanner;
public class CardInteraction {
    private Scanner scanner;
    private CardOrder card;

    public CardInteraction() {
        scanner = new Scanner(System.in);
    }

    //runs the program as follows:
    //Gets details of card name from user
    //Displays card
    //Repeatedly, until user responds ok
    //	Asks the user if they would like to change the border
    //	If so, change the border and print the new card
    //Print the price of the order
    //print whether a discount is applicable or not
    public void run() {
        //Alter this gradually to add more details
        CardOrder order = new CardOrder(getNameFromUser());
        System.out.println("Here is a sample card: \n");
        System.out.print(order.getSampleCard());

        while(true) {
            System.out.print("Enter “OK” if this card is ok, otherwise enter an alternative border character: ");
            String character = scanner.nextLine();

            if (character.equals("OK"))
                break;
            else {
                order.setBorder(character.charAt(0));
                System.out.println();
                System.out.println("Here is a sample card:\n");
                System.out.println(order.getSampleCard());
            }
        }

        order.setNumCards(getNumberFromUser());
        System.out.print("The price of ");
        System.out.print(order.getNumCards());
        System.out.print(" cards is ");
        System.out.print((int) order.getFinalCost());
        System.out.println(" won.");

        if (order.hasDiscount()) {
            System.out.println("10% discount applied");
        } else {
            System.out.println("No discount given");
        }

    }

    //repeatedly requests and reads name from user
    //until valid (i.e. <=28 chars and contains at least one space
    //finally returns the valid text
    private String getNameFromUser() {
        //use this value until more code written

        System.out.print("Enter name: ");
        String str = scanner.nextLine();
        System.out.println();

        if(str.contains(" ") == false) {
            System.out.println("There is no blank in your name");
            return getNameFromUser();
        }

        if (str.length() > 28) {
            System.out.println("Please enter your name less than 29.");
            return getNameFromUser();
        }

        else
            return str;
    }

    //repeatedly requests and reads number from user
    //until valid number entered i.e. between 1 and 1000
    //finally returns the valid number
    private int getNumberFromUser() {
        //use this number until more code written

        System.out.println("How many cards would you like? ");
        int number = scanner.nextInt();
        System.out.println();

        if (number >= 1 && number <= 1000)
            return number;
        else {
            System.out.println("The number of cards must be in between 1 to 1000");
            return getNumberFromUser();
        }
    }


}
