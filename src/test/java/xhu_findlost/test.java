package xhu_findlost;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class test {
	
	public static void main(String[] args) {
//		String id = UUID.randomUUID().toString();
//		id=id.replace("-", "");
//		System.out.println(id);
		
		//Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
		String goodsPubtime = sdf.format(new Date());
		System.out.println(goodsPubtime);
	}
}
