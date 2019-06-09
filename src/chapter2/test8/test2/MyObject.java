package chapter2.test8.test2;

public class MyObject {
	synchronized public void objMethod(){
		System.out.println("in:" + System.currentTimeMillis());
		System.out.println("current thread name:" + Thread.currentThread().getName());
		System.out.println("out:" + System.currentTimeMillis());
	}
}
