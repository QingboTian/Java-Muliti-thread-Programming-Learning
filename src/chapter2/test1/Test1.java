package chapter2.test1;

/**
 * 多个线程访问一个对象
 * 线程不安全
 * 这里实现线程安全的方式是加锁
 * @author tqb
 *
 */
public class Test1 {
	public static void main(String[] args) {
		HasSelfPrivateNum num = new HasSelfPrivateNum();
		
		ThreadA a = new ThreadA(num);
		ThreadB b = new ThreadB(num);
		
		a.start();
		b.start();
	}
}
