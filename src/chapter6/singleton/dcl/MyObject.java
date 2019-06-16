package chapter6.singleton.dcl;

/**
 * 
 * <p>Title: MyObject.java</p>
 * <p>Description: 
 * 使用DCL实现单例模式
 * DCL（Double Check Lock）
 * <p>
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年6月16日下午5:16:27
 * @version 1.0
 *
 */
public class MyObject {
	private static MyObject obj = null;
	
	// 私有化构造器
	private MyObject(){	
	}
	
	public static MyObject getInstance(){
		if (obj == null){
			synchronized (MyObject.class) {
				if (obj == null){
					obj = new MyObject();
				}
			}
		}
		return obj;
	}
}
