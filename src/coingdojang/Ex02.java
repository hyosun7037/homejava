package coingdojang;

//���߼ҽ��ڵ� ������ �鿩����, �������� �鿩���� �� �� ���� ���� ()
//A�� ������ �鿩���Ⱑ �� �ҽ� -> �������� �鿩���� 4���� ���� (replace)
//�� -> �������� ����



public class Ex02 {
	String tapSpace(String txt) {
		txt.replaceAll("\t","");
		return txt;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(new Ex02());
	}
}
