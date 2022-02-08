package exam;

import java.util.Scanner;

public class GragesProgramming {
	/*
	 * 다음과 같은 조건으로 성적 처리 프로그램을 작성하시오. [조건] ① 중간고사, 기말고사, 레포트, 출석 점수를 입력받아서 계산한다 ②
	 * 성적은 아래에 준한 점수를 합산하되 소수 이하 2자리까지 출력하라 ⓐ (중간+기말)/2 -> 60% ⓑ 레포트 -> 20% ⓒ 출석 ->
	 * 20% ③ 학점의 기준(if ~ else if ~ else문 이용) 90이상 'A'학점 / 80이상 'B'학점 / 70점이상 'C'학점 /
	 * 60점이상 'D'학점 / 나머지 'F'학점 ④ 평가기준(switch문이용) A,B학점 "excellent" -> C,D학점 ->
	 * "good" F학점 -> "poor" ⑤ 출력화면 ------ 결과입니다 ------ 중간고사: 90 기말고사: 89 레포트: 99
	 * 출석점수: 100
	 * 
	 * 성적 : 93.50 학점 : A 평가 : excellent
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("중간고사 점수를 입력:");
		int first = scanner.nextInt();

		System.out.print("기말고사 점수를 입력:");
		int second = scanner.nextInt();
		;

		System.out.print("레포트 점수를 입력:");
		int report = scanner.nextInt();

		System.out.print("출석 점수를 입력:");
		int attendance = scanner.nextInt();

		float score = (float)(((first + second) / 2 * 0.6) + (report * 0.2) + (attendance * 0.2)); //double로
		//double score = ((first + second) / 2 * 0.6) + (report * 0.2) + (attendance * 0.2);
		
		char grade;

		if (score > 90)
			grade = 'A';
		else if (score > 80)
			grade = 'B';
		else if (score > 70)
			grade = 'C';
		else if (score > 60)
			grade = 'D';
		else
			grade = 'F';

		String appraisal = "";

		switch (grade) {
		case 'A':
		case 'B':
			appraisal = "excellent";
			break;
		case 'C':
		case 'D':
			appraisal = "good";
			break;
		case 'F':
			appraisal = "poor";
			break;
		}

		System.out.println("------ 결과입니다 ------");
		System.out.println("중간고사: " + first);
		System.out.println("기말고사: " + second);
		System.out.println("레포트: " + report);
		System.out.println("출석점수: " + attendance);
		System.out.println();
		System.out.printf("성적: %.2f ", score);
		System.out.println();
		System.out.println("학점: " + grade);
		System.out.println("평가: " + appraisal);

		scanner.close();

	}

}
