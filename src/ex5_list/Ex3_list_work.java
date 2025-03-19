package ex5_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3_list_work {
	public static void main(String[] args) {
		
		// 찾을 문장 : blue  (키보드에서 입력 받음)
		// blue의 모든 index : [1, 3, 5]
		
		List<String> colors = new ArrayList<String>();
		
		colors.add("red");
		colors.add("blue");
		colors.add("green");
		colors.add("blue");
		colors.add("yellow");
		colors.add("blue");

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("찾을 문장 : ");
		String color = sc.next();
		
		
		// 인덱스 번호 저장할 리스트
		List<Integer> idxArr = new ArrayList<Integer>();
		
		for(int i = 0; i < colors.size(); i++) {
			
			if( color.equals(colors.get(i)) ) {
				idxArr.add(i);
			} // if
			
		} // for
		
		System.out.print(color + "의 모든 index : " + idxArr);
		
	} // main

}
