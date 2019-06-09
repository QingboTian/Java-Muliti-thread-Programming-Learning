package wait_notify_AB;

public class PrintAB {
	private boolean flag = false;// 默认值保证谁先执行
	private int times;
	
	public PrintAB(int times) {
		this.times = times;
	}
	
	synchronized public void printA(){
		try {
			while (flag){
				this.wait();
			}
			for (int i = 0; i < times; i++) {
				System.out.print(Thread.currentThread().getName());
				//System.out.print("A");
			}
			flag = true;
			this.notifyAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	synchronized public void printB(){
		try {
			while (!flag){
				this.wait();
			}
			for (int i = 0; i < times; i++) {
				System.out.print(Thread.currentThread().getName());
				//System.out.print("B");
			}
			flag = false;
			this.notifyAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
