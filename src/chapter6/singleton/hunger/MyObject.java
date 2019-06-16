package chapter6.singleton.hunger;

public class MyObject {
	private static MyObject obj = new MyObject();

	// 私有化构造器
	private MyObject() {
	}

	public static MyObject getInstance() {
		return obj;
	}
}
