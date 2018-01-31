package J12;

public class Ziji implements Runnable{
	Object lock=new Object();
	int count=10;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(count>0) {
			synchronized(lock) {
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"卖出了第"+count+"张");
			count--;
			}
		}
	}
	
}