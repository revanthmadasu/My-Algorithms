import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class SampleFrame extends Frame
{
	SampleFrame(String title)
	{
		super(title);
		MyWindowAdapter adapter = new MyWindowAdapter(this);
		addWindowListener(adapter);
	}
	public void paint(Graphics g)
	{
		g.drawString("This is in frame window", 10,40);
	}
}
class MyWindowAdapter extends WindowAdapter
{
	SampleFrame sampleframe;
	public MyWindowAdapter(SampleFrame sampleframe)
	{
		this.sampleframe=sampleframe;
	}
	public void windowClosing(WindowEvent we)
	{
		sampleframe.setVisible(false);
	}
}
