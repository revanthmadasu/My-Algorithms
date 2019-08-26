import java.math.*;
import java.text.DecimalFormat;
public class HelloWorld {
	public static void main(String args[])
	{
		double x=100,y=100,d,vx=30,vy=40,tym=0.000001,s;
		s=Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
		while(true)
		{
			x-=(vx*tym);
			y-=(vy*tym);
			d=Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
			//System.out.println("x = "+x+"  y = "+y+"  d = "+d);
			if(s>d) s=d;
			else 
				break;
		}
		System.out.println("x = "+x+"  y = "+y+"  d = "+d);
	}
}
