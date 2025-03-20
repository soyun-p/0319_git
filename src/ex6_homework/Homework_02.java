package ex6_homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Homework_02 {
	public static void main(String[] args) {
		
		// [apple]
		// >> apple
		
		// 3초가 지나면 단어가 계속 추가된다.
		// 입력 받은 단어는 지운다.
		// 반복 후 다 지우면 "클리어!" 출력.
		// 단어는 apple로 시작
		
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		
		
		String[] strArr = { "apple", "orange", "banana", "strawberry"  };
		
		List<String> list = new ArrayList<String>();
		
		
		
		
		TimeThread tt = new TimeThread(list,strArr);
		tt.setDaemon(true);
		tt.start();
		
		// list.add(strArr[0]);
		
		int ir = rnd.nextInt(strArr.length);
        list.add(strArr[ir]);
		
		while( true ) {
			
              
			
			System.out.println(list);
			System.out.print(">> ");
			String input = sc.next();
			
			
			if( list.contains(input) ) {
				list.remove(input);
				
			}else {
				System.out.println("올바르게 입력해주세요");
			}
			
			
			if( list.size() == 0 ){
				tt.setPlaying(false);
				System.out.println("클리어!");
				break;
				
			}
			
			
		} // while
		
		
		
		
		
		
		
		
		
		
	} // main

}
