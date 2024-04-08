package throwTest;

import java.util.Scanner;

public class My {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		num = sc.nextInt();
		try {
			if(num < 0) {
				throw new MyException();
			}
		} catch (MyException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
