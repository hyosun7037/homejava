package coingdojang;

//미완성 - 정렬은 했는데, 정렬23패턴을 모르겠음

import java.util.ArrayList;

//n개의 정수를 가진 배열
//양의 정수와 음의 정수 모두 가지고 있음
//정렬 후 음의 정수는 앞, 양의 정수는 뒤
//출력 값 : -1, -2, 1, 3, 2
public class Ex05 {

	public Ex05() {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(-1);
		arr.add(1);
		arr.add(3);
		arr.add(-2);
		arr.add(2);
		
		System.out.println("정렬 전 : " + arr.toString());
		arr.sort(null);
		System.out.println("(오름차순)정렬 후 : " + arr.toString());
		
	}
	public static void main(String[] args) {
		new Ex05();
	}

}
