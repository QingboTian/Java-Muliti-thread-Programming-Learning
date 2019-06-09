package chapter2.test11.test3;

public class OuterClass {
	synchronized public void method(){
		System.out.println("in:" + System.currentTimeMillis());
		System.out.println("current thread name:" + Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("out:" + System.currentTimeMillis());
	}
	
	static class InnerClass{
		public void methodA(){
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
		
		synchronized public void methodB(){
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
