package chapter2.test3;

public class MyObject {
	synchronized public void methodA(){
		try {
			System.out.println("begin methodA threadName=" + Thread.currentThread().getName());
			Thread.sleep(5000);
			System.out.println("end endtime=" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	synchronized public void methodB(){
		try {
			System.out.println("begin methodB threadName=" + Thread.currentThread().getName() + "begin time=" + System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
