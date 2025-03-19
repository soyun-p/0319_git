package ex5_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1_list_work {
	public static void main(String[] args) {
		// 키보드에서 입력받은 id를 중복되지 않도록 list에 추가. 단, 중복 체크는 contains() 쓰지 않는다.
		
		// id : aaa
		// [ aaa ]  추가된 아이디를 보여줌.
		// id : ccc
		// [ aaa, ccc ]
		// id : aaa
		// 중복된 아이디
		// id : x
		// 종료
		
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<String>();
		
		
		label:while( true ) {
			
			System.out.print("id : ");
		    String id = sc.next();
			
		     // 중복 체크
		    for(int i = 0; i < list.size(); i++) {
		    	
		    	if( id.equals(list.get(i)) ){
		    		System.out.println("중복된 아이디");
		    		continue label;
		        } //if
		
		    } // for
		    
		    // 종료
		    if( id.equals("x") ) {
		    	System.out.println("종료");
				break;
				
			} // if
		    
			
			list.add(id);
			
			System.out.println(list);
		    
		
			
		} // while
		
		
		
		
		
		
		
	} // main

}
