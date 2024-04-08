package day01;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
//		17. 두 개의 정수형 변수 num1과 num2를 선언하고, 사용자로부터 입력을 받아 두 수를 더한 결과를 출력하기

//		1. 정수 변수 num1, num2, result 변수 선언하기
//		2. Scanner import
//		3. 입력받기
//		4. result에 더한 값 대입
//		5. 출력

		int num1 = 0, num2 = 0, result = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 정수를 입력하세요 : ");
		num1 = sc.nextInt();
		System.out.println("두번째 정수를 입력하세요 : ");
		num2 = sc.nextInt();

		result = num1 + num2;

		System.out.printf("결과 : %d", result);

	}

}
