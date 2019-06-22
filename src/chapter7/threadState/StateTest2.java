package chapter7.threadState;

public class StateTest2 {
	public static void main(String[] args) {
		Service service = new Service();
		Thread t1 = new Thread(() -> {
			service.method();
		},"A");
		Thread t2 = new Thread(() -> {
			service.method();
		},"B");
		
		t1.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		System.out.println("线程A的状态" + t1.getState());
		System.out.println("线程B的状态" + t2.getState());
	}
}

class Service{
	synchronized public void method(){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
