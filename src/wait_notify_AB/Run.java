package wait_notify_AB;

public class Run {
	public static void main(String[] args) {
		PrintAB p = new PrintAB(1);
		Thread[] aThread = new Thread[10];
		Thread[] bThread = new Thread[10];

		for (int i = 0; i < 10; i++) {
			aThread[i] = new Thread(() -> {
				p.printA();
			},"A" + (i + 1));
			bThread[i] = new Thread(() -> {
				p.printB();
			},"B" + (i + 1));
			aThread[i].start();
			bThread[i].start();
		}
	}
}
