package chapter2.test9.test1;

/**
 * <p>Title: Run.java</p>
 * <p>Description: 
 * 锁对象不同，a方法为类锁，b方法为对象锁，所以异步执行
 * <p>
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年5月25日
 * @version 1.0
 *
 */
public class Run {
	public static void main(String[] args) {
		Service service = new Service();
		
		ThreadA a = new ThreadA(service);
		ThreadB b = new ThreadB(service);
		a.setName("a");
		b.setName("b");
		
		a.start();
		b.start();
	}
}
