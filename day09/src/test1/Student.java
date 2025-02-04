package test1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Student {
//   Student 클래스
//   필드    학생번호 studentNumber
//      	학생이름 studentName
//      	성적배열 grades

	int studentNumber;
	String studentName;
	int[] grades;

//   생성자   studentName, grades 매개변수 2개 있는 생성자
	public Student(String studentName, int[] grades) {
		super();
		this.studentName = studentName;
		this.grades = grades;
	}

//   메소드    성적보기 메소드 showGradeInfo (매개변수x, 리턴타입x)
//         	학생이름, 학생번호, 국어성적, 영어성적, 수학성적 출력
	// 1. 출력문을 사용해 출력
	// Arrays.toString(grades)
	void showGradeInfo() {
		System.out.println(
				"학생 이름 : " + studentName + ", 학생 번호 : " + (studentNumber + 1) + ", 점수(국어, 영어, 수학) : " + Arrays.toString(grades));
	}

//      평균성적계산 메소드 scoreAvg    (매개변수x, 리턴타입 o double타입)
	// 1. double 타입의 결과 저장할 변수 result 선언
	// 2. for문으로 점수의 총합 구하기
	// 3. result를 이용해 평균 구한 후 리턴
	double scoreAvg() {
		double result = 0;
		for (int i = 0; i < grades.length; i++) {
			result += grades[i];
		}
		return result / grades.length;
	}

//      toString 오버라이딩
//         학생이름과 학생점수를 반환하는 메소드
	// 1. 오버라이딩
	@Override
	public String toString() {
		return "이름 : " + studentName + ", 점수 : " + Arrays.toString(grades);
	}

}