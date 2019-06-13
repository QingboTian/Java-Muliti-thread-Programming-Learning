package chapter4.locks.lockMethodTest.test4;

public class Run {
	public static void main(String[] args) {
		Service service = new Service();

		new Thread(() -> {
			service.method();
		}).start();
	}
}
