package quiz;

import java.util.HashSet;

//Math.random()�� HashSet�� �̿��Ͽ� 6���� �ζǹ�ȣ�� ����
public class Quiz022 {

	public static void main(String[] args) {
		
		//1~45���� ���� ���
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


