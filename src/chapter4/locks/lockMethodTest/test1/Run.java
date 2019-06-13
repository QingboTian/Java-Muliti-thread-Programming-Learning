package chapter4.locks.lockMethodTest.test1;

public class Run {
	public static void main(String[] args) {
		Service service = new Service();
		Thread a = new Thread(()->{
				service.method1();
		},"A");
		
		Thread b = new Thread(()->{
			service.method2();
		},"B");
		
		a.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		b.start();
	}
}
