package test01;

public class Calulator {
	public static void main(String[] args) {
		Calulator ca = new Calulator();
		
		System.out.println(ca.addNum(1, 2));
		System.out.println(ca.addNum(1.5, 2.5));
		System.out.println(ca.addNum(1, 2.5));
		System.out.println(ca.addNum("1", "2"));
		

	}

	int addNum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	double addNum(double num1, double num2) {
		double result = num1 + num2;
		return result;
	}

	double addNum(int num1, double num2) {
		double result = num1 + num2;
		return result;
	}

	int addNum(String num1, String num2) {
		int result = Integer.parseInt(num1) + Integer.parseInt(num2);
		return result;
	}
}
