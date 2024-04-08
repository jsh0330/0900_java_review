package task;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
//		5. 사용자로부터 정수(5자리)를 입력받아 역순으로 출력하는 프로그램
		
		String num = "";
		int[] ar = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5자리 정수를 입력하세요 : ");
		num = sc.next();
		
		for (int i = 0; i < num.length(); i++) {
			ar[i] = num.charAt(i);
		}
		
		for (int i = 4; i >= 0; i--) {
			System.out.print((char)(ar[i]));
		}
		
		
	}

}
