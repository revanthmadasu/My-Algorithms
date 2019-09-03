import java.awt.*;
import java.applet.*;
public class BannerApplet extends Applet implements Runnable{
	String msg=" Revanth is great :P";
	Thread t=null;
	int state;
	volatile boolean stopFlag;
	public void init(){
		setBackground(Color.black);
		setForeground(Color.white);
	}
	public void start()
	{
		t=new Thread(this);
		stopFlag=false;
		t.start();
	}
	public void run()
	{
		while(true)
		{
			try{
				repaint();
				Thread.sleep(300);
				if(stopFlag) break;
			}catch(Exception e){}
		}
	}
	public void stop()
	{
		stopFlag=true;
		t=null;
	}
	public void paint(Graphics g)
	{
		char ch;
		ch=msg.charAt(0);
		msg=msg.substring(1, msg.length());
		msg+=ch;
		g.drawString(msg, 50, 30);
		showStatus("Banner Applet");
	}

}
