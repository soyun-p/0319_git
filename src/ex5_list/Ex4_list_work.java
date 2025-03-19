package ex5_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex4_list_work {
	public static void main(String[] args) {
		
		// 다섯 개의 문장을 입력받아 리스트에 입력하고, 가장 긴 문자열을 찾자.
		
		// 문자열1 : aaa
		// 문자열2 : bb
		// 문자열3 : 123
		// 문자열4 : a213123
		// 문자열5 : ggggg
		// 가장 긴 문자열 : a213123
		
		
		Scanner sc = new Scanner(System.in);
		
		List<String> strArr = new ArrayList<String>();
		
		String str;
				
		for(int i = 1; i <= 5; i++) {
			System.out.printf("문자열%d : ", i);
			str = sc.next();
			
			strArr.add(str);
			
		} // for
		
	
		
		int max = strArr.get(0).length();  // 문자열 길이
		
		String strMax = "";  // 가장 긴 문자열을 담을 문자
		
		for(int i = 1; i < strArr.size(); i++) {
	
			if( strArr.get(i).length() > max ) {
				max = strArr.get(i).length();
				strMax = strArr.get(i);
			} // if
			
		} // for
		
		System.out.println("가장 긴 문자열 : " + strMax);
		
		
	} // main

}
