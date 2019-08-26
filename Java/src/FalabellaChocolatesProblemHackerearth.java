import java.util.*;
public class FalabellaChocolatesProblemHackerearth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		int testCases=S.nextInt();
		for(int ti=0;ti<testCases;++ti)
		{
		int x=S.nextInt(),A=S.nextInt(),B=S.nextInt();
		long C=S.nextLong();
		ArrayList<Long> childrenTimes=new ArrayList();
		childrenTimes.add((long)x);
		long t=x;
		long maxTime=x*C;
		while(true)
		{
			t=A*t+B;
			if(t>maxTime)break;
			else childrenTimes.add(t);
		}
		long resultTime=maxTime;
		for(int i=1;i<childrenTimes.size();++i)
		{
			long y=resultTime%childrenTimes.get(i);
			//resultTime-=
		}
		//System.out.println(childrenTimes);
		/*for(long time=maxTime;time>=x;time-=x)
		{
			int chocolates=0;
			for(long childTime:childrenTimes)
			{
				chocolates+=time/childTime;
			}
			//System.out.println("Inside the loop.No of chocolates eaten= "+chocolates);
			if(chocolates<C)break;
			else resultTime=time;
		}
		*/
		long allChocoletsEatable=0;
		System.out.println(resultTime);
	}
	}
}
