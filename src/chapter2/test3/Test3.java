package chapter2.test3;

/**
 * 访问非synchronized方法时可以直接调用，采用异步的方式，无需等待先拿到对象对锁的释放
 * @author tqb
 *
 */
public class Test3 {
	public static void main(String[] args) {
		MyObject object = new MyObject();
		
		ThreadA a = new ThreadA(object);
		a.setName("a");
		ThreadB b = new ThreadB(object);
		b.setName("b");
		
		a.start();
		b.start();
	}
}
