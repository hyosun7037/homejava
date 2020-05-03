package quiz;

import java.util.ArrayList;

//5개의 각각 다른 숫자 추가 , 길이 출력, 4번째 숫자 출력, 1번째 숫자 지우기
public class Quiz020 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(45);
		arr.add(40);
		arr.add(15);
		arr.add(20);
		arr.add(50);
		
		System.out.println(arr.size()); //길이
		System.out.println(arr.get(3)); //출력
		arr.remove(0);
		System.out.println(arr);
	}

}
