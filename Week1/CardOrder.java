/**
 * OOP Assignment One
 * CardOrder class keeps details of one card order
 * and provides methods to print a card
 * and determine the price
 *
 */
public class CardOrder {
    private Name name;  	//the name printed on the card
    private char border;    //the card border
    private int numCards;   //the number of cards to be printed

    private static final int CARD_LEN = 32;  //the length of the card in characters

    //initialises name from value in parameter
    //and sets other instance variables to suitable default values
    //you can create a Name from a single string after L5
    //If you want to start before then

    //just write name = new Name("A", "B", "C") in the constructor!
    public CardOrder(String fullName) {
        numCards = 0;
        border = '*';

        String[] totalName = fullName.split(" "); //공백 단위로 이름을 F, M, L 이름 나눠서 배열 저

        if (totalName.length == 2)
            name = new Name(totalName[0], totalName[1]);
        else
            name = new Name(totalName[0], totalName[1], totalName[2]);
    }

    ///////////////////////////////////////////
    //accessor/mutator methods

    //returns the character used in the border
    public char getBorder() {
        return border;
    }

    //sets the character used in the border
    //to that provided in the parameter
    public void setBorder(char ch) {
        border = ch;
    }

    //returns the name
    public Name getName() {
        return name;
    }

    //sets the name used in the card
    //to that provided in the parameter
    public void setName(Name name) {
        this.name = name;
    }

    //returns the number of cards to be printed
    public int getNumCards() {
        return numCards;
    }

    //sets the number of cards to be printed
    //to that provided in the parameter
    public void setNumCards(int n) {
        numCards = n;
    }
    ///////////////////////////////////////////

    //returns a sample card, including a newline at the end of each line
    public String getSampleCard() {
        return getTopLine() + getBlankLine() + this.getLineWithName()
                + getBlankLine() + getTopLine();
    }

    //returns a String containing the top or bottom line
    //of a card, including a newline character at the end
    private String getTopLine() {
        //use this value until more code written
        String top = "";
        top += name.getInits();

        for(int i = 0; i < CARD_LEN - (name.getInits().length() * 2); i++) {
            top += getBorder();
        }
        top += name.getInits();
        top += "\n";

        return top;
    }

    //returns a String containing the blank line
    //of a card, with a border char at each end
    //and including the newline character
    private String getBlankLine() {
        //use this value until more code written

        String blank = "";
        blank += getBorder();

        for (int i = 0; i < CARD_LEN - 2; i++)
            blank += " ";
        blank += getBorder();
        blank += "\n";

        return blank;
    }

    //returns a String containing the name line
    //of a card, including name, padding and border
    //and including the newline character
    private String getLineWithName() {
        //use this value until more code written
        String mid = "";
        int numblank = CARD_LEN - (name.getFullName().length()) - 2;
        mid += getBorder();

        for (int i = 0; i < numblank; i++) {
            if (i == numblank / 2){
                if ((name.getFullName().length() % 2) != 0) {
                    mid += " ";
                    i++;
                }
                mid += name.getFullName();
            }
            mid += " ";
        }
        mid += getBorder();
        mid += "\n";
        return mid;
    }

    //returns the price of one card
    //in pounds (i,e either 0.20 or 0.25)
    //based on the number of characters in the name to be printed
    //0.20 if <=12 otherwise 0.25
    public double getCardPrice() {
        //use this value until more code written
        return name.getFullName().length() <= 12 ? 40 : 50;
    }

    //returns the final cost of the order
    //which is the number of cards multiplied by the card price
    //and reduced by 10% if >= 100 cards
    public double getFinalCost() {
        //use this value until more code written
        return hasDiscount() ? getNumCards() * getCardPrice() * 0.9 : getNumCards() * getCardPrice();
    }

    //returns true if number of cards < 100, false otherwise
    public boolean hasDiscount() {
        return numCards >= 200;
    }
}
