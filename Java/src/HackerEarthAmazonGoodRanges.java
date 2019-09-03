import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class HackerEarthAmazonGoodRanges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n,m;
		boolean firstAdded=false;
		boolean lastAdded=false;
		System.out.println("Helo");
		n=s.nextInt();
		m=s.nextInt();
		TreeSet<Integer> set=new TreeSet();
		set.add(1);
		set.add(n);
		
		
		for(int mi=0;mi<m;++mi)
		{
			int num=s.nextInt();
			if(num==1) firstAdded=true;
			if(num==n)lastAdded=true;
			int sum=0;
			set.add(num);
			Iterator i=set.iterator();
			if(!firstAdded)
				i.next();
			while(i.hasNext())
			{
					Integer num1=(Integer)i.next();
					if(num1==n&&!lastAdded)break;
					Integer x=set.higher(num1);

					if(x==null)
						sum+=num1;
					else sum+=x;
					
					x=set.lower(num1);
					
					if(x==null)
						sum+=num1;
					else sum+=x;
					System.out.println(num1+" "+set.lower(num1)+" "+set.higher(num1));
			}
			System.out.println(sum);
		}
	}

}
