package chapter3.threadlocal.test2;

public class ThreadB extends Thread {
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++){
			if (Tools.t.get() == null)
				Tools.t.set(Thread.currentThread().getName() + "第一次放值"+ (i + 1));
			else
				Tools.t.set(Thread.currentThread().getName() + (i + 1));
			try {
				Thread.sleep(1000);
				System.out.println(Tools.t.get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
