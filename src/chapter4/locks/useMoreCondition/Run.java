package chapter4.locks.useMoreCondition;

/**
 * 
 * <p>Title: Run.java</p>
 * <p>Description: 
 * 唤醒指定的线程，Condition（通过Lock对象创建多个Condition对象，将不同的线程绑定到不同的Condition上就可以实现）
 * wait/notify无法指定线程，随机唤醒线程
 * <p>
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年6月12日下午4:54:20
 * @version 1.0
 *
 */
public class Run {
	public static void main(String[] args) {
		MyService service = new MyService();
		Thread a = new Thread(() -> {
			service.awaitA();
		},"A");
		
		Thread b = new Thread(() -> {
			service.awaitB();
		},"B");
		
		a.start();
		b.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// 只唤醒A线程
		service.signalAll_A();
	}
}
