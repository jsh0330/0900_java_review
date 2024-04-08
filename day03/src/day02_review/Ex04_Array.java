package day02_review;

public class Ex04_Array {
	public static void main(String[] args) {
		//문자열 변수 선언
		//26칸 배열 선언
		//반복문(for)
		//결과출력(for-each문)
		String str1 = "abcdjavapythonclength";
		int[] charCount = new int[26]; 
//		System.out.println(str1.length());
		for(int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				charCount[ch - 'a']++;
//				System.out.println(i + "번 " + charCount[ch - 'a']++);
			}
		}
		for(int i = 0; i < 26; i++) {
			char ch = (char)('a' + i);
			System.out.println(ch + " : " + charCount[i]);
		}		
	}
}
