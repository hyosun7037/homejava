package ch04;
//LG���� ���� 2017���� 32��ġ TV�� ��µǵ��� �ϴ� ���α׷�

class TV{
	String s;
	int year,inch;
	
	
	public TV(String s, int year, int inch) {
		this.s = s;
		this.year = year;
		this.inch = inch;
	}
	
	public void show() {
		System.out.println(s +" ��������" + year + "����" + inch + "��ġ TV");
	}
}

public class Ex01 {

	
	public static void main(String[] args) {
		TV myTV = new TV("LG",2017,32);
		myTV.show();
		
	}

}
