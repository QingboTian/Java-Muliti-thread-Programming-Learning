package chapter2.test10;

public class DeadLock implements Runnable{
	public String username;
	public Object lock1 = new Object();
	public Object lock2 = new Object();
	
	public void setUsername(String username){
		this.username = username;
	}
	
	@Override
	public void run() {
		
		if (username.equals("a")){
			synchronized (lock1) {
				System.out.println("username=" + username);
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				synchronized (lock2) {
					System.out.println("lock1 -> lock2");
				}
			}
		}
		
		if (username.equals("b")){
			synchronized (lock2) {
				System.out.println("username=" + username);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				synchronized (lock1) {
					System.out.println("lock2 -> lock1");
				}
			}
		}
		
	}
	
}
