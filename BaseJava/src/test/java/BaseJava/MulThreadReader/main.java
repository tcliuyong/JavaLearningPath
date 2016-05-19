package BaseJava.MulThreadReader;

public class main {

	public static void main(String[] args) throws InterruptedException {
		Buffer bf = new Buffer();
		Reader r = new Reader(bf);
		Writer w = new Writer(bf);
		Thread tr = new Thread(r);
		Thread tw = new Thread(w);
		tr.start();
		tw.start();
	}
}
