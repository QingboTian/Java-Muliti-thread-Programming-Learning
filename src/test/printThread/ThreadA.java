package test.printThread;

public class ThreadA extends Thread {
	private PrintThread printThread;

	public ThreadA(PrintThread printThread) {
		super();
		this.printThread = printThread;
	}

	@Override
	public void run() {
		printThread.printName();
	}
}
