package test01;

public class Tv {

	boolean power;
	int ch;
	int vol;
	String color;

	void powerOnOff() {
		if(!this.power) {
			System.out.println("전원을 켰습니다");
			power = true;
		}else {
			System.out.println("전원을 껐습니다");
			power = false;
		}

	}

	void chUp() {
		if(!this.power) {
			System.out.println("전원을 켜야합니다");
		}else {
			System.out.println("채널을 1 올립니다");
			System.out.println("현재 채널 : " + ++ch);
		}
	}

	void chDown() {
		if(!this.power) {
			System.out.println("전원을 켜야합니다");
		}else {
			System.out.println("채널을 1 내립니다");
			System.out.println("현재 채널 : " + --ch);
		}
	}

	void volUp() {
		if(!this.power) {
			System.out.println("전원을 켜야합니다");
		}else {
			System.out.println("볼륨을 1 올립니다");
			System.out.println("현재 볼륨 : " + ++vol);
		}
		
	}
	
	void volDown() {
		if(!this.power) {
			System.out.println("전원을 켜야합니다");
		}else {
			System.out.println("볼륨을 1 내립니다");
			System.out.println("현재 볼륨 : " + --vol);
		}
		
	}

	public Tv(boolean power, int ch, int vol, String color) {
		super();
		this.power = power;
		this.ch = ch;
		this.vol = vol;
		this.color = color;
	}
	
	

}
