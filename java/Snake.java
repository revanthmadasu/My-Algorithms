import java.awt.*;
import java.util.ArrayList;
import java.awt.event.*;
import java.applet.*;
public class Snake extends Applet implements KeyListener,Runnable {
	int n=5,d;
	ArrayList<Character> s;
	int xpos=145,ypos=145,tx,ty;
	public void init()
	{
		addKeyListener(this);
		Thread m=new Thread(this);
		this.setSize(300,300);
		this.showStatus("Snake");
		m.start();
	}
	public void paint(Graphics g)
	{
		int x,y;
			g.drawString("X", xpos, ypos);
			for(int i=1;i<10;i++)
				{
				      if(d==1);
				      if(d==4)
				      {
				    	  x=xpos+i+(5*i);
				    	  y=ypos;
				          g.drawString("- ", x,y);
				      }
				      
				}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			if(xpos<=0)xpos=300;
			if(ypos<=0)ypos=300;
			try
			{
				Thread.sleep(100);
			}catch(Exception e){}
			xpos-=5;
			repaint();
		}
		
	}

	@Override
	public void keyPressed(KeyEvent arg0)
	{
		tx=xpos;ty=ypos;
		switch(arg0.getKeyCode())
		{
		case KeyEvent.VK_UP:d=1;break;
		case KeyEvent.VK_RIGHT:d=2;break;
		case KeyEvent.VK_DOWN:d=3;break;
		case KeyEvent.VK_LEFT:d=4;break;
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
