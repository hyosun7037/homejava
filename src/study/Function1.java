package study;

import say.Say;

//class Say {
//
//	static void hello() { // main이 아닌 함수만 있어서 독립적으로 실행하지 못하는 코드 : 모듈
//		System.out.println("안녕하세요");
//
//	}

public class Function1 {

	public static void main(String[] args) { //main이 포함되어 있어 실행이 가능한 코드 : 프로그램
		System.out.println("안녕하세요");
		Say.hello(); 
		// 같은 파일 내에 있는 모듈을 호출하는 방법 : 클래스.메서드()
		// 패키지는 같지만 다른 파일로 나뉘어 있을 경우에도 호출이 가능하다.
		
		// 패키지가 아예 다른 경우 : 모듈이 될 클래스나 기능들은 public으로 작성, import로 호출
		new Say();
	}

}
