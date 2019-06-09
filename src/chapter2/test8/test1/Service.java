package chapter2.test8.test1;
/**
 * 
 * <p>Title: Service.java</p>
 * <p>Description: 
 * 	多个线程执行synchronized(x)方法 同步
 * <p>
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年5月25日
 * @version 1.0
 *
 */
public class Service {
	public void testMethod(MyObject object){
		try {
			synchronized (object) {
				System.out.println("current thread name:"+ Thread.currentThread().getName() + " in:" + System.currentTimeMillis());
				Thread.sleep(2000);
				System.out.println("current thread name:"+ Thread.currentThread().getName() + " out:" + System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
