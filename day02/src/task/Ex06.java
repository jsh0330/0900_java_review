package task;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
//		6. 사용자로부터 입력받은 숫자가 1부터 5까지의 수인 경우에만 해당 숫자에 해당하는 영어 단어를 출력하기
//		[올바른 값 입력시 출력] 
//		1부터 5까지 숫자 입력 : 1
//		1은 영어로 one 입니다
//		[잘못된 값 입력시 출력] 
//		1부터 5까지 숫자 입력 : 100
//		잘못된 입력입니다
		
		int num = 0;
		String eng = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1부터 5까지 숫자 입력 : ");
		num = sc.nextInt();
		
		switch(num) {
		case 1:
			eng = "one";
			break;
		case 2:
			eng = "two";
			break;
		case 3:
			eng = "three";
			break;
		case 4:
			eng = "four";
			break;
		case 5:
			eng = "five";
			break;
		
		}
		
		if(num > 5) {
			System.out.println("잘못된입력");
		}else {
			System.out.println(num + "은 영어로 " + eng + "입니다");
		}
		
		
		
	}

}
