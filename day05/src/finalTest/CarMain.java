package finalTest;

public class CarMain {
	public static void main(String[] args) {
		Car c1 = new Car();
		SportsCar sc1 = new SportsCar();
		
		c1.speed = 50;
		c1.speedUp();
		
		sc1.speed = 100;
		sc1.speedUp();
		
		sc1.stop();
	}
}
