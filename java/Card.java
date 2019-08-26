public class Card {
    
    //static values for card suits
    public final static int SPADES = 0,      
                            HEARTS = 1,
                            DIAMONDS = 2,
                            CLUBS = 3;
    //static value for cards that have no value on them                            
    public final static int ACE = 1,         
                            JACK = 11,        
                            QUEEN = 12,      
                            KING = 13;
    
    //constants to hold suit and face value
    final int suit;
    final int value;
    
    /** class construtor insitialzing suid and value constatns */
    Card(int theSuit, int theValue){
        suit = theSuit;
        value = theValue;
    }
    
    /** return suit value */
    public int getSuit(){
        return suit;
    }
    
    /** return face value */
    public int getValue(){
        return value;
    }
    
    /** return suit as string */
    public String getSuitAsString(){
        switch(suit){
            case SPADES: 
                    return "Spades";                    
            case HEARTS: 
                    return "Hearts";                    
            case DIAMONDS: 
                    return "Diamonds";                             
            case CLUBS: 
                    return "Clubs";                    
            default:
                    return "????";
        }
           
    }
    
    /** return face value as string */
    public String getValueAsString(){
        switch(value){
            case ACE: 
                return "Ace";               
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return Integer.toString(value);                
            case JACK:
                return "Jack";
            case QUEEN:
                return "Queen";
            case KING: 
                 return "King";
            default:
                return "????";
        }   
    }
     
    /** overload toString method */
    public String toString(){
        return getValueAsString() + " of " + getSuitAsString();
    }
          
  }


