package task;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
//		1. 사용자로부터 정수 n을 입력받아 1부터 n까지 합을 구하는 프로그램
//		[출력결과]
//		정수 입력 : 4
//		입력한 숫자는 4입니다
//		1부터 4까지의 합은 10 입니다.
		
		int num = 0, sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("입력한 숫자는 " + num + "입니다");
		System.out.println("1부터 " + num + "까지의 합은 " + sum + "입니다");
		
	}

}
