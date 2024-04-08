package task;

public class Ex08 {
	public static void main(String[] args) {
		
//		1) 역 직각삼각형 별찍기
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		*

		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		2)  마름모 모양으로 별찍기
//	    *
//	   ***
//	  *****
//	 *******
//	*********
//	 *******
//	  *****
//	   ***
//	    *

		
//		1. 위쪽 부분 출력
		for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
		
//		2. 아래부분 출력
		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
			
		}

		
	}

}
