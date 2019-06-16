package chapter4.locks.reentrantReadWriteLock.readwrite;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {
	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

	public void read() {
		try {
			lock.readLock().lock();// readLock方法返回ReadLock内置类对象

			System.out.println("Current Thread Name:" + Thread.currentThread().getName() + " read begin:"
					+ System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("Current Thread Name:" + Thread.currentThread().getName() + " read end  :"
					+ System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.readLock().unlock();
		}
	}

	public void write() {
		try {
			lock.writeLock().lock();// readLock方法返回ReadLock内置类对象

			System.out.println("Current Thread Name:" + Thread.currentThread().getName() + " write begin:"
					+ System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("Current Thread Name:" + Thread.currentThread().getName() + " write end  :"
					+ System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.writeLock().unlock();
		}
	}
}
