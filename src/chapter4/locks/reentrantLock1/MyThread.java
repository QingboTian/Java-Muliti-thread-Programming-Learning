package chapter4.locks.reentrantLock1;

public class MyThread extends Thread {
	private MyService service;

	public MyThread(MyService service) {
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		service.method();
	}
}
