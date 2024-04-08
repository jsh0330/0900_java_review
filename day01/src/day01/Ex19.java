package day01;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
//		19. 반지름을 입력받아 원의 넓이를 계산하여 출력하기(원의 넓이 계산 공식: π * 반지름 * 반지름, π 값은 3.14로 가정)
		
//		1. 반지름 입력받을 정수형 변수 radius,  넓이를 저장할 변수 result 선언
//		2. Scanner import
//		3. radius에 반지름 입력받기
//		4. result에 원의 넓이 저장
//		5. 출력
		
		int radius = 0;
		double result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반지름의 길이를 입력하세요 : ");
		radius = sc.nextInt();
		
		result = radius * radius * 3.14;
		
		System.out.println("원의 넓이는 : " + result);
	}

}
