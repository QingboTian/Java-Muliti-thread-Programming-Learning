package chapter2.test;

public class Demo1 {
	public static void main(String[] args) {
		A a = new A();
		new Thread(){
			public void run() {
				a.methodA();
			};
		}.start();
		
		new Thread(){
			public void run() {
				a.methodB();
			};
		}.start();
	}
} 

class A{
	private Object obj = new Object();
	public void methodA(){
		synchronized (obj) {
			System.out.println("methodA");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	synchronized public void methodB(){
		System.out.println("methodB");
	}
}
