package chapter4.locks.lockMethodTest.test8;

public class Run {
	public static void main(String[] args) {
		Service service = new Service();
		new Thread(() -> {
			// 10s后自动唤醒
			service.waitMethod();
		}).start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		new Thread(() -> {
			// 2s后调用方法进行唤醒
			service.notifyMethod();
		}).start(); 
	}
}
