//2017112071 김응관
package Week7.P2;

import java.util.*;

enum Suit {
    SPADES,
    HEARTS,
    CLUBS,
    DIAMONDS
}

class Card {
    public Card(Suit s, int n) {
        suit = s;
        if((n < 2) || (n > 14)) {
            throw new IllegalArgumentException( );
        }
        number = n;
    }

    public void print( ) {
        switch(number) {
            case 11:
                System.out.print("Jack");
                break;
            case 12:
                System.out.print("Queen");
                break;
            case 13:
                System.out.print("King");
                break;
            case 14:
                System.out.print("Ace");
                break;
            default:
                System.out.print(number);
                break;
        }
        System.out.print(" of ");
        switch(suit) {
            case SPADES:
                System.out.println("spades.");
                break;
            case HEARTS:
                System.out.println("hearts.");
                break;
            case CLUBS:
                System.out.println("clubs.");
                break;
            case DIAMONDS:
                System.out.println("diamonds.");
                break;
        }
    }
    private Suit suit;
    private int number;
}

class Deck {
    //생성자를 Private 접근지정자로 설
    private Deck( ) {
        cards = new ArrayList<Card>( );

        // build the deck
        Suit[] suits = {Suit.SPADES, Suit.HEARTS, Suit.CLUBS, Suit.DIAMONDS};
        for(Suit suit: suits) {
            for(int i = 2; i <= 14; i++) {
                cards.add(new Card(suit, i));
            }
        }

        // shuffle it!
        Collections.shuffle(cards, new Random( ));
    }

    public void print( ) {
        for(Card card: cards) {
            card.print( );
        }
    }
    //deck 객체를 return 해주는 getInstance 메소드를 public으로 선언하여 구현해주고,
    // 추후 멀티스레드 어플리케이션이 되었을 때 더블체크 로킹이 가능하게끔 synchronized 해
    public synchronized static Deck getInstance(){
        if(deck == null){
            deck = new Deck();
        }
        return deck;
    }

    private List<Card> cards;
    //deck 객체를 private 으로 선언해줌
    private static Deck deck = null;
}

public class SingletonExercise {
    public static void main(String args[]) {
        Deck deck = Deck.getInstance();
        deck.print( );
    }
}
