package exam;

import java.util.Scanner;

public class GradesProgramming {

	public static void main(String[] args) {
		/*
		 * 369게임을 간단히 작성해보자. 1~99까지의 정수를 키보드로부터 입력받고 그 수가 범위에 속하지 않으면 "값의 범위를 초과하였습니다"
		 * 라고 출력하고 종료한다. 정수에 3, 6, 9 중 하나가 있는 경우는 "박수짝"을 출력하고 두 개 있는 경우는 "박수짝짝"을 출력하는
		 * 프로그램을 작성하라. 예를 들면 정수가 13인 경우 "박수짝" , 36인 경우 "박수짝짝"을 출력하면 된다.
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.println("1-99까지의 정수를 입력하시오");
		System.out.println("1-99까지의 정수를 입력하시오");
		int x = scanner.nextInt();

		if (x < 0 || x > 99)
			System.out.println("값의 범위를 초과하였습니다");

		int a = x / 10;
		int b = x % 10;

		if ((a == 3 || a == 6 || a == 9) && (b == 3 || b == 6 || b == 9)) {
			System.out.println("박수짝짝");
		} else if ((a == 3 || a == 6 || a == 9) || (b == 3 || b == 6 || b == 9)) {
			System.out.println("박수짝");
		}

		scanner.close();

	}
}
