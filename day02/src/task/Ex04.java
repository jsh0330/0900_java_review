package task;

public class Ex04 {
	public static void main(String[] args) {
//		4. str1 = "abcdjavapythonclength"
//		   str1 문자열에서 각 문자가 몇번 나타나는지 개수를 세어 출력하는 프로그램
//		   [출력결과]
//		   a : 
//		   b : 
		
//		1. str1선언 후 주어진 값으로 초기화
//		2. int형 배열 ar1 선언
//		3. for문을 이용해 ar[i]에 str1 i번째에 있는 수를 대입
		
		String str1 = "abcdjavapythonclength";

		int[] ar = new int[21];
		
		for (int i = 0; i < str1.length(); i++) {
			ar[i] = str1.charAt(i);
			System.out.println((char)ar[i]);
		}
		

	}

}
