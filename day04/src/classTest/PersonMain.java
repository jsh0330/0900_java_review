package classTest;

public class PersonMain {
	public static void main(String[] args) {
		Person pr1 = new Person();
		System.out.println(pr1);
		
		System.out.println(pr1.name); //String 기본값 : "", null
		pr1.name = "김영선";
		System.out.println(pr1.name);
		pr1.eat("피자", 12);
		pr1.study("코리아IT아카데미", 9);
		System.out.println(pr1.walk("한강"));
		pr1.sleep(2);
		
	}
}
