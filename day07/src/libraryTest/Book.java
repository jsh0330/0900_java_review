package libraryTest;

public class Book {
//	클래스명 Book(책 정보 보기 클래스)
//	필드 : 도서번호, 책이름, 대여상태
//	생성자 : 매개변수1개(책이름)
//		책번호는 도서관에 등록하면 부여됨
//	메소드 : showBookInfo() 책정보 보기 메소드
//		책번호.책이름 형태로 출력
//		대여상태가 true라면 대여가능 출력, 아니면 대여 불가능 출력

	// 필드
	int bookNumber; // 책번호
	String bookName; // 책이름
	boolean bookStatus; // 책대여상태

	// 생성자
	public Book(String bookName) {
		super();
		this.bookNumber = 0; // 책번호의 초기값 0
		this.bookName = bookName;
		this.bookStatus = true; // 책대여상태 초기값 true
	}

	// 메소드 : 책정보 보기 메소드(출력)
	void showBookInfo() {
		// 책번호.책이름 형태로 출력
		System.out.println(this.bookNumber + "." + this.bookName);
		if (bookStatus) {
			System.out.println("대여가능");
			return;
		}
		System.out.println("대여불가능");
	}
}
