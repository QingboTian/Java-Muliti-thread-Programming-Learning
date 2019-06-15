package chapter4.locks.printABC;

public class Run {
	public static void main(String[] args) {
		PrintABC p = new PrintABC(10);
		
		new Thread(() -> {
			p.printA();
		},"A").start();
		
		new Thread(() -> {
			p.printB();
		},"B").start();
		
		new Thread(() -> {
			p.printC();
		},"C").start();
	}
}
