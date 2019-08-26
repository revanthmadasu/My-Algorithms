import java.util.Scanner;
public class Game {
	 static Scanner inp=new Scanner(System.in);
	 static int m[][],i,j,n;
	 public static void main(String args[])
	 {
	  int t,t1,r,q,q1;
	  t=inp.nextInt();
	  for(t1=0;t1<t;t1++)
	  {
	   n=inp.nextInt();
	   q=inp.nextInt();
	   m=new int[n][3];
	   for(i=0;i<n;i++)
	    for(j=0;j<3;j++)
	     {
	    	try{m[i][j]=1;}
	    	catch(ArrayIndexOutOfBoundsException e){ e.printStackTrace();}
	     }
	   for(q1=0;q1<q;q1++)
	   {
	    i=inp.nextInt();
	    j=inp.nextInt();
	    --i;--j;
	    m[i][j]=-1;
	   }
	   i=0;j=1;r=0;
	   while(r<n-1)
	   {
	    if(m[i][j]==1)
	    {
	     if(m[i+1][1]==1)
	     {
	      ++i;j=1;
	     }
	     else if((m[i+1][0]==1)&&(m[i+1][2])==1)
	     {
	      if(j==0) j=0;
	      else if(j==2) j=2;
	      else
	      {
	       j=Game.prefer();
	       if(j==-1) break;
	       else ++i;
	      }
      
	     }
	     else if(m[i+1][0]==1)
	     {
	      if(j-0<2)
	      {
	       ++i;j=0;
	      }
	     }
	     else if(m[i+1][2]==1)
	     {
	      if(j-2>-2)
	      {
	       ++i;j=2;
	      }
	     }
	     ++r;
	    }
	   }
	   System.out.println(i+1);
	   m=null;
	  }
	 }
	 static int prefer()////int prefer(int n,int *m1,int r)||j=prefer(i+1,m,n);
	 {
	  int i1;
	  for(i1=n;i1<i+1;i++)
	  {
		  if((m[i][0]==1)&&(m[i][2]==1)) continue;
	   if(m[i][0]==1) return 0;
	   if(m[i][2]==1) return 2;
	  }
	  return -1;
	 }
	}
