package chapter4.locks.lockMethodTest.test7;

public class Run {
	public static void main(String[] args) {
		Service service = new Service();

		new Thread(() -> {
			service.method();
		},"A").start();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		new Thread(() -> {
			service.method();
		},"B").start();
	}
}
