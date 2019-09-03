import java.io.*;
import java.util.*;

public class HackerRankStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        if(s.length()==0)System.out.println("0");
        else{
        char []copy=new char[s.length()];
        copy=(s.toLowerCase()).toCharArray();
        int i=0,j=0,k=0,k1=0;
        while(j<s.length())
            {
            while(((int)copy[j])>=97&&((int)copy[j])<=122)
               { 
                ++j;
               }
              ++j;
            if(j<s.length())
            if(((int)copy[j])>=97&&((int)copy[j])<=122)
              ++k;  
        }
        ++k;
        j=0;
        System.out.println(k);
        while(j<s.length())
            {
            while(((int)copy[j])>=97&&((int)copy[j])<=122)
            {
                ++j;
            }
            if(i!=j)
            System.out.println(s.substring(i,j));
            ++j;
            i=j;
        }
        }
        scan.close();
    }
}