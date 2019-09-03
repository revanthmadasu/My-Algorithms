import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class KeyEvents extends Applet implements KeyListener 
{

	public void init()
	{
		addKeyListener(this);
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		showStatus("KeyDown");
		/*switch(e.getKeyCode())
		{
		case KeyEvent.: showStatus("Moving Up");break;
		case KeyEvent.VK_RIGHT: showStatus("Moving Right");break;
		case KeyEvent.VK_DOWN: showStatus("Moving Down");break;
		case KeyEvent.VK_LEFT:  showStatus("Moving Left");break;
		}*/
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		showStatus("Key Up");
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
