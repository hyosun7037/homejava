package ch04;
//����� ���ڸ� ��Ÿ���� title�� author�ʵ带 ���� bookŬ���� �ۼ�, ������ �ۼ�, �ʵ� �ʱ�ȭ
public class Book {
	String title;
	String author;
	
	void show() {
		System.out.println(title + " " + author);
	}
	
	public Book() {
		this("","");
		System.out.println("������ ȣ���");
	}
	
	public Book(String title) {
		this(title,"�۰��̻�");
	}

	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public static void main(String[] args) {
		Book b = new Book("�����","�������丮");
		Book c = new Book("������ ����");
		Book d = new Book();
		
		c.show();
	}

}
