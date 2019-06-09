package chapter3.threadlocal.inheritableThreadLocal;

/**
 * 
 * <p>Title: Run.java</p>
 * <p>Description: 
 * 子线程继承父线程的值
 * 使用类InheritableThreadLocal
 * 子线程获得的值和父线程的一样
 * <p>
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年6月9日下午3:38:44
 * @version 1.0
 *
 */
public class Run {
	public static void main(String[] args) {
		
		System.out.println("Main线程中取值："+Tools.t.get());
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		ThreadA a = new ThreadA();
		a.setName("A");
		a.start();
	}
}
