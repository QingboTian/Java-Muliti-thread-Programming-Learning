package chapter3.pipe.copy;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * 
 * <p>
 * Title: Run.java
 * </p>
 * <p>
 * Description: 利用管道字符流进行线程间的通信
 * <p>
 * 
 * @author tianqb 
 * @mail tqb820965236@163.com
 * @date 2019年6月8日下午10:09:51
 * @version 1.0
 *
 */
public class Run {
	public static void main(String[] args) {
		ReadData read = new ReadData();
		WriteData write = new WriteData();

		PipedReader in = new PipedReader();
		PipedWriter out = new PipedWriter();
		
		try {
			out.connect(in);
		} catch (IOException e) {
			e.printStackTrace();
		}

		new Thread(() -> {
			write.write(out);
		}).start();
		
		new Thread(() -> {
			read.read(in);
		}).start();
		
	}
}
