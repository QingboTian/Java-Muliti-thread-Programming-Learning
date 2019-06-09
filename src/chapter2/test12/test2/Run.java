package chapter2.test12.test2;

/**
 * <p>Title: Run.java</p>
 * <p>Description: 
 * 当前的代码[结构]在服务器模式的64位的虚拟机上运行会发生死循环
 * 原因：
 * 	当前代码的变量存在于公共堆栈和线程堆栈中，当对变量的值进行修改的时候，值进行同步
 * 	但是在服务器模式下，为了提高效率，线程一直在私有堆栈中进行取值，我们修改变量却是在公共堆栈中
 * 	从而导致程序进入到死循环中
 * 解决方式：
 * 	使用volatile关键字修饰变量，告诉线程从公共堆栈中进行取值
 * <p>
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年6月2日下午2:02:08
 * @version 1.0
 *
 */
public class Run {
	public static void main(String[] args) {
		PrintString printString = new PrintString();
		
		new Thread(printString).start();
		
		System.out.println("Stop it,Stop threadName:" + Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		printString.setContinuePrint(false);
	}
}
