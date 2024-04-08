package day01;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
//		18. 사용자로부터 이름과 나이를 입력받아 "안녕하세요, [이름]님. [나이]살이시군요." 형식으로 환영 메시지를 출력하기
		
//		1. 이름 입력받을 변수 name, 나이 입력받을 변수 age 선언(문자열)
//		2. Scanner import
//		3. 이름, 나이 입력받기
//		4. 출력
		
		String name = "", age = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 : ");
		name = sc.next();
		System.out.println("나이를 입력하세요 : ");
		age = sc.next();
		
		System.out.printf("안녕하세요, %s님. %s살이시군요.", name, age);
		
	}

}
