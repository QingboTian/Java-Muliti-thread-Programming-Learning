package chapter4.locks.reentrantReadWriteLock.readread;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 
 * <p>Title: Service.java</p>
 * <p>Description: 
 * ReentrantLock在进行多线程操作的时候，无论读写都会锁住lock方法后边的代码，即同一时间只有一个线程在执行
 * 为了提高效率，出现了ReentrantReadWriteLock，支持读（共享）写（排他）操作
 * （读读异步）、(读写，写读、读写、写写同步)
 * <p>
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年6月16日上午11:20:06
 * @version 1.0
 *
 */
public class Service {
	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	
	public void read(){
		try {
			lock.readLock().lock();// readLock方法返回ReadLock内置类对象
			
			System.out.println("Current Thread Name:" + Thread.currentThread().getName() + " read begin:" + System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("Current Thread Name:" + Thread.currentThread().getName() + " read end  :" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.readLock().unlock();
		}
	}
}
