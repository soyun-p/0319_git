package ex6_homework;

import java.util.List;
import java.util.Random;

public class TimeThread extends Thread {


	private int timer = 0;

	public int getTimer() {
		return timer;
	}



	// 게임 중임을 나타내는 변수
	private boolean isPlaying = true;

	public void setPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}
 


	




	@Override
	public void run() {

		while( isPlaying ) {

			try {
				Thread.sleep(3000);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			timer++;


		} // while

	}

}
