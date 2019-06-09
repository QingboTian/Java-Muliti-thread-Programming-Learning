package chapter2.test12.test1;

public class Run {
	public static void main(String[] args) {
		PrintString printString = new PrintString();
		new Thread(new Runnable() {
			@Override
			public void run() {
				printString.printStringMethod();
			}
		},"A").start();
		
		System.out.println("Stop it,Stop threadName:" + Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		printString.setContinuePrint(false);
	}
}
