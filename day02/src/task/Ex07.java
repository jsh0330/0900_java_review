package task;

public class Ex07 {
	public static void main(String[] args) {
//		7. 1부터 50까지의 수 중 3의 배수는 출력하지 않고 나머지 수는 모두 출력하기
		
		for (int i = 1; i <= 50; i++) {
			if(i % 3 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		
	}

}
