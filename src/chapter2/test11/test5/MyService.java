package chapter2.test11.test5;

public class MyService {
	String lock = "123";
	
	public void method(){
		String name = Thread.currentThread().getName();
		System.out.println("current thread name:" + name + " in:" + System.currentTimeMillis());
		lock = "456";// 更换锁，即对象发生了变化
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("current thread name:" + name + " out:" + System.currentTimeMillis());
	}
}
