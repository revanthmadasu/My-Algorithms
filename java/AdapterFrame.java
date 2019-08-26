import java.applet.Applet;
import java.awt.Frame;
import java.awt.Graphics;

public class AdapterFrame extends Applet
{
	 Frame f;
	 public void init()
	 {
		 f=new SampleFrame("a Frame Window");
		 f.setSize(250,250);
		 f.setVisible(true);
	 }
	 public void start()
	 {
		 f.setVisible(true);
	 }
	 public void stop()
	 {
		 f.setVisible(false);
	 }
	 public void paint(Graphics g){
		 g.drawString("This is an applet window", 10, 20);
	 }
}
