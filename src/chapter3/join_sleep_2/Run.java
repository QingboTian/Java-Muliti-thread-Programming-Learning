package chapter3.join_sleep_2;

/**
 * 
 * <p>
 * Title: Run.java
 * </p>
 * <p>
 * Description: 
 * 证明join释放锁 若join释放锁，在等待2s之后线程B应该开始打印，然而结果就是2s之后线程B开始运行 
 * 证明了join释放锁
 * 注意：c.join()只会将c对象监视器上的锁进行释放，不会释放其它锁
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
		
		Thread c = new Thread(() -> {
			try {
				System.out.println("线程C开始执行了，线程A释放了锁，B开始运行了");
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		c.start();
		
		new Thread(() -> {
			synchronized (c) {
				System.out.println(
						"current thread name:" + Thread.currentThread().getName() + " in" + System.currentTimeMillis());
				
				try {
					c.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("current thread name:" + Thread.currentThread().getName() + " out"
						+ System.currentTimeMillis());
			}
		}, "A").start();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		new Thread(() -> {
			synchronized (c) {
				System.out.println(
						"current thread name:" + Thread.currentThread().getName() + " in" + System.currentTimeMillis());
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("current thread name:" + Thread.currentThread().getName() + " out"
						+ System.currentTimeMillis());
			}
		}, "B").start();

	}
}
