package quiz;

public class Quiz015 {

	public static void main(String[] args) {
		int t = 34567;

		int time = t/3600; //시간
		int min = (t%3600)/60; //남은 분
		int sec = min%60;
		System.out.println(time + "시간" + min + "분" + sec +"초");
		
		
		
		
		
	}

}
