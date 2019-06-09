package chapter2.test11.test4;

import chapter2.test11.test4.OuterClass.InnerClass;

/**
 * <p>Title: Run.java</p>
 * <p>Description: 
 * 执行内部类中两个方法，相同的锁，异步，执行外部类方法，不同的锁，异步
 * <p>
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年6月1日下午5:39:24
 * @version 1.0
 *
 */
public class Run {
	public static void main(String[] args) {
		InnerClass inner = new OuterClass().new InnerClass();
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
		
		// 执行外部类方法
		OuterClass out = new OuterClass();
		Thread c = new Thread(new Runnable() {
			@Override
			public void run() {
				out.method();
			}
		}, "C");
		
		a.start();
		b.start();
		c.start();
	}
}
