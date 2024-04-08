package day01;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		
//		14. 사용자로부터 세 개의 정수형태의 문자열을 입력받아 문자열, 정수, 실수로 출력하기(next)
		
//		1. 입력받을 변수 3개 만들기
//		2. Scanner import
//		3. 입력받기
//		4. 형변환과 동시에 출력하기
		
		String num1 = "3", num2 = "", num3 = ""; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수를 입력하세요 : ");
		num1 = sc.next();
		System.out.println("두번째 정수를 입력하세요 : ");
		num2 = sc.next();
		System.out.println("세번째 정수를 입력하세요 : ");
		num3 = sc.next();
		
		System.out.println("문자열 출력 : " + num1 + " 정수 출력 : " + Integer.parseInt(num2) + " 실수 출력 : " + Double.parseDouble(num3));
		
	}

}
