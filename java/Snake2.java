import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.math.*;
import java.awt.Graphics;
import java.applet.*;
public class Snake2 extends Applet implements Runnable,KeyListener{
	int d,M[][],tx,ty,hx,hy,ex,ey;
	Queue qx,qy;
	boolean game=true;
	Thread moving; 
	public void init()
	{
		d=1;
		M=new int[30][30];
		moving = new Thread(this);
		//qx=new LinkedList();
		//qy=new LinkedList();
		for(int i=0;i<30;i++)
			for(int j=0;j<30;j++)
				M[i][j]=0;
		M[14][15]=M[15][15]=M[16][15]=1;
	//	qx.add(14);qx.add(15);qx.add(16);
		//qy.add(15);
		hx=14;hy=15;
		tx=16;ty=15;
		ex=(int)(Math.random()*29);
		ey=(int)(Math.random()*29);
		this.setSize(300,300);
		moving.start();
		while(game)
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
				ex=(int)(Math.random()*29);
				ey=(int)(Math.random()*29);
			}
			else
			{
				M[tx][ty]=0;
				/*Object t;
				t=qx.remove();
				tx=Integer.parseInt(t.toString());
				t=qy.remove();
				ty=Integer.parseInt(t.toString());*/
			    if(M[tx-1][ty]==1) --tx;
				else if(M[tx+1][ty]==1) ++tx;
				else if(M[tx][ty-1]==1) --ty;
				else if(M[tx][ty+1]==1) ++ty;
			}
			try{
				Thread.sleep(2000);
			}catch(Exception e){}
			print();
			repaint();
		}
		if(!game)
		{
			showStatus("Game over");
		}
	} 
	public void run()
	{
		addKeyListener(this);
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
	}
	public void keyPressed(KeyEvent e)
	{
		switch(e.getKeyCode())
		{
		case KeyEvent.VK_UP:d=1;break;
		case KeyEvent.VK_RIGHT:d=2;break;
		case KeyEvent.VK_DOWN:d=3;break;
		case KeyEvent.VK_LEFT: d=4;break;
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

