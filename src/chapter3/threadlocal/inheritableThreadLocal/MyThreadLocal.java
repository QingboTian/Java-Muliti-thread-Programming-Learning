package chapter3.threadlocal.inheritableThreadLocal;

public class MyThreadLocal<T> extends InheritableThreadLocal<T> {
	
	@Override
	protected T initialValue() {
		return (T)("" + System.currentTimeMillis());
	}
}
