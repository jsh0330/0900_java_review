package day02_review;

public class Ex08 {
	public static void main(String[] args) {
		int row = 5;
		for(int i = 0; i < row; i++) {
//			System.out.println(i);
//			System.out.println(row - i);
			for(int j = 0; j < row - i; j++) {
//				System.out.println("i : " + i + ", j = " + j);
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
