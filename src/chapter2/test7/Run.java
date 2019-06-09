package chapter2.test7;

/**
 * 
 * <p>
 * Title: Run.java
 * </p>
 * <p>
 * Description: 任意对象作为对象监视器
 * <p>
 * 
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年5月24日
 * @version 1.0
 *
 */
public class Run {
	public static void main(String[] args) {
		Service service = new Service();

		ThreadA a = new ThreadA(service);
		a.setName("a");

		ThreadB b = new ThreadB(service);
		b.setName("b");

		a.start();
		b.start();
	}
}