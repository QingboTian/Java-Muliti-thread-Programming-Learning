package chapter3.producerconsumer;

public class Run {
	public static void main(String[] args) {
		Count c = new Count();
		Object lock = new Object();
		Consumer consumer = new Consumer(c, lock);
		Producer producer = new Producer(c, lock);
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true){
					consumer.sub();
				}
			}
		},"C").start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true){
					producer.add();
				}
			}
		},"P").start();
	}
}
