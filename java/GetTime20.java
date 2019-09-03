import java.util.*;
import java.text.DateFormat;
public class GetTime20 extends Thread {

	public GetTime20() {
		// TODO Auto-generated constructor stub
	}
    public void run()
    {
    	 Date rightNow;
         Locale currentLocale;
         DateFormat timeFormat;
         DateFormat dateFormat;
         String timeOut, dateOut;
         for(int i=0;i<20;i++)
         {
         	rightNow=new Date();
         	currentLocale = new Locale("en","IN");
             timeFormat=DateFormat.getTimeInstance(DateFormat.DEFAULT,currentLocale);
             dateFormat=DateFormat.getDateInstance(DateFormat.DEFAULT,currentLocale);
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
