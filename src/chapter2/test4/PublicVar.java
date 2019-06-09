package chapter2.test4;

public class PublicVar {
	private String username = "a";
	private String password = "aa";
	
	synchronized public void setValue(String username,String password){
		try {
			this.username = username;
			Thread.sleep(5000);
			this.password = password;
			System.out.println("setValue method thread name=" + Thread.currentThread().getName() + 
					" username=" +username + " password=" + password);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	synchronized public void getValue(){
		System.out.println("getValue method thread name=" + Thread.currentThread().getName() + 
				" username=" +username + " password=" + password);
	}
}
