package chapter3.pipe.copy;

import java.io.IOException;
import java.io.PipedReader;

public class ReadData {
	public void read(PipedReader in){
		char[] by = new char[20];
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
