package chapter4.locks.useMoreCondition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * <p>Title: MyService.java</p>
 * <p>Description: 
 * 使用多个Condition唤醒指定线程
 * <p>
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年6月12日下午4:36:40
 * @version 1.0
 *
 */
public class MyService {
	private Lock lock = new ReentrantLock();
	public Condition condition_A = lock.newCondition();
	public Condition condition_B = lock.newCondition();
	
	public void awaitA(){
		try {
			lock.lock();
			System.out.println("current thread name:" + Thread.currentThread().getName() + " in:" + System.currentTimeMillis());
			condition_A.await();
			System.out.println("current thread name:" + Thread.currentThread().getName() + " out:" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	
	public void awaitB(){
		try {
			lock.lock();
			System.out.println("current thread name:" + Thread.currentThread().getName() + " in:" + System.currentTimeMillis());
			condition_B.await();
			System.out.println("current thread name:" + Thread.currentThread().getName() + " out:" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	
	public void signalAll_A(){
		try {
			lock.lock();
			System.out.println("唤醒A线程");
			condition_A.signalAll();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	
	public void signalAll_B(){
		try {
			lock.lock();
			System.out.println("唤醒B线程");
			condition_B.signalAll();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
}
