import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;

/** card bet class */
public class JBetCard extends JApplet implements ActionListener{
    //inializing buttons
    JButton highBn1 = new JButton("$5 Higher");
    JButton highBn2 = new JButton("$10 Higher");
    JButton lowBn1 = new JButton("$5 Lower");   
    JButton lowBn2 = new JButton("$10 Lower");
    JButton okBn = new JButton("OK");
    JPanel topLayer = new JPanel();
      
    //initializing labels        
    JLabel titleLbl = new JLabel("** Bet the Card **");
    JLabel humanLbl = new JLabel();
    JLabel cpuLbl = new JLabel();
    JLabel resultLbl = new JLabel("staring with $10");
    JLabel statLbl = new JLabel("");
    
    //declaring a container to hold JFRAME contentpane
    Container con = getContentPane();
    
    //initialize new card dec
    Deck deck = new Deck();
    //varibles hold value of cpu and human card
    Card cpuCard, humanCard;
    
    //using number format to output currency
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    
    //static constants of values of high and low bet
    static final int HIGH_BET = 10;
    static final int LOW_BET = 5;
    //initial score you the player starts off with
    int score = 10;
    
    /** initialzing game */
    public void init(){        
        //shuffle cards
        deck.shuffle();
        //deal cpu the first card
        cpuCard = deck.dealCard();
        //setting componet specs
        cpuLbl.setText("Computer: " + cpuCard);
        titleLbl.setFont(new Font("Garmmond", Font.BOLD, 24));
        cpuLbl.setFont(new Font("Arial", Font.BOLD, 12));
        humanLbl.setFont(new Font("Arial", Font.BOLD, 12)); 
        highBn1.addActionListener(this);
        highBn2.addActionListener(this);
        lowBn1.addActionListener(this);
        lowBn2.addActionListener(this);
        okBn.addActionListener(this);
        okBn.setEnabled(false);
        topLayer.add(titleLbl);
        topLayer.add(cpuLbl);
	  con.add(topLayer);
        con.add(highBn1);
        con.add(highBn2);
        con.add(lowBn1);
        con.add(lowBn2);
        con.add(humanLbl);
        con.add(resultLbl);
        con.add(okBn);
        con.add(statLbl);
        con.setLayout(new FlowLayout());  
    }
    
    /** actions performed */
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        //bet 5 dollars for higher
        if(source == highBn1){
            humanCard = deck.dealCard();
            humanLbl.setText("Your card: " + humanCard);
            EnableDisableChoices(false);
            if(humanCard.getValue() < cpuCard.getValue())
                score -= LOW_BET;
            else if(humanCard.getValue() > cpuCard.getValue())
                score += LOW_BET;
            else
                score -= LOW_BET;
            resultLbl.setText("Your new total is " + nf.format(score));
            okBn.setEnabled(true);
            gameStatus();     
        }
        //bet 10 dollars for higher
        if(source == highBn2){
            humanCard = deck.dealCard();
            humanLbl.setText("Your card: " + humanCard);
            EnableDisableChoices(false);
            if(humanCard.getValue() < cpuCard.getValue())
                score -= HIGH_BET;
            else if(humanCard.getValue() > cpuCard.getValue())
                score += HIGH_BET;
            else
                score -= HIGH_BET;
            resultLbl.setText("Your new total is " + nf.format(score));
            okBn.setEnabled(true);            
            gameStatus();     
        }        
        //bet 5 dollars for lower
        if(source == lowBn1){
            humanCard = deck.dealCard();
            humanLbl.setText("Your card: " + humanCard);
            EnableDisableChoices(false);
            if(humanCard.getValue() > cpuCard.getValue())
                score -= LOW_BET;
            else if(humanCard.getValue() < cpuCard.getValue())
                score += LOW_BET;
            else
                score -= LOW_BET;
            resultLbl.setText("Your new total is " + nf.format(score));
            okBn.setEnabled(true);            
            gameStatus();     
        }    
        //bet 10 dollars for lower
        if(source == lowBn2){
            humanCard = deck.dealCard();
            humanLbl.setText("Your card: " + humanCard);
            EnableDisableChoices(false);
            if(humanCard.getValue() > cpuCard.getValue())
                score -= HIGH_BET;
            else if(humanCard.getValue() < cpuCard.getValue())
                score += HIGH_BET;
            else
                score -= HIGH_BET;
            resultLbl.setText("Your new total is " + nf.format(score));
            okBn.setEnabled(true);            
            gameStatus();     
        }   
        
        if(source == okBn){
            cpuCard = deck.dealCard();
            //if the card comes back null there are no more card left in the deck. Notify the user that its a draw game
            if(cpuCard == null){
                EnableDisableChoices(false);
                okBn.setEnabled(false);
                JOptionPane.showMessageDialog(null,"There are no more cards left\n        draw game");
            }
            else{
                cpuLbl.setText("Next computer card: " + cpuCard);
                humanLbl.setText("");
                EnableDisableChoices(true);
                okBn.setEnabled(false);
            }
        }
        
    }
    
    /** enabled or disable bet buttons */
    public void EnableDisableChoices(boolean choice){     
            highBn1.setEnabled(choice);
            highBn2.setEnabled(choice);
            lowBn1.setEnabled(choice);
            lowBn2.setEnabled(choice);        
    }
    
    /** check game status for winner or loser */
    public void gameStatus(){
        if(score <= 0){
            statLbl.setText("You lose!");
            EnableDisableChoices(false);
            okBn.setEnabled(false);
        }
        else if(score >= 100){
            statLbl.setText("You Win!");
            EnableDisableChoices(false);
            okBn.setEnabled(false);
        }
        else{            
            statLbl.setText("");                   
        }
   }

}
