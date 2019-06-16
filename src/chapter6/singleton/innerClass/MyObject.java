package chapter6.singleton.innerClass;

/**
 *
 * <p>Title: MyObject.java</p>
 * <p>Description: 
 * 使用内部类实现单例模式
 * <p>
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年6月16日下午5:29:01
 * @version 1.0
 *
 */
public class MyObject {
	private static class Handler{// 私有化
		private static MyObject obj = new MyObject();
	}
	
	private MyObject(){
		
	}
	
	public static MyObject getInstance(){
		return Handler.obj;
	}
}
