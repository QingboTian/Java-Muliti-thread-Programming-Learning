package chapter6.singleton.enu_m;

/**
 * 
 * <p>Title: Run.java</p>
 * <p>Description: 
 * 地址相同
 * <p>
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年6月16日下午5:21:32
 * @version 1.0
 *
 */
public class Run {
	public static void main(String[] args) {
		Thread[] t = new Thread[3];
		for (int i = 0; i < t.length; i++) {
			t[i] = new Thread(() -> {
				MyObject obj = MyObject.getInstance();
				System.out.println(obj);
			});
			t[i].start();
		}
	}
}
