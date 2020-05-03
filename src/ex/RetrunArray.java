// 정수 4개 가지는 일차원 배열 생성, 1,2,3,4로 초기화
// 배열 리턴하는 makeArray()
// 메소드로부터 배열 전달받아 값 출력하는 프로그램

package ex;

public class RetrunArray {

	static int[] makeArray() {
		int temp[] = new int[4];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = i+1; // 배열 원소 1,2,3,4 초기화
		}
		return temp;

	}
	
	public static void main(String[] args) {

	int arr[]; //배열 레퍼런스 변수 선언
	arr = makeArray(); //메소드로부터 배열 전달 받음
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}

	}

}
