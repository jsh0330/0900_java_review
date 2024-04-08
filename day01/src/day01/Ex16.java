package day01;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
//		16. 두 개의 실수형 변수 num1과 num2를 선언하고, 사용자로부터 입력을 받아 두 수를 나눈 결과를 소숫점 두 자리까지 출력하기
		
//		1. 실수형 변수 num1, num2, result 변수 선언하기
//		2. Scanner import
//		3. 입력받기
//		4. result에 나눈 값 대입
//		5. 출력
		
		double num1 = 0, num2 = 0, result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 실수를 입력하세요 : ");
		num1 = sc.nextDouble();
		System.out.println("두번째 실수를 입력하세요 : ");
		num2 = sc.nextDouble();
		
		result = num1 / num2;
		
		System.out.printf("결과 : %.2f", result);
		
	}

}
