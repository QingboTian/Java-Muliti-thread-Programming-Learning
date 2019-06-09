package chapter3.producerconsumer.copy;

public class Run {
	public static void main(String[] args) {
		Count c = new Count();
		Object lock = new Object();
		Consumer consumer = new Consumer(c, lock);
		Producer producer = new Producer(c, lock);

		Thread[] pThread = new Thread[2];
		Thread[] cThread = new Thread[2];

		for (int i = 0; i < 2; i++) {
			pThread[i] = new Thread(() -> {
				while (true) {
					producer.add();
				}
			}, "生产者" + (i + 1));
			cThread[i] = new Thread(() -> {
				while (true) {
					consumer.sub();
				}
			}, "消费者" + (i + 1));
		}
		for (int i = 0; i < 2; i++) {
			pThread[i].start();
			cThread[i].start();
		}
	}
}
