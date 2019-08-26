import java.io.*;
public class ExeptionHandling {
	public static void main(String args[])
	{
		int a[];
		a=new int[2];
		try{
			int b=a[1]/0;
			b=a[2]/0;
		}
		catch(ArithmeticException e)
		{
		   System.out.println("Cant divide with zero");	
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Watch out on size");
		}
		try{
			a[0]='a';//doesnt give a exception as it give ascii value of a
		}
		catch(ArrayStoreException e){
			System.out.println("You cant give a characte to integer array");
		}
		finally{
			System.out.println(a[0]);
		}
		String b="abc";
		try{
			int c = Integer.parseInt(b);
		}
		catch(NumberFormatException e)
		{
			System.out.println("You cant give a word as integer");
		}
	}

}
