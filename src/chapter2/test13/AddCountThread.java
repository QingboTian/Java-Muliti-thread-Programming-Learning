package chapter2.test13;

import java.util.concurrent.atomic.AtomicInteger;

public class AddCountThread extends Thread{
	/**
	 * 参数默认为0，表示从0开始
	 */
	private AtomicInteger count = new AtomicInteger(0);
	
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println("current thread name:" + Thread.currentThread().getName() + " " + count.incrementAndGet());// 自增1
		}
	}
}
