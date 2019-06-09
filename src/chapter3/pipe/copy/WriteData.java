package chapter3.pipe.copy;

import java.io.IOException;
import java.io.PipedWriter;

public class WriteData {

	public void write(PipedWriter out) {
		try {
			System.out.println("写入数据");
			for (int i = 0; i < 100; i++) {
				out.write((i + ""));
			}
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
