package chapter4.locks.lockMethodTest.test4;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * <p>
 * Title: Service.java
 * </p>
 * <p>
 * Description: 
 * public boolean isHeldByCurrentThread()
 * 查询当前线程是否保持此锁。 
 * 与内置监视器锁的 Thread.holdsLock(java.lang.Object) 方法类似，此方法通常用于调试和测试。
 * <p>
 * 
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年6月13日下午5:07:10
 * @version 1.0
 *
 */
public class Service {
	private ReentrantLock lock = new ReentrantLock();

	public void method() {
		System.out.println(lock.isHeldByCurrentThread());// false

		lock.lock();
		System.out.println(lock.isHeldByCurrentThread());// true

		lock.unlock();
	}
}
