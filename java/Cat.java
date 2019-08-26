import java.io.*;
public class Cat extends Animal {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
    String name,favFood;
	public Cat() {
		// TODO Auto-generated constructor stub
		super(4,"cat");
	}
	void getDetails()
	{
		System.out.println("Enter the name and favourite food");
		try
		{
			name=br.readLine();
			favFood=br.readLine();	
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	void display()
	{
		super.display();
		System.out.println("Name = "+name+"\n Favorite food = "+favFood);
	}
}
