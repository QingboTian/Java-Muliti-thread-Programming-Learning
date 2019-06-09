package chapter3.threadlocal.inheritableThreadLocal2;

/**
 * 
 * <p>Title: Run.java</p>
 * <p>Description: 
 * 子线程继承父线程的值再进行修改
 * 使用类InheritableThreadLocal
 * 重写childValue方法
 * 如果子线程在取值的过程中，父线程对值进行修改，那么子线程取得值还是旧的
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
