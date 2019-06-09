package test.printThread;

public class Run {
	public static void main(String[] args) {
		PrintThread printThread = new PrintThread();
		ThreadA a = new ThreadA(printThread);
		a.setName("A");
		ThreadB b = new ThreadB(printThread);
		b.setName("B");
		ThreadC c = new ThreadC(printThread);
		c.setName("C");
		
		for (int i = 0; i < 10; i++) {
			try {
				a.start();
				Thread.sleep(100);
				b.start();
				Thread.sleep(200);
				c.start();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
