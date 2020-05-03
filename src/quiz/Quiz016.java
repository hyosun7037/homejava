package quiz;

import java.util.Scanner;

//타이머 제작
//숫자를 입력하면 카운트 출력, 카운트 완료시 "종료"라고 떠야한다.
//1초 간격을 주는 코드는 Thread.sleep(1000)
public class Quiz016 extends Thread {
	
	@Override
	public void run() {
		int count = 0;
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 1; i <= t; i++) {
			try {
				Thread.sleep(1000);
				System.out.print(i+ " ");
			} catch (Exception e) {
				System.out.print("스레드를 종료합니다."); //종료가 안나옴
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		Quiz016 qq = new Quiz016();
		qq.start();
//		new Quiz016().run();
		
		
		
		
		
		

	}

}
