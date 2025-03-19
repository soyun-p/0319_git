package ex5_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex2_list_work_check {
	public static void main(String[] args) {
		
		// ArrayList 에 1~30 사이의 난수를 5개 추가
		// 리스트에 추가된 값 중 가장 큰 값을 찾아서 출력
		
		// [ 16, 13, 29, 14 ,19 ]
		// 가장 큰 값 : 29
		
		
		Random rnd = new Random();
		int num;
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < 5; i++) {
			num = rnd.nextInt(30) + 1;
			list.add(num);
		} // for
		
		
		System.out.println(list);
		
		// 가장 큰 값을 담을 변수
		int max = list.get(0);
		
		// 1번 인덱스의 값을 시작점으로 하여 0번 인덱스의 값보다 큰 지 순차척으로 비교
		for(int i = 1; i < list.size(); i++) {// 개선된 루프로도 가능. -> for( int num : list ){ 
			
			// if( num > max ){
			//     max = num;
			// } 
			
			if( list.get(i) > max ) { // i번째 인덱스 값이 기존 인덱스 값보다 클 때, 
				max = list.get(i);    // 
			} // if
			
		} // for
		
		System.out.println("가장 큰 값 : " + max);
		
		
		
		
	} // main

}
