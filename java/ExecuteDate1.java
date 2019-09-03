import java.util.*;
import java.text.DateFormat;
public class ExecuteDate1 {

	public ExecuteDate1() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String args[]) {
		// TODO Auto-generated method stu
		 Date rightNow;
         Locale currentLocale;
         DateFormat timeFormat;
         DateFormat dateFormat;
         String timeOut, dateOut;
         for(int i=0;i<20;i++)
         {
         	rightNow=new Date();
         	currentLocale = new Locale("en","IN");
             timeFormat=DateFormat.getTimeInstance(DateFormat.LONG,currentLocale);
             dateFormat=DateFormat.getDateInstance(DateFormat.LONG,currentLocale);
             timeOut=timeFormat.format(rightNow);
             dateOut=dateFormat.format(rightNow);
             System.out.println(timeOut);
             System.out.println(dateOut);
             try{
             	Thread.sleep(2000);
             }
             catch(InterruptedException e){}
             System.out.println();
    }
        }
	}
