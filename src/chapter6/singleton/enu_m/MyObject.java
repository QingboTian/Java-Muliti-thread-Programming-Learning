package chapter6.singleton.enu_m;

/**
 * 
 * <p>
 * Title: MyObject.java
 * </p>
 * <p>
 * Description: 枚举方式实现单例模式
 * <p>
 * 
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年6月16日下午5:38:27
 * @version 1.0
 *
 */
// TODO 枚举方式实现单例模式
public class MyObject {
	// 调用枚举类时，构造方法默认调用
	public enum EnumSingleton {
		objectFactory;
		private MyObject obj;

		private EnumSingleton() {
			obj = new MyObject();
		}

		public MyObject getInstance() {
			return obj;
		}
	}

	public static MyObject getInstance() {
		return EnumSingleton.objectFactory.getInstance();
	}
}
