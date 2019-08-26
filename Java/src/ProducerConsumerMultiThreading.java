class Q
{
	int value;
	boolean set=false;
	public synchronized void put()
	{
		while(set)
		{
			try{
				wait();
			}
			catch(Exception e)
			{
				
			}
		}
		++value;
		set=true;
		notify();
		System.out.println("Put: "+value);
	}
	
	public synchronized void get()
	{
		while(!set)
		{
			try{
				wait();
			}
			catch(Exception e)
			{
				
			}
		}
		System.out.println("Get: "+value);
		set=false;
		notify();
	}
}
class Producer implements Runnable{
	Q q;
	Producer(Q q)
	{
		this.q=q;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true)
		{
			q.put();
			try{
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}
class Consumer implements Runnable{
	Q q;
	Consumer(Q q)
	{
		this.q=q;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			
			q.get();
			try{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}
public class ProducerConsumerMultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q q=new Q();
		Producer p=new Producer(q);
		Consumer c=new Consumer(q);
		new Thread(p).start();
		new Thread(c).start();
	}

}
