package chapter2.test11.test5;

/**
 * <p>Title: Run.java</p>
 * <p>Description: 
 * 更换了锁的对象，线程之间异步运行
 * <p>
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年6月2日上午11:13:34
 * @version 1.0
 *
 */
public class Run {
	public static void main(String[] args) {
		MyService service = new MyService();
		new Thread(new Runnable() {
			@Override
			public void run() {
				service.method();
			}
		},"A").start();
		
		try {
			Thread.sleep(50);// 为更换锁的对象
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				service.method();
			}
		},"B").start();
	}
}
