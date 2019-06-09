package chapter2.test1;

public class ThreadB extends Thread {
	private HasSelfPrivateNum num2;

	public ThreadB(HasSelfPrivateNum num2) {
		super();
		this.num2 = num2;
	}

	@Override
	public void run() {
		num2.addI("b");
	}
}
