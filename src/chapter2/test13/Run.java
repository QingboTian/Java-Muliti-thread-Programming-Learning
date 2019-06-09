package chapter2.test13;
/**
 * <p>Title: Run.java</p>
 * <p>Description: 
 * 原子类操作（保证原子性）
 * <p>
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年6月2日下午4:36:00
 * @version 1.0
 *
 */
public class Run {
	public static void main(String[] args) {
		AddCountThread countService = new AddCountThread();
		
		// 开5个线程 加到50000
		new Thread(countService).start();
		new Thread(countService).start();
		new Thread(countService).start();
		new Thread(countService).start();
		new Thread(countService).start();
	}
}
