package chapter2.test2;

/**
 * 多个对象多个锁
 * 线程安全
 * 采用异步的方式
 * @author tqb
 *
 */
public class Test1 {
	public static void main(String[] args) {
		HasSelfPrivateNum num1 = new HasSelfPrivateNum();
		HasSelfPrivateNum num2 = new HasSelfPrivateNum();
		
		ThreadA a = new ThreadA(num1);
		ThreadB b = new ThreadB(num2);
		
		a.start();
		b.start();
	}
}
