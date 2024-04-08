package test1;

public class Main {
	public static void main(String[] args) {
		School school = new School();
		
		int[] grade1 = {100, 90, 70};
		Student st1 = new Student("장서혁1", grade1);
		int[] grade2 = {45, 60, 50};
		Student st2 = new Student("장서혁2", grade2);
		int[] grade3 = {100, 100, 100};
		Student st3 = new Student("장서혁3", grade3);
		
		school.join(st1);
		school.join(st2);
		school.join(st3);
		
		school.showStudentList();
		school.showScoreAvg();
		
	}

}
