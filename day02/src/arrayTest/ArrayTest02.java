package arrayTest;

public class ArrayTest02 {
	public static void main(String[] args) {
		double[] ar1 = {10, 20, 30};
		System.out.println(ar1); //참조값
		System.out.println(ar1[0] + ar1[1]); //값 30.0
		System.out.println(ar1[0] + 100);	//값 110.0
		
		ar1[1] = ar1[0] + ar1[2];
//		System.out.println(ar1[3]);
	}
}
