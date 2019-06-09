package chapter2.test12.test2;

public class PrintString implements Runnable{
	private boolean continuePrint = true;

	public boolean isContinuePrint() {
		return continuePrint;
	}

	public void setContinuePrint(boolean continuePrint) {
		this.continuePrint = continuePrint;
	}
	
	public void printStringMethod(){
		while(continuePrint){
			System.out.println("run print method threadName:" + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		printStringMethod();
	}
}
