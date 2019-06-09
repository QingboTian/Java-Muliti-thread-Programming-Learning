package chapter3.threadlocal.test2;

public class Tools {
	public static MyThreadLocal<String> t = new MyThreadLocal<String>();
}

class MyThreadLocal<T> extends ThreadLocal<T>{
	@Override
	protected T initialValue() {
		return (T)(Thread.currentThread().getName() + "利用初始化方法");
	}
}