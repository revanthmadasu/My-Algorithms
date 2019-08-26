class Q
{
	int num;
	boolean loaded = false;
	Q(){num=0;}
	synchronized void get()
	{
	    while(!loaded)
	    {
	    	try{ wait(); } catch(Exception e){}
	    }
		System.out.println("Get : " +num);
		loaded = false;
	}
	synchronized void put(int n)
	{
		while(loaded)
		{
			try{ wait(); } catch(Exception e){}
		}
		num=n;
		loaded = true;
		System.out.println("Put : " +num);
	}
}
class Producer extends Thread
{
	Q q;
	Producer(Q q)
	{
		this.q=q;
		start();
	}
	public void run()
	{
		int i=0;
		while(true)
		{
			q.put(++i);
			try{Thread.sleep(1800);}
			catch(Exception e){}
		}
	}
}
class Consumer extends Thread
{
	Q q;
	Consumer(Q q)
	{
		this.q=q;;
		start();
	}
	public void run()
	{
		while(true)
		{
			q.get();
			try{Thread.sleep(2500);}
			catch(Exception e){}
		}
	}
}
public class InterThread {
	public static void main(String args[])
	{
		Q q = new Q();
	    new Producer(q);
		new Consumer(q);
	}

}
