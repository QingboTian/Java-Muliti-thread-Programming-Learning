package chapter4.locks.producerConsumer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Producer {
	
	private Lock lock;
	private Condition c;
	
	public Producer(Lock lock,Condition c) {
		this.lock = lock;
		this.c = c;
	}

	public void add(){
		try {
			lock.lock();
			if (Count.count < 5){
				Count.count++;
				System.out.print(Thread.currentThread().getName() + "+1");
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
