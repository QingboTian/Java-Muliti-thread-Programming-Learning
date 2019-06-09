package test.printThread;

public class ThreadB extends Thread{
private PrintThread printThread;
	
	public ThreadB(PrintThread printThread) {
		super();
		this.printThread = printThread;
	}

	@Override
	public void run() {
		printThread.printName();
	}
}
