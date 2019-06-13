package chapter4.locks.lockMethodTest.test3;

public class Run {
	public static void main(String[] args) {
		Service service = new Service();

		Thread[] t = new Thread[10];
		for (int i = 0; i < t.length; i++) {
			t[i] = new Thread(() -> {
				service.method();
			});
			t[i].start();
		}
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		service.getWaitQueueLength();
	}
}
