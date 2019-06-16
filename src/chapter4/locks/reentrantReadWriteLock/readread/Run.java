package chapter4.locks.reentrantReadWriteLock.readread;

/**
 * 
 * <p>
 * Title: Run.java
 * </p>
 * <p>
 * Description: 读读操作，异步执行
 * <p>
 * 
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年6月16日上午11:30:04
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
			service.read();
		}, "B").start();
	}
}
