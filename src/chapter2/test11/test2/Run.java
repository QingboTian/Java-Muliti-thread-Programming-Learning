package chapter2.test11.test2;

import chapter2.test11.test2.OuterClass.InnerClass;

/**
 * <p>Title: Run.java</p>
 * <p>Description: 
 * 执行内部类中两个方法，不同的锁，异步
 * <p>
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年6月1日下午5:39:24
 * @version 1.0
 *
 */
public class Run {
	public static void main(String[] args) {
		InnerClass inner  = new InnerClass();
		Thread a = new Thread(new Runnable() {
			@Override
			public void run() {
				inner.methodA();
			}
		}, "A");
		
		Thread b = new Thread(new Runnable() {
			@Override
			public void run() {
				inner.methodB();
			}
		}, "B");
		
		a.start();
		b.start();
	}
}
