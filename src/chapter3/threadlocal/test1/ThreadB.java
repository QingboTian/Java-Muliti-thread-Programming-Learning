package chapter3.threadlocal.test1;

public class ThreadB extends Thread {
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++){
			if (Tools.t.get() == null)
				Tools.t.set("B第一次放值"+ (i + 1));
			else
				Tools.t.set("B" + (i + 1));
			try {
				Thread.sleep(1000);
				System.out.println(Tools.t.get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
