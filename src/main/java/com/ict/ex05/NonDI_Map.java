package com.ict.ex05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NonDI_Map {
	Map<String, String> map = new HashMap<String, String>();
	
	public void input() {
		map.put("id", "hong");
		map.put("pw", "1111");
		map.put("name", "홍길동");
		map.put("age", "17");
		map.put("addr", "충청도");
	};
	
	// 실행하고 싶은 메소드
	public void prn() {
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(map.get(key));
		}
	}
}
