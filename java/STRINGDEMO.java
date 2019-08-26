import java.util.*;
public class STRINGDEMO {
	public STRINGDEMO() {
		// TODO Auto-generated constructor stub
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		/*System.out.println("execution starts");
        String a=sc.next();
        String b=sc.next();boolean bo=true;
        char a1[]=new char[a.length()];
        char b1[]=new char[b.length()];
        if(a.length()!=b.length()) bo=false;
        int f[]=new int[26];
        a1=(a.toLowerCase()).toCharArray();
        b1=(b.toLowerCase()).toCharArray();
        for(int i=0;i<26;i++) f[i]=0;
        for(int i=0;i<a.length();i++)
            ++f[(int)a1[i]-97];
        for(int i=0;i<26;++i)
        {
        	System.out.println((char)(i+97)+" = "+f[i]);
        }
        for(int i=0;i<b.length();i++)
            --f[(int)b1[i]-97];
        for(int i=0;i<26;++i)
        {
        	System.out.println((char)(i+97)+" = "+f[i]);
        }
        for(int i=0;i<a.length();i++)
            if(f[i]!=0)
            	{
            	//System.out.println((char)(i+97)+" = "+f[i]);
            	bo=false;
            	}
        System.out.println(f[18]+" "+f[19]);
        System.out.println(bo);*/
		String a = "0123456789";
		System.out.println(a.substring(0,0));
		System.out.println(a.substring(0,5));
		System.out.println(a.substring(0,0));
		System.out.println(a.substring(0,5));
	}
}
