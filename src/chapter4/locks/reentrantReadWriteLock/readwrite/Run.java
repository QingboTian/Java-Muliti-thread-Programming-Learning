package chapter4.locks.reentrantReadWriteLock.readwrite;

/**
 * 
 * <p>Title: Run.java</p>
 * <p>Description: 
 * 读写、写读同步执行
 * <p>
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年6月16日上午11:36:02
 * @version 1.0
 *
 */
public class Run {
	public static void main(String[] args) {
		Service service = new Service();
		new Thread(() -> {
			service.read();
		}, "A").start();

		new Thread(() -> {
			service.write();
		}, "B").start();
	}
}
