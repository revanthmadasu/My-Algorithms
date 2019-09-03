import java.util.Random;
import javax.swing.JOptionPane;

public class Deck {
    
    //array to hold a deck of cards
    Card[] deck;
    
    //keep track of card position
    int currentCard;
    
    //static constants with max values of cards suit value and total amount of cards in deck
    static final int SUIT_MAX = 4;
    static final int VALUE_MAX = 13;
    static final int TOTAL_OF_CARDS = 52;
    Random rand;
    
    /** initializing Deck */
    Deck(){        
        int count = 0;
        currentCard = 0;
        deck = new Card[TOTAL_OF_CARDS];
        for(int x = 0; x < SUIT_MAX; x++)        
            for(int y = 0; y < VALUE_MAX; y++)
               deck[count++] = new Card(x, y + 1);
            
     }
    
    /** shuffle the deck 
     * note you could also use Collections.Shuffle and ArrayList.asList together to perform a shuffle on a array          *                                                                                                                  */     
    public void shuffle(){
        rand = new Random();
        Card tempDeck;
        int first = 0;
        currentCard = 0;
        for(int x = 0; x < TOTAL_OF_CARDS; x++){            
            first = rand.nextInt(TOTAL_OF_CARDS);
            tempDeck = deck[x];
            deck[x] = deck[first];
            deck[first] = tempDeck;
        }
                
    }    
    
    /** deal card out the deck */
    public Card dealCard(){
        //if there is no more card display error and return null else deal card
        if(currentCard >= TOTAL_OF_CARDS){
            JOptionPane.showMessageDialog(null, "There are no more cards left in the deck", "Error", JOptionPane.ERROR_MESSAGE);  
            return null;
        }
        else{                              
            return deck[currentCard++];
        }
    }
    
    

}

