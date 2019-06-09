package chapter2.test9.test1;

public class ThreadB extends Thread{
	private Service service;

	public ThreadB(Service service) {
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.methodB();
	}
}
