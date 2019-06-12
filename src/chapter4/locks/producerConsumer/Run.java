package chapter4.locks.producerConsumer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * <p>Title: Run.java</p>
 * <p>Description: 
 * 使用Lock、Condition对象实现生产者消费者模型
 * 单个生产者和单个消费者
 * <p>
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年6月12日下午5:39:42
 * @version 1.0
 *
 */
public class Run {
	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		Condition condition = lock.newCondition();
		Consumer consumer = new Consumer(lock, condition);
		Producer producer = new Producer(lock, condition);
		new Thread(() -> {
			while (true) {
				consumer.sub();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		},"Consumer").start();;
		
		new Thread(() -> {
			while (true) {
				producer.add();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		},"Producer").start();;
	}
}
