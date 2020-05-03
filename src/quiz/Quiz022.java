package quiz;

import java.util.HashSet;

//Math.random()과 HashSet을 이용하여 6개의 로또번호를 생성
public class Quiz022 {

	public static void main(String[] args) {
		
		//1~45까지 난수 출력
		HashSet<Integer> arr = new HashSet<>();
		 
				for (int i = 0; i < 6; i++) {
					arr.add((int)(Math.random()*45)+1);			
			}
				System.out.print(arr);
		}

		
//		
//		double num = ((int)(Math.random() *100));
//		for (int i = 0; i < arr.size(); i++) {
//			if(num >0 && num< 46) {
//				System.out.println(num);
//				arr.add((int) num);
//				System.out.println(arr);
//			}
//			
//		}
//		
		
	}


