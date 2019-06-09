package chapter4.locks.useConditionWaitNotify;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private Lock lock = new ReentrantLock();
	// 创建lock对象的对象监视器，线程对象可以指定注册到Condition中
	public Condition condition = lock.newCondition();

	public void await() {
		try {
			// 使用await必须使用lock方法获得锁，否则报错
			// 和wait必须在synchronized中同理
			lock.lock();
			System.out.println("in:" + System.currentTimeMillis());

			System.out.println("线程进入等待队列");
			condition.await();
			System.out.println("线程唤醒");

			System.out.println("out:" + System.currentTimeMillis());

		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {// 规范写法，防止出现异常锁无法释放
			lock.unlock();
		}
	}

	public void signal() {
		// 使用signal必须使用lock方法获得锁，否则报错
		// 和notify必须在synchronized中同理
		lock.lock();

		condition.signal();

		lock.unlock();
	}
}
