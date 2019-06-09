package chapter3.producerconsumer;

public class Producer {
	private Count c;
	private Object lock;

	public Producer(Count c, Object lock) {
		super();
		this.c = c;
		this.lock = lock;
	}

	public void add() {
		synchronized (lock) {
			if (c.getCount() < 5) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				c.setCount(c.getCount() + 1);
				System.out.println("生产+1，当前count = " + c.getCount());
				lock.notify();
			} else {
				try {
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
