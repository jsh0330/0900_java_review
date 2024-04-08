package task;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
//		3. 사용자로부터 두개의 숫자와 연산기호를 입력받아 두 숫자의 사칙연산을 출력하는 프로그램
//		   (연산기호 : +, -, *, /)
		
		String calc = "";
		int num1 = 0, num2 = 0, result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수를 입력하세요 : ");
		num1 = sc.nextInt();
		System.out.println("두번째 정수를 입력하세요 : ");
		num2 = sc.nextInt();
		System.out.println("원사는 사칙연산을 입력하세요 : ");
		calc = sc.next();
		
		switch(calc) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		}
		
		System.out.println(num1 + " + "  +num2 + " = " + result);
		
	}

}
