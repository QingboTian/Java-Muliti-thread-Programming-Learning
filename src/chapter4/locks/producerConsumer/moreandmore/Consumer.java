package chapter4.locks.producerConsumer.moreandmore;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Consumer {
	private Lock lock;
	private Condition c;
	
	public Consumer(Lock lock,Condition c) {
		this.lock = lock;
		this.c = c;
	}

	public void sub(){
		try {
			lock.lock();
			if (Count.count > 0){
				Count.count--;
				System.out.print(Thread.currentThread().getName() + " -1");
				System.out.println(" Current count = " + Count.count);
				c.signalAll();
			}else{
				c.await();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
}
