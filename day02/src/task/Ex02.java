package task;

public class Ex02 {
	public static void main(String[] args) {
//		2. 구구단을 2단부터 9단까지 출력하는 프로그램(while문 사용, 단마다 tab키 적용)
		
		int i = 1;
		
		while(i < 10) {
			for (int j = 2; j < 10; j++) {
				System.out.printf("%d * %d = %d\t", j, i, i*j);
			}
			i++;
			System.out.println("\t");
		}
		
	}

}
