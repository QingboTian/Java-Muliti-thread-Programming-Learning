package chapter3.threadlocal.inheritableThreadLocal;

public class ThreadA extends Thread {
	@Override
	public void run() {
		System.out.println("在Thread-A中取值："+Tools.t.get());
	}
}
