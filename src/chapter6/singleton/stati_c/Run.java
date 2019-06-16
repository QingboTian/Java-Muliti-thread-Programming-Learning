package chapter6.singleton.stati_c;

public class Run {
	public static void main(String[] args) {
		Thread[] t = new Thread[3];
		for (int i = 0; i < t.length; i++) {
			t[i] = new Thread(() -> {
				MyObject obj = MyObject.getInstance();
				System.out.println(obj);
			});
			t[i].start();
		}
	}
}
