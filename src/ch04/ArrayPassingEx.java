package ch04;
//char[] �迭 ���޹޾� ����ϴ� printCharArray()�޼ҵ�, �迭 �� ����('')���ڸ� '.'�� ��ü�ϴ� replaceSpace()�޼ҵ� �ۼ�
public class ArrayPassingEx {
	static void replaceSpace(char a[]) {
		for (int i = 0; i < a.length; i++) 
			if(a[i]==' ')
				a[i] = ',';
			}
		static void printCharArray(char a[]) {
		for (int i = 0; i < a.length; i++) 
			System.out.println(a[i]);
			System.out.println();
			
	}
	public static void main(String[] args) {
		char c[] = {'T', 'h',' ', ' '};
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
	}

}
