package chapter3.producerconsumer.copy;

public class Consumer {
	private Count c;
	private Object lock;

	public Consumer(Count c, Object lock) {
		super();
		this.c = c;
		this.lock = lock;
	}

	public void sub() {
		synchronized (lock) {
			if (c.getCount() > 0) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				c.setCount(c.getCount() - 1);
				System.out.println(Thread.currentThread().getName() + " 消费-1，当前count = " + c.getCount());
				lock.notifyAll();
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
