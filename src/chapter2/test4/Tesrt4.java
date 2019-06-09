package chapter2.test4;

/**
 * 脏读现象
 * 给getValue方法加锁 避免脏读
 * @author tqb
 *
 */
public class Tesrt4 {
	public static void main(String[] args) {
		try {
			PublicVar publicVar = new PublicVar();
			ThreadB b = new ThreadB(publicVar);
			b.setName("B");
			b.start();
			Thread.sleep(500);// 值越小（小于5000），越容易出现脏读现象
			publicVar.getValue();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
