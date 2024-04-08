package test1;

public class School {
//	필드   학생배열   students
//	   	학생수   studentCount

	Student[] students;
	int studentCount;

//	생성자    기본생성자 매개변수가 없는 생성자(단, 초기값은 반드시 지정)
	public School() {
		this.students = new Student[30];
		this.studentCount = 0;
	}

//	   
//	메소드   학생 등록 메소드 registerStudent
	// 1. 등록 성공하면 true, 실패하면 false 리턴(30명보다 많을 경우)
	// 2. 배열에 저장된 순서대로 번호를 매기고 배열의 [번호] 인덱스에 저장
	boolean join(Student student) {
		// 29보다 크다면 false
		if (this.studentCount > 29) {
			return false;
		}
		this.students[this.studentCount] = student;
		student.studentNumber = this.studentCount;
		this.studentCount++;
		return true;
	}

//	   학생 목록 보기 메소드 showStudentList
	// 1. Student 타입의 지역변수 student 생성
	// 2. 학생 목록이 비어있으면 동작 중지
	// 3. 등록된 학생 수 만큼 반복
	// 4. Student 클래스의 메소드 showGradeInfo 출력
	void showStudentList() {
		Student student = null;

		for (int i = 0; i < students.length; i++) {
			student = students[i];
			if (student == null) {
				break;
			}

			student.showGradeInfo();
		}
	}

//	   성적 평균 보기 메소드 showScoreAvg
	// 1. Student 타입의 지역변수 student 생성
	// 2. 학생 목록이 비어있으면 동작 중지
	// 3. 등록된 학생 수 만큼 반복
	// 4. Student 클래스의 메소드 scoreAvg를 이용해 정보 출력
	void showScoreAvg() {
		Student student = null;

		for (int i = 0; i < students.length; i++) {
			student = students[i];
			if (student == null) {
				break;
			}

			System.out.printf("%d번째 학생의 평균 : %.2f\n",i+1 ,student.scoreAvg());
		}
	}

}
