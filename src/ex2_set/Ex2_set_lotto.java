package ex2_set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex2_set_lotto {
	public static void main(String[] args) {
		
		// HashSet : 정렬없음
		// TreeSet : 오름차순 정렬
		
		HashSet<Integer> hs =new HashSet<Integer>();
		while( true ) {
			
			int r = new Random().nextInt(45) + 1;
			hs.add(r);
			
			// 만약 범위가 한 자리 수면 작은 수부터 순차적으로 정렬한다.
			
			if( hs.size() == 6 ) {
				break;
			} // if
			
		} // while
		
		System.out.println(hs);
		
		
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		while( true ) {
			
			int r = new Random().nextInt(45) + 1;
			ts.add(r);
			
			if( ts.size() == 6 ) {
				break;
			} // if
			
		} // while
		
		System.out.println(ts);
		
		
		// 부모 클래스를 미리 만들어두고 자식이 만들어지는 코드. jvm이 생각할 단계를 줄여주는 좋은 코드.
		Set<Integer> set = new HashSet<Integer>();  
		
		
		
		
		
		
	} // main

}
