
public class ExecuteThreads 
{
	public static void main(String args[])
	{
		Threading a = new Threading("Revanth");
		Threading b = new Threading("Is");
		Threading c = new Threading("good");
		a.setPriority(9);
		b.setPriority(5);
		c.setPriority(4);
		a.start();
		b.start();
		c.start();
	}
}
