package chapter4.locks.lockMethodTest.test7;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * <p>
 * Title: Service.java
 * </p>
 * <p>
 * Description: 
 * public boolean tryLock(long timeout, TimeUnit unit)
 * 如果锁在给定等待时间内没有被另一个线程保持，且当前线程未被中断，则获取该锁。 
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
		try {
			boolean tryLock = lock.tryLock(3, TimeUnit.SECONDS);// 3秒
			if (tryLock)
				System.out.println("Current Thread Name:" + Thread.currentThread().getName() + "获得锁");
			else
				System.out.println("Current Thread Name:" + Thread.currentThread().getName() + "没有获得锁");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if (lock.isHeldByCurrentThread()){
				System.out.println("unLock： " + Thread.currentThread().getName());
				lock.unlock();
			}
		}
		
	}
}