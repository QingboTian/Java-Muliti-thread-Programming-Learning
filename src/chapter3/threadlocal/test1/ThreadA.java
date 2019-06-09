package chapter3.threadlocal.test1;

public class ThreadA extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 10; i++){
			if (Tools.t.get() == null)
				Tools.t.set("A第一次放值"+ (i + 1));
			else
				Tools.t.set("A" + (i + 1));
			try {
				Thread.sleep(1000);
				System.out.println(Tools.t.get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
