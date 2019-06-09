package chapter3.threadlocal.test2;

/**
 * 
 * <p>Title: Run.java</p>
 * <p>Description: 
 * 继承ThreadLocal重写initialValue方法
 * 保证在第一次取值的时候有值
 * <p>
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年6月9日下午3:38:44
 * @version 1.0
 *
 */
public class Run {
	public static void main(String[] args) {
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		
		a.setName("A");
		b.setName("B");
		
		a.start();
		b.start();
	}
}
