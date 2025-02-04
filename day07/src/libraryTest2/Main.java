package libraryTest2;

public class Main {
	public static void main(String[] args) {
		// 도서관 생성
		Library korea = new Library();

		// 회원 생성
		Member m1 = new Member("철수", "010-1111-1111", "강남구");
		Member m2 = new Member("훈이", "010-2222-1111", "동작구");
		Member m3 = new Member("짱구", "010-3333-1111", "송파구");

		// 도서관에 회원 등록
		System.out.println(korea);
		korea.join(m1);
		korea.join(m2);
		korea.join(m3);

		// 책 생성
		Book b1 = new Book("셜록");
		Book b2 = new Book("명탐정코난");
		Book b3 = new Book("해리포터");
		Book b4 = new Book("해리포터2");

//		b1.showBookInfo();
//		b2.showBookInfo();
//		b3.showBookInfo();
//		korea.showBookInfo(); //오류 발생

		// 책등록
		korea.bookRegister(b1);
		korea.bookRegister(b2);
		korea.bookRegister(b3);
		korea.bookRegister(b4);

//		System.out.println("korea 도서관");
		System.out.println("===================");
		// 확인하기
		korea.showLibraryBookList();
		System.out.println("===================");
		korea.showMemberList();

		System.out.println("===================");
		korea.bookRental(0, m1);
		korea.bookRental(1, m1);
		korea.bookRental(2, m1);
		korea.bookRental(3, m1);
		korea.showMemberList();
		korea.showLibraryBookList();

		// 책 모두 반납하고 내 이름의 객체 1개 생성 후 대여해보기
		System.out.println();
		System.out.println();
		System.out.println();

		korea.bookReturn(0, m1);
		korea.bookReturn(1, m1);
		korea.showMemberList();
//		korea.showLibraryBookList();
		korea.showLibraryBookList();
	}
}
