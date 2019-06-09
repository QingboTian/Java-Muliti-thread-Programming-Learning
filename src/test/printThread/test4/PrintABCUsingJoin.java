package test.printThread.test4;

public class PrintABCUsingJoin {
	public static void main(String[] args) {
		Thread a  = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.print("A");
			}
		});
		Thread b  = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					a.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.print("B");
			}
		});
		Thread c  = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					b.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.print("C");
			}
		});
		
		for (int i = 0; i < 10; i++) {
				a.run();
				b.run();
				c.run();
		}
	}
}
