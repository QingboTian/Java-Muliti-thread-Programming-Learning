package chapter4.locks.fairLockandUnfairLock;

/**
 * 
 * <p>
 * Title: Run.java
 * </p>
 * <p>
 * Description: 通过查看多个线程的开始运行的次序和执行run方法的次序是否一致 
 * 一致则是公平锁，不一致则是非公平锁
 * <p>
 * 
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年6月13日上午12:15:19
 * @version 1.0
 *
 */
public class Run {
	public static void main(String[] args) {
		//boolean fair = true;// 公平锁
		boolean fair = false;// 非公平锁
		Service service = new Service(fair);

		Thread[] t = new Thread[10];
		for (int i = 0; i < t.length; i++) {
			t[i] = new Thread(() -> {
				String name = Thread.currentThread().getName();
				System.out.println(name + "运行了");
				service.method();
			});
		}
		
		for (int i = 0; i < t.length; i++) {
			t[i].start();
		}
	}
}
