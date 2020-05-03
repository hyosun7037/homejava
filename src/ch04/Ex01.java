package ch04;
//LG에서 만든 2017년형 32인치 TV가 출력되도록 하는 프로그램

class TV{
	String s;
	int year,inch;
	
	
	public TV(String s, int year, int inch) {
		this.s = s;
		this.year = year;
		this.inch = inch;
	}
	
	public void show() {
		System.out.println(s +" 에서만든" + year + "년형" + inch + "인치 TV");
	}
}

public class Ex01 {

	
	public static void main(String[] args) {
		TV myTV = new TV("LG",2017,32);
		myTV.show();
		
	}

}
