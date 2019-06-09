package chapter2.test9.test1;

public class Service {
	synchronized public static void methodA(){
		System.out.println("current thread name:" + Thread.currentThread().getName() + " in:" + System.currentTimeMillis());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("current thread name:" + Thread.currentThread().getName() + " out:" + System.currentTimeMillis());
	}
	
	synchronized public void methodB(){
		System.out.println("current thread name:" + Thread.currentThread().getName() + " in:" + System.currentTimeMillis());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("current thread name:" + Thread.currentThread().getName() + " out:" + System.currentTimeMillis());
	}
}
