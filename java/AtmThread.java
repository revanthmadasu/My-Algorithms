
public class AtmThread extends Thread{
	AtmThreading atm;
	String name;
	long waitingTime;
	boolean sleeping=false;
	AtmThread(AtmThreading atm1,String name1,int time)
	{
		atm=atm1;
		name=name1;
		waitingTime=time*1000;
	}
	public void run()
	{
		atm.occupied(name, waitingTime);
	}
	void sleep1()
	{
		sleeping=true;
		try{
			this.wait();
		}catch(InterruptedException e){
			System.out.println("Awake Interrupted");
		}
	}
	void awake()
	{
			this.notify();
	}
}
