import java.util.Scanner;

public class CodeGladiatorsWelcome {

	public static void main(String args[] ) throws Exception {

    	//Write code here
        Scanner s=new Scanner(System.in);
        System.out.println("hello");
        int testCases=s.nextInt();
        for(int ti=0;ti<testCases;++ti)
        {
            int n=s.nextInt();
            int tickets[]=new int[n];
            for(int i=0;i<n;++i)
                tickets[i]=s.nextInt();
            StringBuilder result=new StringBuilder();
            for(int currentIndex=n-1;currentIndex>=0;--currentIndex)
            {
                if(tickets[currentIndex]<=0)
                {
                    continue;
                }
                StringBuilder comb1=new StringBuilder();
                StringBuilder comb2=new StringBuilder();
                int sum1=0,sum2=0;
                int dc1,dc2;
                int leftBoundary=currentIndex;
                while(tickets[leftBoundary]>0&&--leftBoundary>=0);

                for(int i=currentIndex;i>leftBoundary;i-=2)
                {
                    sum1+=tickets[i];
                    comb1.append(tickets[i]);
                }
                for(int i=currentIndex-1;i>leftBoundary;i-=2)
                {
                    sum2+=tickets[i];
                    comb2.append(tickets[i]);
                }

                if(sum1>0||sum2>0)
                {
                    if(sum1>sum2)
                        result.append(comb1);
                    else if(sum2>sum1)
                        result.append(comb2);
                    else{
                        if(tickets[currentIndex]>tickets[currentIndex-1])
                            result.append(comb1);
                        else
                            result.append(comb2);
                    }
                }
                
                currentIndex=leftBoundary;
                }
            System.out.println(result);
        }


   }

}
