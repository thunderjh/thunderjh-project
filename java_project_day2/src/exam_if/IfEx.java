package exam_if;

import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// 예제1. 사용자로 하여금 숫자 하나를 입력받아 짝수와 홀수를 출력하는 코드를 작성해 주세요

		int su = 0;

		System.out.print("숫자를 입력하시오");
		su = input.nextInt();

		if (su % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}

		// 예제2 사용자로 하여금 점수를 입력받아 학점 출력

		int jumsu = 0;

		System.out.print("점수입력해");
		jumsu = input.nextInt();
		
		//while문 사용 이렇게 하면 if문이 필요 없다!
		//while(jumsu <0 || jumsu >100) {
		//System.out.print("점수는 0~100 사이로 입력해 주세요.");
		//jumsu = input.nextInt();}
		
		//do {
			//System.out.println("점수는 0~100 사이로 입력해 주세요.");
		//}while(jumsu <0 || jumsu >100);
		
		
		if (jumsu < 0 || jumsu > 100) {
			System.out.println("점수를 잘못 입력하였습니다");
		} else {

			char hakjum; // char hakjum = '\0' 아무 것도 지정되지 않았을 때 아스키 코드 십진수 0 : NUL(NULL)

			if (jumsu >= 90)
				hakjum = 'A';
			else if (jumsu >= 80)
				hakjum = 'B';
			else if (jumsu >= 70)
				hakjum = 'C';
			else if (jumsu >= 60)
				hakjum = 'D';
			else
				hakjum = 'F';

			System.out.printf("점수 = %d 학점 = %c", jumsu, hakjum);
		}

		System.out.println();

		// switch 이용
		// switch(jumsu/10) {
		// case 9 : hakjum = 'A';
		// break;
		// case 8: hakjum ='B';
		// break;
		// case 7: hakjum = 'C';
		// break;
		// case 6: hakjum = 'D';
		// break;

		// default : hakjum = 'F'; }

		// System.out.printf("점수 = %d 학점 = %c", jumsu, hakjum);

		// 3개의 정수를 입력 받아서 최대값 출력

		int x, y, z;

		System.out.printf("정수를 입력하시오");
		x = input.nextInt();
		System.out.printf("정수를 입력하시오");
		y = input.nextInt();
		System.out.printf("정수를 입력하시오");
		z = input.nextInt();

		input.close(); // 입력받는 것이 필요하지 않으면 중단하기 꼭 마지막 x

		if (x > y && x > z)
			System.out.println("최대값은 " + x);
		else if (y > x && y > z)
			System.out.println("최대값은 " + y);
		else
			System.out.println("최대값은 " + z);

		// 방법2
		// int max = x;

		// if (y > max)
		// max = y;
		// if (z > max)
		// max = z;

		// System.out.println("최대값은" + max);

	}

}
