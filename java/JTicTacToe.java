/**
 *
 * @author Jerome.Scott
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

/** tic tac toe applet class */
public class JTicTacToe extends JApplet implements ActionListener
{
	  // Variables declaration
     	  private JLabel titleLbl;
     	  private JLabel directionLbl;
        private JLabel resultLbl;
        private JButton bn[][] = new JButton[3][3];
 	  private JPanel contentPane;
        private Random rand = new Random();
        private final String X = "X";
        private final String O = "O";
        private boolean turn = true;

	// End of variables declaration

	/** initialize components */
	public void init()
	{
		initializeComponent();
	}

      /** method to initilize components */
	private void initializeComponent()
	{
		titleLbl = new JLabel();
		directionLbl = new JLabel();
                
                //bn[][]
                for(int x = 0; x < 3; x++)
                    for(int y = 0; y < 3; y++){
                        bn[x][y] = new JButton();
                        bn[x][y].setFont(new Font("Garrmond", Font.BOLD, 24));
                        bn[x][y].addActionListener(this);
                    }
		contentPane = (JPanel)this.getContentPane();

		//
		// titleLbl
		//
		titleLbl.setText("Tic Tac Toe");
                titleLbl.setFont(new Font("Garmmond",Font.BOLD,30));
		//
		// directionLbl
		//
		directionLbl.setText("Choose One Button");
                directionLbl.setFont(new Font("Garmmond", Font.BOLD, 18));
		//
		// resultLbl
		//
                    resultLbl = new JLabel();
		//
		// contentPane
		//
		contentPane.setLayout(null);
		addComponent(contentPane, titleLbl, 59,13,346,32);
		addComponent(contentPane, directionLbl, 55,69,354,28);
		addComponent(contentPane, bn[0][0], 31,105,70,35);
		addComponent(contentPane, bn[0][1], 112,105,70,34);
		addComponent(contentPane, bn[0][2], 193,105,70,35);
		addComponent(contentPane, bn[1][0], 31,146,70,35);
		addComponent(contentPane, bn[1][1], 112,146,70,35);
		addComponent(contentPane, bn[1][2], 193,146,70,35);
		addComponent(contentPane, bn[2][0], 31,189,70,35);
		addComponent(contentPane, bn[2][1], 112,189,70,35);
                addComponent(contentPane, bn[2][2], 193,189, 70,35);
                addComponent(contentPane, resultLbl, 94, 272,251,28);

        }
	/** Add Component Without a Layout Manager (Absolute Positioning) */
	private void addComponent(Container container,Component c,int x,int y,int width,int height)
	{
		c.setBounds(x,y,width,height);
		container.add(c);
	}
        /** checks and balances on game plays */
        public void actionPerformed(ActionEvent e){
            Object source = e.getSource();
            if (source == bn[0][0]){
                if( (turn == true) && (bn[0][0].getText().equals("")) ){
                    bn[0][0].setText(X);
                    turn = false;
                    gameStatus();                    
                    cpuMove();
                }
                                               
            }
            if (source == bn[0][1]){
                if( (turn == true) && (bn[0][1].getText().equals("")) ){
                    bn[0][1].setText(X);
                    turn = false;
                    gameStatus();                    
                    cpuMove();                    
                }           
                                             
            }
            if (source == bn[0][2]){
                if( (turn == true) && (bn[0][2].getText().equals("")) ){
                    bn[0][2].setText(X);
                    turn = false;
                    gameStatus();                    
                    cpuMove();                   
                }
                                                 
            }
            if (source == bn[1][0]){
                if( (turn == true) && (bn[1][0].getText().equals("")) ){
                    bn[1][0].setText(X);
                    turn = false;
                    gameStatus();                    
                    cpuMove();                    
                }
                               
            }            
            if (source == bn[1][1]){
                if( (turn == true) && (bn[1][1].getText().equals("")) ){
                    bn[1][1].setText(X);
                    turn = false;
                    gameStatus();                    
                    cpuMove();
                }
                              
            }                           
            if (source == bn[1][2]){
                if( (turn == true) && (bn[1][2].getText().equals("")) ){
                    bn[1][2].setText(X);
                    turn = false;
                    gameStatus();                    
                    cpuMove();
                }
                                            
            }                
            if (source == bn[2][0]){
                if( (turn == true) && (bn[2][0].getText().equals("")) ){
                    bn[2][0].setText(X);
                    turn = false;
                    gameStatus();                    
                    cpuMove();
                }
                                            
            }
            if (source == bn[2][1]){
                if( (turn == true) && (bn[2][1].getText().equals("")) ){
                    bn[2][1].setText(X);
                    turn = false;
                    gameStatus();                    
                    cpuMove();
                }
                                               
            }
            if (source == bn[2][2]){
                if( (turn == true) && (bn[2][2].getText().equals("")) ){
                    bn[2][2].setText(X);
                    turn = false;
                    gameStatus();                    
                    cpuMove();
                }
                                              
            }    
        }    
        
