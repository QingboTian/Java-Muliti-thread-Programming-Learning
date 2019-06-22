package chapter7.threadState;

public class StateTest1 {
	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			Object obj = new Object();
			synchronized (obj) {
				try {
					obj.wait(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		},"A");
		
		t1.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("调用wait(long times)等方法之后的线程状态：" + t1.getState());
	}
}
