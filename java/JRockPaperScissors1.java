
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

/** rock paper scissors class */
public class JRockPaperScissors1 extends JApplet
{
	// Variables declaration
	private JLabel titleLbl;
	private JLabel selectionLbl;
	private JLabel resultsLbl;
	private JTextArea resultTextArea;
	private JButton rockBn;
	private JButton paperBn;
	private JButton scissorBn;
	private Container contentPane;
      private int cpu = 0;
      private int wins = 0;
      private int loses = 0;
      private int ties = 0;
      private final int CHOICE_MAX = 3;
      private final int ROCK = 0;
      private final int PAPER = 1;
      private final int SCISSORS = 2;
      private Random rand = new Random();
	// End of variables declaration

        /** Applet initiation method */
	public void init()	{
		initializeComponent();
		this.setVisible(true);
	}

        /** initializing componets */
	private void initializeComponent()
	{
		titleLbl = new JLabel();
		selectionLbl = new JLabel();
		resultsLbl = new JLabel();
		resultTextArea = new JTextArea();
		rockBn = new JButton();
		paperBn = new JButton();
		scissorBn = new JButton();
		contentPane = (JPanel)this.getContentPane();

		//
		// titleLbl
		//
		titleLbl.setText("Rock, Paper, Scissors");
                titleLbl.setFont(new Font("Garrmond", Font.BOLD, 30));
		//
		// selectionLbl
		//
		selectionLbl.setText("Choose one button");
                selectionLbl.setFont(new Font("Arial",Font.BOLD,14));
		//
		// resultsLbl
		//
		resultsLbl.setText("-----Results-----");
                selectionLbl.setFont(new Font("Arial",Font.BOLD,14));
		//
		// resultTextArea
		//
		resultTextArea.setOpaque(false);
		resultTextArea.setBackground(new Color(236, 233, 216));
                
		//
		// rockBn
		//
		rockBn.setText("Rock");
		rockBn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				rockBn_actionPerformed(e);
			}

		});
		//
		// paperBn
		//
		paperBn.setText("Paper");
		paperBn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				paperBn_actionPerformed(e);
			}

		});
		//
		// scissorBn
		//
		scissorBn.setText("Scissors");               
		scissorBn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				scissorBn_actionPerformed(e);
			}

		});
		//
		// contentPane
		//
		contentPane.setLayout(null);
		addComponent(contentPane, titleLbl, 5,9,370,47);
		addComponent(contentPane, selectionLbl, 9,54,150,35);
		addComponent(contentPane, resultsLbl, 9,93,144,38);
		addComponent(contentPane, resultTextArea, 5,132,398,111);
		addComponent(contentPane, rockBn, 162,58,78,31);
		addComponent(contentPane, paperBn, 247,58,81,31);
		addComponent(contentPane, scissorBn, 334,58,87,31);
		//
		// JRockPaperScissors
		//
		this.setLocation(new Point(0, 0));
		this.setSize(new Dimension(435, 290));
	}

	/** Add Component Without a Layout Manager (Absolute Positioning) */
	private void addComponent(Container container,Component c,int x,int y,int width,int height)
	{
		c.setBounds(x,y,width,height);
		container.add(c);
	}

	/** action event methods */
	private void rockBn_actionPerformed(ActionEvent e)
	{
            //play the game choosing rock
            play(ROCK);
	}

	private void paperBn_actionPerformed(ActionEvent e)
	{
            //play the game choosing paper
            play(PAPER);
	}

	private void scissorBn_actionPerformed(ActionEvent e)
	{
            //play the game choosing scissors
            play(SCISSORS);
	}
        //method to play the game
        private void play(int pick){
             String resultStr = "";                   
             //random computer choice
             cpu = rand.nextInt(CHOICE_MAX);
             //nested if statments to determine winner loser or tie
             if(pick == cpu){
                 ties++;
                 resultStr = "You picked " + selection(pick) + " ---- Computer picked " + selection(cpu);
                 resultStr += "\nWinner: Tie";
                 resultStr += "\nYou: " + Integer.toString(wins) + "  " + "Computer: " + Integer.toString(loses) + " Ties: " + Integer.toString(ties);
                 resultTextArea.setText(resultStr);
             }
             else if( (pick == ROCK) && (cpu == SCISSORS) ){
                 wins++;
                 resultStr = "You picked " + selection(pick) + " ---- Computer picked " + selection(cpu);
                 resultStr += "\nWinner: You";
                 resultStr += "\nYou: " + Integer.toString(wins) + "  " + "Computer: " + Integer.toString(loses) + " Ties: " + Integer.toString(ties);
                 resultTextArea.setText(resultStr);
             }
             else if( (pick == PAPER) && (cpu == ROCK) ){
                 wins++;
                 resultStr = "You picked " + selection(pick) + " ---- Computer picked " + selection(cpu);
                 resultStr += "\nWinner: You";
                 resultStr += "\nYou: " + Integer.toString(wins) + "  " + "Computer: " + Integer.toString(loses) + " Ties: " + Integer.toString(ties);
                 resultTextArea.setText(resultStr);                 
             }
             else if( (pick == SCISSORS) && (cpu == PAPER) ){
                 wins++;
                 resultStr = "You picked " + selection(pick) + " ---- Computer picked " + selection(cpu);
                 resultStr += "\nWinner: You";
                 resultStr += "\nYou: " + Integer.toString(wins) + "  " + "Computer: " + Integer.toString(loses) + " Ties: " + Integer.toString(ties);
                 resultTextArea.setText(resultStr);
             }
             else{
                 loses++;
                 resultStr = "You picked " + selection(pick) + " ---- Computer picked " + selection(cpu);
                 resultStr += "\nWinner: Computer";
                 resultStr += "\nYou: " + Integer.toString(wins) + "  " + "Computer: " + Integer.toString(loses) + " Ties: " + Integer.toString(ties);
                 resultTextArea.setText(resultStr);                 
             }
             
        }
            //function returns paper rock or scissors as a string
             public String selection(int choice){
                 String tempStr;
                 switch(choice){
                   case 0:
                         tempStr = "rock";
                         break;
                   case 1:
                         tempStr = "paper";
                         break;
                   case 2:
                         tempStr = "scissors";
                         break;
                   default:
                         tempStr = "invalid";
                  }
                  return tempStr;
             }
}

