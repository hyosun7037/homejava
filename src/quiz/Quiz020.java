package quiz;

import java.util.ArrayList;

//5���� ���� �ٸ� ���� �߰� , ���� ���, 4��° ���� ���, 1��° ���� �����
public class Quiz020 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(45);
		arr.add(40);
		arr.add(15);
		arr.add(20);
		arr.add(50);
		
		System.out.println(arr.size()); //����
		System.out.println(arr.get(3)); //���
		arr.remove(0);
		System.out.println(arr);
	}

}
