package ex6_homework;

import java.util.List;
import java.util.Random;

public class TimeThread extends Thread {

	Random rnd = new Random();
	List<String> list;
	// private int timer = 0;
	String[] strArr;
	
	public TimeThread(List<String> list,String[] strArr) {
		this.list = list;
		this.strArr=strArr;
	}

	/* public int getTimer() {
		return timer;
	} */  
	// list.sleep에서 이미 리스트를 3초 후마다 추가했기 때문에 타이머는 필요 없다.



	// 게임 중임을 나타내는 변수
	private boolean isPlaying = true;

	public void setPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}
 


	@Override
	public void run() {
       // 3초 간격으로 list에 단어 추가		

		while( true ) {

			try {
				Thread.sleep(3000);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

//			timer++;
			list.add(strArr[new Random().nextInt(strArr.length)]);


		} // while

	}

}
