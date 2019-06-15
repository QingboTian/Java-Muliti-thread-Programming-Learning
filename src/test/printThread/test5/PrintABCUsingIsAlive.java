package test.printThread.test5;

public class PrintABCUsingIsAlive {
	public static void main(String[] args) throws InterruptedException {
		Thread A = new Thread(() -> {
			System.out.print("A");
		});
		Thread B = new Thread(() -> {
			System.out.print("B");
		});
		Thread C = new Thread(() -> {
			System.out.print("C");
		});

		int i = 10;
		while (i > 0) {
			A.run();
			while (A.isAlive()) {
			}
			B.run();
			while (B.isAlive()) {
			}
			C.run();
			while (C.isAlive()) {
			}

			i--;
		}
	}
}
