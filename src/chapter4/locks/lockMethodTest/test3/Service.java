package chapter4.locks.lockMethodTest.test3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * <p>Title: Service.java</p>
 * <p>Description: 
 * getWaitQueueLength(Condition condition)
 * 返回等待与此锁相关的给定条件的线程估计数。
 * 注意，因为随时可能发生超时和中断，所以只能将估计值作为实际等待线程数的上边界。
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
	Condition c = lock.newCondition();
	
	public void method(){	
		lock.lock();
		
		try {
			String name = Thread.currentThread().getName();
			System.out.println(name + "进入等待队列");
			c.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		lock.unlock();
	}
	
	public void getWaitQueueLength(){
		lock.lock();
		c.signal();
		System.out.println("等待队列数："+lock.getWaitQueueLength(c));
		//c.signalAll();
		lock.unlock();
	}
}
