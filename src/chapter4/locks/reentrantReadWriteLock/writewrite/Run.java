package chapter4.locks.reentrantReadWriteLock.writewrite;

/**
 * 
 * <p>Title: Run.java</p>
 * <p>Description: 
 * 写写操作 同步
 * <p>
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年6月16日上午11:43:22
 * @version 1.0
 *
 */
public class Run {
	public static void main(String[] args) {
		Service service = new Service();
		new Thread(() -> {
			service.write();
		}, "A").start();

		new Thread(() -> {
			service.write();
		}, "B").start();
	}
}
