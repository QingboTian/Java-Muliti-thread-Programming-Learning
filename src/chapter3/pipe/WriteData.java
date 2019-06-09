package chapter3.pipe;

import java.io.IOException;
import java.io.PipedOutputStream;

public class WriteData {

	public void write(PipedOutputStream out) {
		try {
			System.out.println("写入数据");
			for (int i = 0; i < 100; i++) {
				out.write((i + "").getBytes());
			}
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
