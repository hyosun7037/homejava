package coingdojang;

//개발소스코드 탭으로 들여쓰기, 공백으로 들여쓰기 된 것 섞여 있음 ()
//A는 탭으로 들여쓰기가 된 소스 -> 공백으로 들여쓰기 4개로 수정 (replace)
//탭 -> 공백으로 수정



public class Ex02 {
	String tapSpace(String txt) {
		txt.replaceAll("\t","");
		return txt;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(new Ex02());
	}
}
