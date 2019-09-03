
public class GetTheMail implements Runnable {

	public GetTheMail() {
		// TODO Auto-generated constructor stub
	}
    private int startTime;
    public GetTheMail(int startTime){
    	this.startTime=startTime;
    }
	@Override
	public void run() {
		// TODO Auto-generated method stub
    try{
    	Thread.sleep(startTime*1000);
    }
    catch(InterruptedException e){}
    System.out.println("Getting th email");
	}
}
