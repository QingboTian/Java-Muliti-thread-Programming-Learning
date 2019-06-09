package chapter2.test7;

public class Service {
	private String username;
	private String password;
	
	//private Object obj = new Object();
	
	public void setUsernamePassword(String username, String password){
		try {
			Object obj = new Object();// 对象不同，异步进行
			synchronized (obj) {
				System.out.println("current thread name:"+ Thread.currentThread().getName() + " in:" + System.currentTimeMillis());
				this.username = username;
				Thread.sleep(3000);
				this.password = password;
				System.out.println("current thread name:"+ Thread.currentThread().getName() + " out:" + System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
