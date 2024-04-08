package test01;

import java.util.Scanner;

public class LockerTask {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int choice = 0, inputPw = 0;
		
		LockerTask lt = new LockerTask();
		
		System.out.println("비밀번호를 설정하세요");
		int[] pw = lt.setLockerPw(5, sc);
		
		System.out.println("원하는 사물함 번호를 선택하세요 : ");
		choice = sc.nextInt();
		
		System.out.println("사물함의 비밀번호를 입력하세요 : ");
		inputPw = sc.nextInt();
		
		System.out.println(lt.checkLockerPw(pw[choice-1], inputPw));
		
	}

	int[] setLockerPw(int num, Scanner sc) {
		int[] ar = new int[num];
		for (int i = 0; i < num; i++) {
			System.out.println(i + 1 + "번째 사물함 비밀번호 입력");
			ar[i] = sc.nextInt();
		}
		
		return ar;
	}
	
	String checkLockerPw(int pw, int inputPw) {
		String result = "";
		if (pw == inputPw) {
			result = "일치합니다";
		}else {
			result = "불일치합니다";
		}
		
		return result;
	}
	
	

}
