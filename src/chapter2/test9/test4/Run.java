package chapter2.test9.test4;

/**
 * 
 * <p>Title: Run.java</p>
 * <p>Description: 
 * 两个类对象 两个方法也都使用synchronized(Service.class) 同步执行
 * <p>
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年5月25日下午1:52:56
 * @version 1.0
 *
 */
public class Run {
	public static void main(String[] args) {
		Service service1 = new Service();
		Service service2 = new Service();
		ThreadA a = new ThreadA(service1);
		ThreadB b = new ThreadB(service2);
		a.setName("a");
		b.setName("b");

		a.start();
		b.start();
	}
}
