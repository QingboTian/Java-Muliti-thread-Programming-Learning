package chapter4.locks.reentrantLock1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	// Lock对象
	private Lock lock = new ReentrantLock();
	
	public void method(){
		// 加锁 持有了对象监视器
		lock.lock();
		
		for (int i = 0; i < 3; i++) {
			System.out.println("current thread name:" + Thread.currentThread().getName() + " " + (i + 1));
		}
		
		// 释放锁
		lock.unlock();
	}
}
