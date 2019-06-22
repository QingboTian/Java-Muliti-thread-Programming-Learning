package chapter7.threadState;

public class StateTest {
	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		},"A");
		
		//System.out.println("调用start方法之前的线程状态：" + t1.getState());
		t1.start();
		System.out.println("调用start方法之后的线程状态：" + t1.getState());
	}
}
