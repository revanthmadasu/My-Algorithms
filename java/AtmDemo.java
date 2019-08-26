
public class AtmDemo {
public static void main(String args[])
{
	AtmThreading ATM=new AtmThreading();
	AtmThread a = new AtmThread(ATM,"Revanth",5);
	AtmThread b = new AtmThread(ATM,"Rahul",10);
	AtmThread c = new AtmThread(ATM,"Sandhya",8);
	a.start();
	a.sleep1();
	b.start();
	c.start();
}
}
