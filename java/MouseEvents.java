import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class MouseEvents extends Applet 
 implements MouseListener, MouseMotionListener,Runnable,KeyListener{
	String msg=" ";
	int mouseX=0,mouseY=0;
	Thread t;
	public void init()
	{
		t=new Thread(this);
		addMouseListener(this);
		addMouseMotionListener(this);
		addKeyListener(this);
		this.setSize(300, 300);
		t.start();
	}
	public void run()
	{
		int i=0;
		while(true)
		{
			++i;
			showStatus("Secounds = "+i);
		try{ Thread.sleep(1000);} catch(Exception e){}
		}
	}
	public void mouseClicker(MouseEvent me)
	{
		mouseX=0;
		mouseY=10;
		msg="Mouse Clicked";
		repaint();
	}
	public void mouseEntered(MouseEvent me)
	{
		mouseX=0;
		mouseY=10;
		msg="Mouse Entered";
		repaint();
	}
	public void mouseExited(MouseEvent me)
	{
		mouseX=0;
		mouseY=10;
		msg="Mouse Exited";
		repaint();
	}
	public void mousePressed(MouseEvent me)
	{
		mouseX=me.getX();
		mouseY=me.getY();
		msg="Down";
		repaint();
	}
	public void mouseReleased(MouseEvent me)
	{
		mouseX=me.getX();
		mouseY=me.getY();
		msg="Up";
		repaint();
	}
	public void mouseDragged(MouseEvent me)
	{
		mouseX=me.getX();
		mouseY=me.getY();
		msg="*";
		showStatus("Dragged mouse at "+mouseX+", "+mouseY);
		repaint();
	}
	public void mouseMoved(MouseEvent me)
	{
		showStatus("Moving mouse at "+me.getX()+", "+me.getY());
	}
	public void mouseClicked(MouseEvent me)
	{
		msg="Mouse Clicked";
		/*if((me.getX()>=70&&me.getX()<=80)&&(me.getY()>=70&&me.getY()<=80))
		{
			setBackground(Color.black);
			setForeground(Color.white);
		}*/
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,mouseX,mouseY);
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyCode())
		{
		case KeyEvent.VK_UP: showStatus("Moving Up");break;
		case KeyEvent.VK_RIGHT: showStatus("Moving Right");break;
		case KeyEvent.VK_DOWN: showStatus("Moving Down");break;
		case KeyEvent.VK_LEFT: showStatus("Moving Left");break;
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
