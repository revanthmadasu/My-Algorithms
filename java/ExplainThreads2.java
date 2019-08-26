
public class ExplainThreads2 {

	public ExplainThreads2() {
		// TODO Auto-generated constructor stub
	}
    public static void main(String args[])
    {
    	Thread name1=new NameThread("Revanth",1);
    	Thread name2=new NameThread("Deepika",1);
    	name1.start();
    	name2.start();
    }
}
