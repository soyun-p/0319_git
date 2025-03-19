package ex4_list;

import java.util.ArrayList;
import java.util.List;

public class Ex1_ArrayList {
	public static void main(String[] args) {
		
		// 리스트는 인덱스 존재! 따라서 for문으로 출력하고 싶을 때 배열로 변환할 필요가 없다.
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(17);
		list.add(50);
		list.add(10); // 중복값 제거 불가능. 같은 값으로 리스트에 추가됨.
		
		// 리스트 특정 인덱스의 값 바꾸기
		list.set(2, 30);  // 2번 인덱스 값을 30으로 수정
		
		// 해당 인덱스 값 지우기
		list.remove(1);  // 값뿐만 아니라 해당 인덱스의 방까지 제거해버림. 따라서 인덱스들이 앞번호로 당겨서 정렬됨.
		
		// add는 무조건 가장 뒤로 가서 값이 추가된다. 방 갯수에 제약은 없다.		
		list.add(13);  // 마지막 인덱스에 13 추가
		
		// 인덱스 추가도 가능 : 100이 저장된 2번 인덱스를 추가. 기존 인덱스는 다음 번호로 밀린다.
		list.add(2, 100);
		
		if( list.contains(100) ) {
			System.out.println("100이 저장된 list");
		} // if

		
		System.out.println("------------------------");
		
		
		System.out.println(list.size());  // 리스트의 크기
		System.out.println(list);
		
		// 인덱스를 이용해서 리스트 전체 출력
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));  // get(i)에 인덱스 번호를 넣어 인덱스로 접근한다.
		}
		
		
		
		
		
		
		
	} // main

}
