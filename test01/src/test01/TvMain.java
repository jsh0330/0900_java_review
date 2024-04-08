package test01;

public class TvMain {
	public static void main(String[] args) {
		Tv sTv = new Tv(false, 3, 50, "white");
		Tv aTv = new Tv(false, 6, 60, "black");
		
		System.out.println("sTv의 색 : " + sTv.color);
		sTv.powerOnOff();
		sTv.chUp();
		sTv.chDown();
		sTv.volUp();
		sTv.volDown();
		
		System.out.println("aTv의 색 : " + aTv.color);
		aTv.powerOnOff();
		aTv.chUp();
		aTv.chDown();
		aTv.volUp();
		aTv.volDown();
		
	}

}
