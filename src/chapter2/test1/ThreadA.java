package chapter2.test1;

public class ThreadA extends Thread {
	private HasSelfPrivateNum num1;

	public ThreadA(HasSelfPrivateNum num1) {
		super();
		this.num1 = num1;
	}

	@Override
	public void run() {
		num1.addI("a");
	}
}
