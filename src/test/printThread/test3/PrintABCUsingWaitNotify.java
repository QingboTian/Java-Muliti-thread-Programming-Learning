package test.printThread.test3;

/**
 * 
 * <p>
 * Title: PrintABCUsingWaitNotify.java
 * </p>
 * <p>
 * Description:
 * AAAAAAAAAABBBBBBBBBBCCCCCCCCCC
 * <p>
 * 
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年6月7日下午5:29:58
 * @version 1.0
 *
 */
public class PrintABCUsingWaitNotify {
	private int times;// 打印的次数
	private int state = 0;// 打印的状态
	private Object objectA = new Object();
	private Object objectB = new Object();
	private Object objectC = new Object();

	public PrintABCUsingWaitNotify(int times) {
		super();
		this.times = times;
	}

	public void printA() {
		print("A", 0, objectA, objectB);
	}

	public void printB() {
		print("B", 1, objectB, objectC);
	}

	public void printC() {
		print("C", 2, objectC, objectA);
	}

	public void print(String name, int targetState, Object curr, Object next) {
		synchronized (curr) {
			while (state % 3 != targetState) {// 这里也可以使用if
				try {
					curr.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			state++;
			for (int i = 0; i < times; i++) {
				System.out.print(name);
			}
			synchronized (next) {
				next.notify();
			}
		}
	}

	public static void main(String[] args) {
		PrintABCUsingWaitNotify p = new PrintABCUsingWaitNotify(10);
		new Thread(new Runnable() {
			@Override
			public void run() {
				p.printC();
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				p.printB();
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				p.printA();
			}
		}).start();
	}
}
