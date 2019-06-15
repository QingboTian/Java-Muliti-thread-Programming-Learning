package chapter4.locks.lockMethodTest.test8;

import java.util.Calendar;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * <p>Title: Service.java</p>
 * <p>Description: 
 * awaitUntil(Date deadline)  
 * 造成当前线程在接到信号、被中断或到达指定最后期限之前一直处于等待状态。
 * 在等待的过程中可以被唤醒
 * <p>
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年6月15日下午4:19:36
 * @version 1.0
 *
 */
public class Service {
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	
	public void waitMethod(){
		try {
			lock.lock();
			System.out.println("wait begin:" + System.currentTimeMillis());
			Calendar c = Calendar.getInstance();
			c.add(Calendar.SECOND, 10);
			condition.awaitUntil(c.getTime());
			System.out.println("wait end  :" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	
	public void notifyMethod(){
		lock.lock();
		System.out.println("notify time:" + System.currentTimeMillis());
		condition.signalAll();
		lock.unlock();
		
	}
}
