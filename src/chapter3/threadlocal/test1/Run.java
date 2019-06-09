package chapter3.threadlocal.test1;

/**
 * 
 * <p>Title: Run.java</p>
 * <p>Description: 
 * 验证线程变量的隔离性
 * 第一次在ThreadLocal中取值是为null的，为了让第一次有值，看test2
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
		
		a.start();
		b.start();
	}
}
