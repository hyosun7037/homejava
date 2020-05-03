package coingdojang;

import java.util.Iterator;
import java.util.TreeSet;

//이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌
//1. 김씨와 이씨는 각각 몇명?
//2. "이재영"이란 이름이 몇 번 반복
//3. 중복을 제거한 이름을 출력
public class Ex04 {

	int countK, countL, LeeJ = 0;
	TreeSet<String> t = new TreeSet<>();
	
	String[] name = {"이유덕","이재영","권종표","이재영","박민호","강상희","이재영","김지완","최승혁","이성연","박영서","박민호","전경헌","송정환","김재성","이유덕","전경헌"};
	
	public Ex04() {
		//1. 김씨와 이씨는 각각 몇명?
		for (int i = 0; i < name.length; i++) {
			if(name[i].contains("김")) {
//				System.out.println(name[i]);
				countK++;
			}else if(name[i].contains("이")){
//				System.out.println(name[i]);
				countL++;
			}
			
		}
		System.out.println("김씨의 숫자는 : " + countK);
		System.out.println("이씨의 숫자는 : " + countL);
		
		//2. "이재영"이란 이름이 몇 번 반복
		for (int i = 0; i < name.length; i++) {
			if(name[i].equals("이재영")) {
				LeeJ++;
			}
		}
		System.out.println("이재영의 반복 횟수는 : " + LeeJ);
		
		//3.중복을 제거한 이름을 출력
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
