package chapter4.locks.lockMethodTest.test1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * <p>Title: Service.java</p>
 * <p>Description: 
 * getHoldCount()方法
 * 查询当前线程保持此锁的次数。 
 * 对于与解除锁操作不匹配的每个锁操作，线程都会保持一个锁。 
 * 保持计数信息通常只用于测试和调试。
 * <p>
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年6月13日下午4:27:37
 * @version 1.0
 *
 */
public class Service {
	private ReentrantLock lock = new ReentrantLock();
	
	public void method1(){
		lock.lock();
		
		System.out.println("Current Thread Name:" + Thread.currentThread().getName() + " getHoldCount():" + lock.getHoldCount());
		method2();
		System.out.println("Current Thread Name:" + Thread.currentThread().getName() + " getHoldCount():" + lock.getHoldCount());
		
		lock.unlock();
	}
	
	public void method2(){
		lock.lock();
		
		System.out.println("getHoldCount():" + lock.getHoldCount());
		
		lock.unlock();
	}
}
