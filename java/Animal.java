
import java.io.*;
public class Animal {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public Animal(int limbs,String species) {
		// TODO Auto-generated constructor stub
		this.limbs=limbs;
		this.species=species;
	}
	public Animal(){}
	int limbs;
	String species;
	void getDetails()
	{
		System.out.println("Enter the species and limbs");
		try{
			species=br.readLine();
			limbs=(int)br.read();
		}
		catch(IOException e)
		{
			System.out.println("Something went wrong \n Cannot read the given input");
		}
	}	
	
    void display()
	{
     	System.out.println("limbs = "+limbs+"\nSpecies = "+species);
	}
}


