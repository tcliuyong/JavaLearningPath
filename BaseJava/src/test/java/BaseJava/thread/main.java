package BaseJava.thread;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackBuff s = new StackBuff();  
		Producer p = new Producer(s);  
		Consumer c = new Consumer(s);  
		Thread tp = new Thread(p);  
		Thread tc = new Thread(c);  
		tp.start();  
		tc.start();  

	}

}
