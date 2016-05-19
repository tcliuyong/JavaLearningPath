package BaseJava.thread;

public class testThread {
	 public static int count = 0;
	 
	    public synchronized static void inc() {
	 
	        //这里延迟1毫秒，使得结果明显
	        try {
	            Thread.sleep(1);
	        } catch (InterruptedException e) {
	        }
	 
	        count++;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                	testThread.inc();
                }
            }).start();
	}
		 System.out.println("运行结果:Counter.count=" + testThread.count);
	}
}
