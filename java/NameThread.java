import java.util.concurrent.locks.ReentrantLock;
public class NameThread extends Thread {

	private String name;
	ReentrantLock lock = new ReentrantLock();
	int delayTime;
    public void run()
    {
    	lock.lock();
    	int i;
    	for(i=0;i<10;i++){
    		try{
    			Thread.sleep(delayTime*1000);
    		}
            catch(InterruptedException e){}
    		System.out.println(name+" "+i);
    	}
    	if(i==10)
		lock.unlock();
    }
    public NameThread(String nam,int time) {
		// TODO Auto-generated constructor stub
		name=nam;
		delayTime=time;
	}
}
