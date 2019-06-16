package chapter6.singleton.stati_c;

/**
 * 
 * <p>Title: MyObject.java</p>
 * <p>Description: 
 * 使用静态代码块实现（同理饿汉模式）
 * <p>
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年6月16日下午5:32:00
 * @version 1.0
 *
 */
public class MyObject {
	private static MyObject obj;
	
	private MyObject(){}
	
	static {
		obj = new MyObject();
	}
	
	public static MyObject getInstance(){
		return obj;
	}
}