        /** check for wins or tie */
        public void gameStatus(){
            //horizontal wins
            if( (bn[0][0].getText() == X) && (bn[0][1].getText() == X) && (bn[0][2].getText() == X) ){
                resultLbl.setText("Game over! You Win!");
                disableGame();
                return;
            }
             if( (bn[0][0].getText() == O) && (bn[0][1].getText() == O) && (bn[0][2].getText() == O) ){
                resultLbl.setText("Game over! You Lose!");
                disableGame();
                return;
            }
             if( (bn[1][0].getText() == O) && (bn[1][1].getText() == O) && (bn[1][2].getText() == O) ){
                resultLbl.setText("Game over! You Lose!");
                disableGame();
                return;
            } 
             if( (bn[1][0].getText() == X) && (bn[1][1].getText() == X) && (bn[1][2].getText() == X) ){
                resultLbl.setText("Game over! You Win!");
                disableGame();
                return;
            }            
             if( (bn[2][0].getText() == X) && (bn[2][1].getText() == X) && (bn[2][2].getText() == X) ){
                resultLbl.setText("Game over! You Win!");
                disableGame();
                return;
            }   
             if( (bn[2][0].getText() == O) && (bn[2][1].getText() == O) && (bn[2][2].getText() == O) ){
                resultLbl.setText("Game over! You Lose!");
                disableGame();
                return;
            }   
            //virtical wins
             if( (bn[0][0].getText() == X) && (bn[1][0].getText() == X) && (bn[2][0].getText() == X) ){
                resultLbl.setText("Game over! You Win!");
                disableGame();
                return;
            }               
             if( (bn[0][0].getText() == O) && (bn[1][0].getText() == O) && (bn[2][0].getText() == O) ){
                resultLbl.setText("Game over! You Lose!");
                disableGame();
                return;
            }    
             if( (bn[0][1].getText() == O) && (bn[1][1].getText() == O) && (bn[2][1].getText() == O) ){
                resultLbl.setText("Game over! You Lose!");
                disableGame();
                return;
            }     
             if( (bn[0][1].getText() == X) && (bn[1][1].getText() == X) && (bn[2][1].getText() == X) ){
                resultLbl.setText("Game over! You Win!");
                disableGame();
                return;
            } 
             if( (bn[0][2].getText() == O) && (bn[1][2].getText() == O) && (bn[2][2].getText() == O) ){
                resultLbl.setText("Game over! You Lose!");
                disableGame();
                return;
            }    
             if( (bn[0][2].getText() == X) && (bn[1][2].getText() == X) && (bn[2][2].getText() == X) ){
                resultLbl.setText("Game over! You Win!");
                disableGame();
                return;
            }    
            //diangle wins
             if( (bn[0][0].getText() == O) && (bn[1][1].getText() == O) && (bn[2][2].getText() == O) ){
                resultLbl.setText("Game over! You Lose!");
                disableGame();
                return;
            }      
             if( (bn[0][0].getText() == X) && (bn[1][1].getText() == X) && (bn[2][2].getText() == X) ){        
                resultLbl.setText("Game over! You Win!");
                disableGame();
                return;
            } 
             if( (bn[0][2].getText() == O) && (bn[1][1].getText() == O) && (bn[2][0].getText() == O) ){
                resultLbl.setText("Game over! You Lose!");
                disableGame();
                return;
            }   
             if( (bn[0][2].getText() == X) && (bn[1][1].getText() == X) && (bn[2][0].getText() == X) ){
                resultLbl.setText("Game over! You Win!");
                disableGame();
                return;
            }  
            //check if a block is still open if there are no open blocks the game is disabled and tie is declared
            for(int x = 0; x < 3; x++)
                for(int y = 0; y < 3; y++)
                    if(bn[x][y].getText().equals(""))
                        return;
            resultLbl.setText("Game over! Tie");
            disableGame(); 
        }
        
        /** disable gameboard */
        public void disableGame(){
             for(int x = 0; x < 3; x++)
                for(int y = 0; y < 3; y++)
                    bn[x][y].setEnabled(false);  
             //turn is set true to prevent infinite loop at the end of the game if tied
             turn = true;
             reset();
        }
        
        /** cpu random move */
        public void cpuMove(){
            int x = 0;
            int y = 0;
            do{
                x = rand.nextInt(3);
                y = rand.nextInt(3);
                if(bn[x][y].getText().equals("")){
                    bn[x][y].setText(O);
                    turn = true;
                    gameStatus();
                }
            }while(turn == false);
            
        }
        
        /** reset game; If you win computer goes first */
        public void reset(){
            int answer = JOptionPane.showConfirmDialog(this, "Do you want to play again?", "reset", JOptionPane.YES_NO_OPTION);
            if(answer == JOptionPane.YES_OPTION){
                for(int x = 0; x < 3; x++)
                    for(int y = 0; y < 3; y++){
                        bn[x][y].setEnabled(true);
                        bn[x][y].setText("");
                    }    
                turn = true;
                resultLbl.setText("");
            }
        }
        

        
}

