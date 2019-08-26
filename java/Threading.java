
public class Threading extends Thread{
	String msg;
	Threading(String msg1)
	{
		msg=msg1;
	}
	public synchronized void display()
	{
		System.out.print("["+msg);
		try{Thread.sleep(1000);}catch(InterruptedException e){}
		System.out.print(']');
	}
	public void run()
	{
		this.display();
	}
}
