package finalTest;

public class Car {
	// 필드
	int speed;

	// 메소드
	void speedUp() {
		if (this.speed > 0) {
			speed += 10;
			System.out.println("현재 시속 : " + speed);
		}
	}

	// final 메소드
	//final 반환타입 메소드명(자료형 매개변수){}
	final void stop() {
		System.out.println("브레이크를 밟아 차를 멈춥니다");
		this.speed = 0;
	}
}
