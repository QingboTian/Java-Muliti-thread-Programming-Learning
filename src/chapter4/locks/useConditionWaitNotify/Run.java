package chapter4.locks.useConditionWaitNotify;

/**
 * 
 * <p>Title: Run.java</p>
 * <p>Description: 
 * 使用Condition实现等待/通知
 * <p>
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年6月9日下午9:38:01
 * @version 1.0
 *
 */
public class Run {
	public static void main(String[] args) {
		MyService service = new MyService();
		
		new Thread(() -> {
			service.await();
		}).start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		service.signal();
	}
}
