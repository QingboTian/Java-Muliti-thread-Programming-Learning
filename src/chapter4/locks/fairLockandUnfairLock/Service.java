package chapter4.locks.fairLockandUnfairLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * <p>Title: Service.java</p>
 * <p>Description: 
 * 公平锁与非公平锁
 * ReentrantLock(boolean fair)
 * fair - 如果此锁应该使用公平的排序策略，则该参数为 true
 * <p>
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年6月13日上午12:12:51
 * @version 1.0
 *
 */
public class Service {
	private Lock lock;
	
	public Service(boolean fair){
		lock = new ReentrantLock(fair);
	}
	
	public void method(){
		lock.lock();
		
		System.out.println("Current Thread :" + Thread.currentThread().getName() + " 获得锁");
		
		lock.unlock();
	}
}
