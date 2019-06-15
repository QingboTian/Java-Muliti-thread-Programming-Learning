package chapter4.locks.printABC;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintABC {
	private int times;
	private int count = 0;
	
	private Lock lock = new ReentrantLock();
	private Condition c1 = lock.newCondition();
	private Condition c2 = lock.newCondition();
	private Condition c3 = lock.newCondition();
	
	public PrintABC(int times) {
		super();
		this.times = times;
	}
	
	public void print(int target, Condition curr, Condition next){
		for (int i = 0; i < times;) {
			try {
				lock.lock();
				while(count % 3 != target){
					curr.await();
				}
				System.out.print(Thread.currentThread().getName());
				count++;
				i++;
				next.signalAll();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				lock.unlock();
			}
		}
	}
	
	public void printA(){
		print(0, c1, c2);
	};
	
	public void printB(){
		print(1, c2, c3);
	};
	
	public void printC(){
		print(2, c3, c1);
	};
	
}
