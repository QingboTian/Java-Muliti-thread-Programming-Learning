package chapter3.pipe;

import java.io.IOException;
import java.io.PipedInputStream;

public class ReadData {
	public void read(PipedInputStream in){
		byte[] by = new byte[20];
		int len;
		try {
			while((len = in.read(by)) != -1){
				String str = new String(by, 0, len);
				System.out.print(str + " ");
				System.out.println();
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
