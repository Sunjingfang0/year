package J12;

public class N1214 {
	public static void main(String[] args) {
		Runnable ziji=new Ziji();
		Thread t1=new Thread(ziji);
		Thread t2=new Thread(ziji);
		t1.start();
		t2.start();
	}
}
