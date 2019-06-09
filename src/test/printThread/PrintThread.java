package test.printThread;

public class PrintThread {
	synchronized public void printName(){
		System.out.println(Thread.currentThread().getName());
	}
}
