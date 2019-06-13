package chapter4.locks.lockMethodTest.test6;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * <p>
 * Title: Service.java
 * </p>
 * <p>
 * Description: 
 * public boolean tryLock()
 * 仅在调用时锁未被另一个线程保持的情况下，才获取该锁。 
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
			boolean tryLock = lock.tryLock();
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