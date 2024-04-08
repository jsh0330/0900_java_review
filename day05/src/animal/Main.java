package animal;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Cat cat = new Cat();
		Animal a = new Cat(); //부모클래스 타입에 자식 주소값(업캐스팅)
		
		animal.cry();
//		cat.method1();
		a.cry(); 
		//오버라이딩된 메소드는 업캐스팅된 객체로 호출시 
		//오버라이딩된 메소드 내용이 출력되므로 다운캐스팅 필요없음
	
		
		//자식클래스타입 객체 = (타입) 객체명;
		
		
		
	}
}
