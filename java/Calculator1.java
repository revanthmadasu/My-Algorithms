
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Calculator1 extends JFrame implements ActionListener,Runnable{
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
	JButton bMode;
	JRadioButton bShift,bAlpha;
	TextField tf;
	Panel p;
	JPanel p1;
	int ch=-1;
	String msg,value1="",value2="",value="";
	Calculator1()
	{
	    b1=new Button("1");b2=new Button("2");b3=new Button("3");b4=new Button("4");b5=new Button("5");b6=new Button("6");b7=new Button("7");b8=new Button("8");
    	b9=new Button("9");b10=new Button("0");b11=new Button("+");b12=new Button("-");b13=new Button("X");b14=new Button("/");b15=new Button("%");b16=new Button("=");
	    b17=new Button("C");
	    this.setTitle("Calculator");
	    p=new Panel();
	    p.setLayout(new FlowLayout());
	    tf=new TextField(20);
	    tf.setBounds(1,1,1,1);
	    tf.repaint();
	    bShift = new JRadioButton("Shift");
	    bShift.setBackground(Color.yellow);
	    bAlpha = new JRadioButton("Alpha");
	    bAlpha.setBackground(Color.red);
	    ButtonGroup operation= new ButtonGroup();
	    operation.add(bShift);
	    operation.add(bAlpha);
	    p1=new JPanel();
	    this.add(tf);
	    bMode=new JButton("Mode");
	    bMode.addActionListener(this);
	    p1.add(bShift);p1.add(bAlpha);p1.add(bMode);
	    this.add(p1);
	    b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);b4.addActionListener(this);b5.addActionListener(this);b6.addActionListener(this);
	    b7.addActionListener(this);b8.addActionListener(this);b9.addActionListener(this);b10.addActionListener(this);b11.addActionListener(this);b12.addActionListener(this);
	    b13.addActionListener(this);b14.addActionListener(this);b15.addActionListener(this);b16.addActionListener(this);b17.addActionListener(this);
	    p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);p.add(b6);p.add(b7);p.add(b8);p.add(b9);p.add(b10);p.add(b11);p.add(b12);p.add(b13);p.add(b14);p.add(b15);p.add(b16);
	    p.add(b17);
	    this.add(p);
	    this.setVisible(true);
	    this.setSize(300,700);
	    this.setLayout(new GridLayout(4,4,10,10));
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			value+="1";
			tf.setText(value);
		}
		if(ae.getSource()==b2)
		{
			value+="2";
			tf.setText(value);
		}
		if(ae.getSource()==b3)
		{
			value+="3";
			tf.setText(value);
		}
		if(ae.getSource()==b4)
		{
			value+="4";
			tf.setText(value);
		}
		if(ae.getSource()==b5)
		{
			value+="5";
			tf.setText(value);
		}
		if(ae.getSource()==b6)
		{
			value+="6";
			tf.setText(value);
		}
		if(ae.getSource()==b7)
		{
			value+="7";
			tf.setText(value);
		}
		if(ae.getSource()==b8)
		{
			value+="8";
			tf.setText(value);
		}
		if(ae.getSource()==b9)
		{
			value+="9";
			tf.setText(value);
		}
		if(ae.getSource()==b10)
		{
			value+="0";
			tf.setText(value);
		}
		if(ae.getSource()==b11)
		{
			ch=1;
			value+=" + ";
			tf.setText(value);
		}
		if(ae.getSource()==b12)
		{
			ch=2;
			value+=" - ";
			tf.setText(value);
		}
		if(ae.getSource()==b13)
		{
			ch=3;
			value+=" * ";
			tf.setText(value);
		}
		if(ae.getSource()==b14)
		{
			ch=4;
			value+=" / ";
			tf.setText(value);
		}
		if(ae.getSource()==b15)
		{
			ch=5;
			value+=" % ";
			tf.setText(value);
		}
		if(ae.getSource()==b16)
		{
			int result=EvaluateString.evaluate(value);
			value+="=";
			value+=String.valueOf(result);
			tf.setText(value);
		}
		if(ae.getSource()==b17)
		{
			ch=0;
			value="";
			tf.setText(value);
		}
		if(ae.getSource()==bShift)
		{
			this.setBackground(Color.yellow);
		}
	}
	public static void main(String args[])
	{
		 new Calculator1();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
