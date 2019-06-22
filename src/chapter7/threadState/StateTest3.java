package chapter7.threadState;

public class StateTest3 {
	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			System.out.println("线程正在运行中");
		});
		
		t1.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("线程运行结束状态为：" + t1.getState());
	}
}
