package chapter2.test10;

/**
 * <p>Title: Run.java</p>
 * <p>Description: 
 * 死锁的产生
 * <p>
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年5月25日下午2:55:46
 * @version 1.0
 *
 */
public class Run {
	public static void main(String[] args) {
		DeadLock deadLock = new DeadLock();
		deadLock.setUsername("a");
		Thread t1 = new Thread(deadLock);
		t1.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		deadLock.setUsername("b");
		Thread t2 = new Thread(deadLock);
		t2.start();
	}
}
