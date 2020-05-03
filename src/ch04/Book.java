package ch04;
//제녹과 저자를 나타내는 title과 author필드를 가진 book클래스 작성, 생성자 작성, 필드 초기화
public class Book {
	String title;
	String author;
	
	void show() {
		System.out.println(title + " " + author);
	}
	
	public Book() {
		this("","");
		System.out.println("생성자 호출됨");
	}
	
	public Book(String title) {
		this(title,"작가미상");
	}

	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public static void main(String[] args) {
		Book b = new Book("어린왕자","생텍쥐페리");
		Book c = new Book("여행의 이유");
		Book d = new Book();
		
		c.show();
	}

}
