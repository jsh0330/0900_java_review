package abstractTest;

public class Main {
	public static void main(String[] args) {
		ClassA b = new ClassB();
		b.method();
		
		ClassA a = new ClassA() {

			@Override
			void method() {
				System.out.println("익명클래스에서 재정의");
			}
			
		};
		
		InterA aa = () -> System.out.println("람다식에서 재정의");
//		람다식으로 변경이 불가능한 이유 : 람다식은 익명 메소드기 때문에 함수형 인터페이스에서만 가능하다
				
		System.out.println(a);
		System.out.println(b);
		System.out.println(aa);
	}
}
