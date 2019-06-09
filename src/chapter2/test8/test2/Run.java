package chapter2.test8.test2;

public class Run {
	public static void main(String[] args) {
		Service service = new Service();
		MyObject object = new MyObject();
		
		ThreadA a = new ThreadA(service, object);
		a.setName("a");
		ThreadB b = new ThreadB(object);
		b.setName("b");
		
		a.start();
		b.start();
	}
}
