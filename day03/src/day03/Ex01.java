package day03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
//		1. 5칸 짜리 사물함의 비밀번호를 설정하고 사용자에게 이용할 사물함 번호와 
//		비밀번호를 입력하게 하고, 
//		입력된 비밀번호와 사물함의 비밀번호를 비교하여 
//		일치 여부를 출력하기(배열이용)

		//1) 입력 클래스 import
		//2) 5칸짜리 배열 선언
		//3) 변수 선언(문자열변수 4, 입력받을 번호 정수형 변수 2) 
		//4) 사용자에게 이용할 사물함 번호 입력메소드
		//5) 사용자에게 비밀번호 입력받기 입력메소드
		//6) 일치/불일치 확인(조건문 if~else)
		
		Scanner sc = new Scanner(System.in);
		
		int[] arPw = new int[5];
		String mainMsg = "번 사물함의 비밀번호 설정 : ";
		String choiceMsg = "이용할 사물함 번호 입력 : ";
		String inputMsg = "비밀번호 입력 : ";
		String result = "";
		int choice = 0, inputPw = 0;
		
		//for문 비밀번호 설정할 반복문
		for(int i = 0; i < arPw.length; i++) {
			System.out.println(i+1 + mainMsg);
			arPw[i] = sc.nextInt();
		}
		System.out.println(choiceMsg);
		choice = sc.nextInt();
		
		System.out.println(inputMsg);
		inputPw = sc.nextInt();
		
		//조건문(if~else문)
		if(arPw[choice - 1] == inputPw) {
			result = "비밀번호가 일치합니다";
		}else {
			result = "비밀번호가 불일치합니다";
		}
		
		System.out.println(choice + "번의 " + result);
	
	
	}
}














