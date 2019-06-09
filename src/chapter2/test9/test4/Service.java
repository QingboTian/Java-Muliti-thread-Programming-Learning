package chapter2.test9.test4;

public class Service {
	public static void methodA(){
		synchronized (Service.class) {
			System.out.println("current thread name:" + Thread.currentThread().getName() + " in:" + System.currentTimeMillis());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("current thread name:" + Thread.currentThread().getName() + " out:" + System.currentTimeMillis());
		}
	}
	
	public static void methodB(){
		synchronized (Service.class) {
			System.out.println("current thread name:" + Thread.currentThread().getName() + " in:" + System.currentTimeMillis());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("current thread name:" + Thread.currentThread().getName() + " out:" + System.currentTimeMillis());
		}
	}
}
