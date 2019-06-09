package chapter2.test8.test3;

public class MyObject {
	public void objMethod(){
		synchronized (this) {
			System.out.println("in:" + System.currentTimeMillis());
			System.out.println("current thread name:" + Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("out:" + System.currentTimeMillis());
		}
	}
}
