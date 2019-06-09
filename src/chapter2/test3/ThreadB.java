package chapter2.test3;

public class ThreadB extends Thread {
	private MyObject myObject;

	public ThreadB(MyObject myObject) {
		super();
		this.myObject = myObject;
	}
	
	@Override
	public void run() {
		super.run();
		myObject.methodB();
	}
}
