package chapter2.test12.test3;

public class PrintString implements Runnable{
	//private boolean continuePrint = true;
	volatile private boolean continuePrint = true;
	
	public boolean isContinuePrint() {
		return continuePrint;
	}

	public void setContinuePrint(boolean continuePrint) {
		this.continuePrint = continuePrint;
	}
	
	public void printStringMethod(){
		System.out.println("start");
		while(continuePrint){
			//System.out.println("run print method threadName:" + Thread.currentThread().getName());
		}
		System.out.println("stop");
	}

	@Override
	public void run() {
		printStringMethod();
	}
}
