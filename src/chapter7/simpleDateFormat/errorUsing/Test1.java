package chapter7.simpleDateFormat.errorUsing;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * <p>
 * Title: Test1.java
 * </p>
 * <p>
 * Description: 多线程情况下SimpleDateFormat线程不安全的测试
 * <p>
 * 
 * @author tianqb
 * @mail tqb820965236@163.com
 * @date 2019年6月23日上午10:28:16
 * @version 1.0
 *
 */
public class Test1 {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String[] dateString = new String[]{ "2000-01-01", "2004-11-01", "2003-05-01", "2200-01-01", "2002-01-01", "2005-05-20",
				"2010-03-01", "2019-01-01", "2019-06-23" };
		Service[] service = new Service[9];
		for (int i = 0; i < service.length; i++) {
			service[i] = new Service(sdf, dateString[i]);
		}
		for (int i = 0; i < service.length; i++) {
			service[i].start();
		}
	}
}

class Service extends Thread {
	private SimpleDateFormat sdf;
	private String dateString;

	public Service(SimpleDateFormat sdf, String dateString) {
		this.dateString = dateString;
		this.sdf = sdf;
	}

	@Override
	public void run() {
		try {
			Date date = sdf.parse(dateString);
			String newDateString = sdf.format(date).toString();
			if (!newDateString.equals(dateString)) {
				System.out.println("出现错误，格式化前的字符串：" + dateString + " 格式化后的字符串：" + newDateString);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
