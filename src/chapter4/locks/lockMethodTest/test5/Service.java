package chapter4.locks.lockMethodTest.test5;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * <p>
 * Title: Service.java
 * </p>
 * <p>
 * Description: 
 * public boolean isLocked()
 * 查询此锁是否由任意线程保持。此方法用于监视系统状态，不用于同步控制。 
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
		System.out.println(lock.isLocked());// false

		lock.lock();
		System.out.println(lock.isLocked());// true

		lock.unlock();
	}
}
