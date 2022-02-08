package exam;

import java.util.Scanner;

public class RepetitiveExample {
	// [요구사항]
	// 메뉴에 있는 연산자를 선택하고 피연산자 두 개를 먼저 입력받아 사칙연산을 하는 프로그램의 코드를 작성하여라.
	// [조건]
	// ① 메뉴에서 1~5사이가 아니면 다시 입력
	// ② 종료가 선택될 때까지 반복
	// [실행 예]
	// 연산자를 1~4으로, 종료는 5를 선택해 주세요.
	// 1. +
	// 2. -
	// 3. *
	// 4. /
	// 5. 종료
	// 선택>>
	// 1
	// 사칙연산을 할 두 수를 입력하세요 : 1 4
	// 1 + 4 = 5
	// 1. +
	// 2. -
	// 3. *
	// 4. /
	// 5. 종료
	// 선택>>
	// 9
	// 1~5 사이의 숫자를 입력해주세요.
	// 1. +
	// 2. -
	// 3. *
	// 4. /
	// 5. 종료
	// 선택>>
	// 5
	// 프로그램을 종료합니다.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.println("연산자를 1~4으로, 종료는 5를 선택해 주세요.");
			System.out.println("1. +");
			System.out.println("2. -");
			System.out.println("3. *");
			System.out.println("4. /");
			System.out.println("5. 종료");
			System.out.println("선택>>");
			int op = input.nextInt();

			if (op == 5) {
				break;
			} // 무한 반복문 종료

			if (op < 0 || op > 5) {
				System.out.println("1~5 사이의 숫자를 입력해주세요.");
				continue;
			} else {
				System.out.print("사칙연산을 할 두 수를 입력하세요 : ");
				int x = input.nextInt();
				int y = input.nextInt();

				if (x < 0 || x > 5 || y < 0 || y > 5) {
					System.out.println("1~5 사이의 숫자를 입력해주세요.");
					continue;
				} else if (x == 5 || y == 5) {
					break; //없어도 될듯
				} else {

					switch (op) {
					case 1:
						System.out.println(x + "+" + y + "=" + (x + y));
						break;
					case 2:
						System.out.println(x + "-" + y + "=" + (x - y));
						break;
					case 3:
						System.out.println(x + "*" + y + "=" + (x * y));
						break;
					case 4:
						System.out.println(x + "/" + y + "=" + (x / y));
						break;
					}
				}
			}
		}
		System.out.println("프로그램을 종료합니다.");
		input.close();

	}

}

////menu:
//while(true) {
//	System.out.println("연산자를 1~4로, 종료는 5를 선택해 주세요.");
//	System.out.println("1. +");
//	System.out.println("2. -");
//	System.out.println("3. *");
//	System.out.println("4. /");
//	System.out.println("5. 종료");
//	System.out.print("선택>>");
//	int op = sc.nextInt();
//	
//	switch(op) {
//	case 1:
//		System.out.print("사칙연산을 할 두 수를 입력하세요 : ");
//		int x1 = sc.nextInt();
//		int y1 = sc.nextInt();
//		System.out.println(x1 + "+" + y1 + "=" + (x1 + y1));
//		break;
//	case 2:
//		System.out.print("사칙연산을 할 두 수를 입력하세요 : ");
//		int x2 = sc.nextInt();
//		int y2 = sc.nextInt();
//		System.out.println(x2 + "-" + y2 + "=" + (x2 - y2));
//		break;
//	case 3:
//		System.out.print("사칙연산을 할 두 수를 입력하세요 : ");
//		int x3 = sc.nextInt();
//		int y3 = sc.nextInt();
//		System.out.println(x3 + "*" + y3 + "=" + (x3 * y3));
//		break;
//	case 4:
//		System.out.print("사칙연산을 할 두 수를 입력하세요 : ");
//		int x4 = sc.nextInt();
//		int y4 = sc.nextInt();
//		System.out.println(x4 + "/" + y4 + "=" + (x4 / y4));
//		break;
//	case 5:
//		System.out.println("프로그램을 종료합니다.");
//		return; //종료
//	default:
//		System.out.println("1~5 사이의 숫자를 입력해 주세요.");
//		continue menu;
