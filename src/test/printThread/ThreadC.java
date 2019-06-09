package test.printThread;

public class ThreadC extends Thread{
	private PrintThread printThread;
	
	public ThreadC(PrintThread printThread) {
		super();
		this.printThread = printThread;
	}

	@Override
	public void run() {
		printThread.printName();
	}
}
