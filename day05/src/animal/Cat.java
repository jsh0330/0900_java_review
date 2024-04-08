package animal;

public class Cat extends Animal{
	//메소드 오버라이딩
	@Override
	void cry() {
		// TODO Auto-generated method stub
//		super.cry();
		System.out.println("고양이 울음소리");
	}
	
	void method1() {
		System.out.println("cat클래스메소드호출");
	}
}
