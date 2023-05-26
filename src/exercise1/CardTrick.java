package exercise1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Tariq Sekhri 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
             hand[i] = new Card();
             hand[i].setValue((int)(Math.random()*12)+1);
         
             hand[i].setSuit(Card.SUITS[(int)(Math.random()*4)]);
            
        }

        // insert code to ask the user for Card value and suit, create their card
        ArrayList<String> userGuess = new ArrayList<String>();
        for (int i = 0; i < hand.length; i++) {
            System.out.println("enter the Card value and suit you want to guess");
            System.out.println("1-13 Hearts/Diamonds/Spades/Clubs");
            userGuess.add(in.nextLine());
        }
        
        // and search the hand here. 
        
        for (int i = 0; i < hand.length; i++) {
            for (int j = 0; j < hand.length; j++) {
                if(userGuess.get(j).equals(hand[i].getValue()+" "+hand[i].getSuit())){
                    printInfo();
                }
            }
        }
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
        System.out.println("im done");
    
        System.out.println("Congratulations, you guessed right!\n");
      
        
        System.out.println("My name is Tariq, but you can call me you there, Student or sir\n");
       
        
        System.out.println("My career ambitions:");
        System.out.println("-- make money");
        System.out.println("-- make cool things with coding");
	System.out.println("-- have fun");	

        System.out.println("My hobbies:");
        System.out.println("-- coding");
        System.out.println("-- gaming");
        System.out.println("-- Watching TV");
        System.out.println("-- learning");

        System.out.println();
        
    
    }

}
