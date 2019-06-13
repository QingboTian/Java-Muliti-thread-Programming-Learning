package chapter4.locks.lockMethodTest.test2;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * <p>Title: Service.java</p>
 * <p>Description: 
 * getQueueLength()
 * 查看等待获得锁的线程个数
 * 返回正等待获取此锁的线程估计数。该值仅是估计的数字，
 * 因为在此方法遍历内部数据结构的同时，线程的数目可能动态地变化。
 * 此方法用于监视系统状态，不用于同步控制。 
 * <p>
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年6月13日下午5:07:10
 * @version 1.0
 *
 */
public class Service {
	private ReentrantLock lock = new ReentrantLock();
	
	public void method(){	
		lock.lock();
		
		String name = Thread.currentThread().getName();
		System.out.println(name + "进入方法");
		try {
			Thread.sleep(5000);// 不释放锁，使用await会释放锁
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		lock.unlock();
	}
	
	public void getQueueLength(){
		System.out.println(lock.getQueueLength());
	}
}
