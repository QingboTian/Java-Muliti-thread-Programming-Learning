package chapter3.join_sleep_1;

/**
 * 
 * <p>
 * Title: Run.java
 * </p>
 * <p>
 * Description: 证明sleep不释放锁
 * 若sleep释放锁，在等待2s之后线程B应该开始打印，然而并不是，最终结果是线程A运行完之后B才开始运行
 * 证明了sleep并不释放锁
 * <p>
 * 
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年6月9日下午12:34:17
 * @version 1.0
 *
 */
public class Run {
	public static void main(String[] args) {
		// ab拥有的锁
		Object a_b_lock = new Object();
		new Thread(() -> {
			synchronized (a_b_lock) {
				System.out.println("current thread name:" + Thread.currentThread().getName() + 
						" in" + System.currentTimeMillis());
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("current thread name:" + Thread.currentThread().getName() + 
						" out" + System.currentTimeMillis());
			}
		}, "A").start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		new Thread(() -> {
			synchronized (a_b_lock) {
				System.out.println("current thread name:" + Thread.currentThread().getName() + 
						" in" + System.currentTimeMillis());
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("current thread name:" + Thread.currentThread().getName() + 
						" out" + System.currentTimeMillis());
			}
		}, "B").start();
		
		
	}
}
