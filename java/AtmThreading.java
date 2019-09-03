
public class AtmThreading
{
	synchronized void occupied(String name,long time)
	{
		System.out.println("Atm Occupied by"+name);
		try{
			System.out.println("Waiting for "+time/1000+" secs");
			Thread.sleep(time);
		}catch(InterruptedException e){
			System.out.println("Interupetd");
		}
		System.out.println("Exiting by "+name);
	}
}
