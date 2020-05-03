package ch04;
//char[] 배열 전달받아 출력하는 printCharArray()메소드, 배열 속 공백('')문자를 '.'로 대체하는 replaceSpace()메소드 작성
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
