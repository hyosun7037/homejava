package coingdojang;

import java.util.Iterator;
import java.util.TreeSet;

//������,���翵,����ǥ,���翵,�ڹ�ȣ,������,���翵,������,�ֽ���,�̼���,�ڿ���,�ڹ�ȣ,������,����ȯ,���缺,������,������
//1. �达�� �̾��� ���� ���?
//2. "���翵"�̶� �̸��� �� �� �ݺ�
//3. �ߺ��� ������ �̸��� ���
public class Ex04 {

	int countK, countL, LeeJ = 0;
	TreeSet<String> t = new TreeSet<>();
	
	String[] name = {"������","���翵","����ǥ","���翵","�ڹ�ȣ","������","���翵","������","�ֽ���","�̼���","�ڿ���","�ڹ�ȣ","������","����ȯ","���缺","������","������"};
	
	public Ex04() {
		//1. �达�� �̾��� ���� ���?
		for (int i = 0; i < name.length; i++) {
			if(name[i].contains("��")) {
//				System.out.println(name[i]);
				countK++;
			}else if(name[i].contains("��")){
//				System.out.println(name[i]);
				countL++;
			}
			
		}
		System.out.println("�达�� ���ڴ� : " + countK);
		System.out.println("�̾��� ���ڴ� : " + countL);
		
		//2. "���翵"�̶� �̸��� �� �� �ݺ�
		for (int i = 0; i < name.length; i++) {
			if(name[i].equals("���翵")) {
				LeeJ++;
			}
		}
		System.out.println("���翵�� �ݺ� Ƚ���� : " + LeeJ);
		
		//3.�ߺ��� ������ �̸��� ���
		for (int i = 0; i < name.length; i++) {
			t.add(name[i]);
		}
		Iterator<String> it = t.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
	}
	public static void main(String[] args) {
		new Ex04();
	}

}
