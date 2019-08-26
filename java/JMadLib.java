
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/** madlib class */
public class JMadLib extends JApplet
{
	// Variables declaration
	private JLabel titleLbl;
	private JLabel directionLbl;
	private JTextField retrieveTxt;
	private JTextArea riddleTxt;
	private JButton returnBn;
	private Container contentPane;
      private String[] noun = new String[2];
      private String adjective = "";
      private String past_tense = "";
      private String reading = "";
      private int count = 0;
	// End of variables declaration

	/** Applet initiation method */
	public void init()
	{	
		initializeComponent();	
	}

        /** initialize componets */
	private void initializeComponent()
	{
		titleLbl = new JLabel();
		directionLbl = new JLabel();
		retrieveTxt = new JTextField();
		riddleTxt = new JTextArea();
		returnBn = new JButton();
		contentPane = (Container)this.getContentPane();

		//
		// titleLbl
		//
                titleLbl.setFont(new Font("Garrmond", Font.BOLD, 24));
		titleLbl.setText("Welcome to Mad Libs");
		//
		// directionLbl
		//
		directionLbl.setText("Enter in a noun");
		//
		// retrieveTxt
		//
		//
		// riddleTxt
		//		
		riddleTxt.setOpaque(false);
            	riddleTxt.setFont(new Font("Arial",Font.BOLD,20));
		
		riddleTxt.setVisible(false);
		//
		// returnBn
		//
		returnBn.setText("Press Me");
		returnBn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				returnBn_actionPerformed(e);
			}

		});
		//
		// contentPane
		//
		contentPane.setLayout(null);
		addComponent(contentPane, titleLbl, 50,25,340,33);
		addComponent(contentPane, directionLbl, 12,78,160,22);
		addComponent(contentPane, retrieveTxt, 180,78,100,22);
		addComponent(contentPane, riddleTxt, 1,6,377,225);
		addComponent(contentPane, returnBn, 290,76,100,28);
		//
		// JMadLib
		//		
	
	}

	/** Add Component Without a Layout Manager (Absolute Positioning) */
	private void addComponent(Container container,Component c,int x,int y,int width,int height)
	{
		c.setBounds(x,y,width,height);
		container.add(c);
	}

        /** action to be preformed after mouse click */
	private void returnBn_actionPerformed(ActionEvent e)
	{
	   //if textbox is not empty
           if( !retrieveTxt.getText().equals("") ){
                switch(count){
                    case 0:
                        directionLbl.setText("Enter another noun");
                        noun[0]= retrieveTxt.getText();
                        break;
                    case 1:
                        directionLbl.setText("Enter an adjective");
                        noun[1] = retrieveTxt.getText();
                        break;
                    case 2:
                        directionLbl.setText("Enter a past tense verb");
                        adjective = retrieveTxt.getText();
                        break;
                    case 3:                     
                        titleLbl.setText(" Completed Rhyme");
                        directionLbl.setVisible(false);
                        retrieveTxt.setVisible(false);
                        returnBn.setVisible(false);
                        riddleTxt.setVisible(true);
                        past_tense = retrieveTxt.getText();
                        reading = getRiddle(noun[0],noun[1],adjective,past_tense);
                        riddleTxt.setText(reading);
                        break;
                    default:
                        System.out.println("A error has occured");
                 }
                 count++; 
                 retrieveTxt.setText("");
           }
     
	}
       
        /** return riddle string formated for display */
        public String getRiddle(String noun1, String noun2, String adjective, String past_tense){
            String temp = "\n\n\n           Mary had a little " + noun1 + "\n        Its " + noun2 + " was " + adjective + " as snow\n  And everywhere that Mary " + past_tense + "\n        The " + noun1 + " was sure to go.";
            return temp;        
        }
}
