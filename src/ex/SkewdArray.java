package ex;
//비정방형 배열 생성
public class SkewdArray {

	public static void main(String[] args) {
		int arr[][] = new int[4][]; //각 행의 레퍼런스 배열
		arr[0] = new int[3]; // 첫째행의 정수 3개 배열
		arr[1] = new int[2]; // 둘째행의 정수 2개 배열
		arr[2] = new int[3]; // 셋째행의 정수 3개 배열
		arr[3] = new int[2]; // 넷째행의 정수 2개 배열
		
		for (int i = 0; i < arr.length; i++) { //행에 대한 반복
			for (int j = 0; j < arr[i].length; j++) { //열에 대한 반복
				arr[i][j] = (i+1) * 10 + j;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");	
			}
			System.out.println();//다음줄로 넘어가기
		}
		
	}

}


