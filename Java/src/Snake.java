import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.math.*;
import java.awt.Graphics;
import java.applet.*;
public class Snake extends Applet implements Runnable,KeyListener{
	int d,M[][],tx,ty,hx,hy,ex,ey,score=0,time=250,level=1;
	boolean game=true,paused=false;
	Thread moving; 
	public void init()
	{
		d=1;
		M=new int[30][30];
		moving = new Thread(this);
		addKeyListener(this);
		for(int i=0;i<30;i++)
			for(int j=0;j<30;j++)
				M[i][j]=0;
		M[14][15]=M[15][15]=M[16][15]=1;
		hx=14;hy=15;
		tx=16;ty=15;
		ex=(int)(Math.random()*27);
		ey=(int)(Math.random()*26);
		ex++;
		ey+=2;
		this.setSize(300,300);
		setBackground(Color.BLACK);
		setForeground(Color.GREEN);
		moving.start();
		this.setFocusable(true);
	} 
	public void run()
	{
		try{
		while(game)
		{
			if(!paused)
			{
			if(d==1) 
				{
				    if(M[hx][hy-1]==1)
				    	{
				    	game=false;
				    	break;
				    	}
				    M[hx][--hy]=1;
				}
			else if(d==2)
				{
				if(M[hx+1][hy]==1){
					game=false;
					break;
				}
				   M[++hx][hy]=1;
				}
			else if(d==3)
				{
				   if(M[hx][hy+1]==1){
					 game=false;
					 break;
				   }
				   M[hx][++hy]=1;
				}
			else if(d==4)
				{
				   if(M[hx-1][hy]==1){
					 game=false;
					 break;
				   }
				   M[--hx][hy]=1;
				}
			if(hx==ex&&hy==ey)
			{
				M[tx][ty]=1;
				ex=(int)(Math.random()*27);
				ey=(int)(Math.random()*27);
				++ex;++ey;
				++score;
			}
			else
			{
				M[tx][ty]=0;
			    if(M[tx-1][ty]==1) --tx;
				else if(M[tx+1][ty]==1) ++tx;
				else if(M[tx][ty-1]==1) --ty;
				else if(M[tx][ty+1]==1) ++ty;
			}
			try{
				Thread.sleep(time);
			}catch(Exception e){}

			//print();
	    
			repaint();
		}}
		if(!game)
		{
			showStatus("Game over");
		}
		}
	catch(Exception e){
		//String temp=Integer.toString(score);this.showStatus("GAME OVER -Score : "+temp+"  | Level : "+level);
		game=false;
		}
	}
	void print()
	{
	    for(int i=0;i<30;i++)
	    {
	    	for(int j=0;j<30;j++)
	    		System.out.print(M[i][j]);
	    	System.out.println("");
	    }
	    System.out.print("\n direction " +d);
	}
	public void paint(Graphics g)
	{
		for(int i=0;i<30;i++)
			for(int j=0;j<30;j++)
				if(M[i][j]==1)
					g.drawString("X",i*10,j*10);
		g.drawString("O", ex*10, ey*10);
		if(score%5==0){
			++level;
			++score;
		}
		String temp=Integer.toString(score);
		this.showStatus("Score : "+temp+"  | Level : "+level);
		time=(300-(level-1)*30);
	}
	public void keyPressed(KeyEvent e)
	{
		switch(e.getKeyCode())
		{
		case KeyEvent.VK_UP:d=1; showStatus("Moving Up");break;
		case KeyEvent.VK_RIGHT:d=2; showStatus("Moving Right");break;
		case KeyEvent.VK_DOWN:d=3; showStatus("Moving Down");break;
		case KeyEvent.VK_LEFT: d=4; showStatus("Moving Left");break;
		case KeyEvent.VK_SPACE: if(!paused) {
			paused = true;
			/*try{
			moving.wait();}catch(Exception e1){e1.printStackTrace();
			moving.start();}*/
		}
		else if(paused){
			paused = false;
			/*try{
				moving.notify();
				moving.start();
			}catch(Exception e1){e1.printStackTrace();}*/
		}
		}
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}



