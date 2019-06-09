package chapter3.threadlocal.inheritableThreadLocal2;

public class MyThreadLocal<T> extends InheritableThreadLocal<T> {
	
	@Override
	protected T initialValue() {
		return (T)("" + System.currentTimeMillis());
	}
	
	@Override
	protected T childValue(T parentValue) {
		return (T)(parentValue + "我继承了父亲的值，但是我还进行了修改:))");
	}
}
