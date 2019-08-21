package xhu_findlost;

import java.util.UUID;

public class test {
	
	public static void main(String[] args) {
		String id = UUID.randomUUID().toString();
		id=id.replace("-", "");
		System.out.println(id);
	}
}
