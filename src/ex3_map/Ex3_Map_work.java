package ex3_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex3_Map_work {
	public static void main(String[] args) {
		
		// id : yi555
		// pw : 3333
		// 로그인 성공!
		
		// id : abc
		// 존재하지 않는 id
		
		// id : kim123
		// pw : 2222
		// 비밀번호 불일치
		
		
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 키 : 아이디, 값 : 비번  저장
		map.put("kim123", 1111);
		map.put("park333", 2222);
		map.put("yi555", 3333);
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("id : ");
		String id = sc.next();
		
		if( map.containsKey(id) ) {
			
			System.out.println("pw : ");
		    int pw = sc.nextInt();
		    
		    if( pw == map.get(id) ) {
		    	System.out.println("로그인 성공!");
		    }else {
		    	System.out.println("비밀번호 불일치");
		    }
			
		}else {
			System.out.println("존재하지 않는 id");
		}
		
		
		
		
		
		
		
		
		
		
	} // main

}
