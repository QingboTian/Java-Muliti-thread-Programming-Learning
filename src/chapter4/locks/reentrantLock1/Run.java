package chapter4.locks.reentrantLock1;

/**
 * 
 * <p>Title: Run.java</p>
 * <p>Description: 
 * 使用ReentrantLock实现同步效果
 * <p>
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年6月9日下午8:54:38
 * @version 1.0
 *
 */
public class Run {
	public static void main(String[] args) {
		MyService service = new MyService();
		MyThread t1 = new MyThread(service);
		MyThread t2 = new MyThread(service);
		MyThread t3 = new MyThread(service);
		MyThread t4 = new MyThread(service);
		MyThread t5 = new MyThread(service);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
