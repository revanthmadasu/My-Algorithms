import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JChechBoxDemo extends JApplet implements ItemListener {
	JLabel jlab;
	public void init()
	{
		try{
			SwingUtilities.invokeAndWait(new Runnable(){
				public void run()
				{
					makeGUI();
				}
			});
		}catch(Exception e){}
	}
	private void makeGUI()
	{
		setLayout(new FlowLayout());
		JCheckBox cb=new JCheckBox("C");
		cb.addItemListener(this);
		add(cb);
		cb=new JCheckBox("C++");
		cb.addItemListener(this);
		add(cb);
		cb=new JCheckBox("Java");
		cb.addItemListener(this);
		add(cb);
		jlab=new JLabel("Select Languages");
		add(jlab);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		JCheckBox cb = (JCheckBox)ie.getItem();
		if(cb.isSelected())
			jlab.setText(cb.getText()+" is selected");
		else 
			jlab.setText(cb.getText()+" is cleared");
	}
}
