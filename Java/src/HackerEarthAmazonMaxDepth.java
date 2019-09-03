import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class HackerEarthAmazonMaxDepth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,q;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		q=s.nextInt();
		int arr[]=new int[n];
		int level[]=new int[n];
		HashMap<Integer,TreeSet> levelsToNodes=new HashMap();
		int maxDept=0;
		for(int ni=0;ni<n;++ni)
		{
			arr[ni]=s.nextInt();
		}
		levelsToNodes.put(0,new TreeSet());
		levelsToNodes.get(0).add(arr[0]);
		for(int ni=0;ni<n-1;++ni)
		{
			int n1=s.nextInt();
			int n2=s.nextInt();
			int currentDept=level[n2-1]=level[n1-1]+1;
			if(currentDept>maxDept)maxDept=currentDept;
			if(levelsToNodes.get(currentDept)==null)
			{
				levelsToNodes.put(currentDept,new TreeSet());
				levelsToNodes.get(currentDept).add(arr[n2-1]);
			}
			else
				levelsToNodes.get(level[n2-1]).add(arr[n2-1]);
		}
		System.out.println(levelsToNodes);
		for(int qi=0;qi<q;++qi)
		{
			int l=s.nextInt();
			int x=s.nextInt();
			
			Integer res=(Integer)levelsToNodes.get(l%(maxDept+1)).ceiling(x);
			System.out.println((res==null)?-1:res);
		}
	}

}
