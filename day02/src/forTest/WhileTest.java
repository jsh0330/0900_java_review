package forTest;

public class WhileTest {
	public static void main(String[] args) {
		//1부터 10까지의 숫자 출력하기(while문)
		//로직구성!!
		//1) 반복시작할 숫자 초기화 변수
		//2) i가 10이하인 동안 반복(while문){
		//3) i 출력-확인
		//4) }
		
		//합계 구하는 로직 작성해보기
		int i = 0, total = 0;
		while(i <= 10) {
//			System.out.println(i);
			total+=i;
			i++;
		}
		System.out.println(total);
		
	}
}
