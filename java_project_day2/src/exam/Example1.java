package exam;

import java.util.Scanner;

public class Example1 {
	/*
	 * 계산기 만들기 우선 사용자로부터 2개의 숫자를 입력받는다 이어서 사용자로부터 하나의 문자를 입력받는다 사용자로부터 받은 문자가 '+'이면
	 * 두 수의 덧셈을 '-'이면 뺄셈 '*'이면 곱셈 '/'이면 나눗셈을 수행하도록 나눗셈의 경우 분모가 0이 아닌지를 먼저 검사
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);


		System.out.print("한번 더 해봅니다");
		System.out.print("한번 더 해봅니다");
		System.out.print("한번 더 해봅니다");
		System.out.print("test에서 바꾼 내용");
		System.out.print("아오 어려워");
		System.out.print("아오 어려워");
		System.out.print("숫자 1개를 입력하시오");
		System.out.print("숫자 1개를 입력하시오");
		int num1 = input.nextInt();

		System.out.print("숫자 1개를 입력하시오");
		int num2 = input.nextInt();
		input.nextLine(); // 문자입력..엔터값 제어!!

		System.out.print("문자 1개를 입력하시오");
		char ch = input.next().charAt(0); // !! 자바 Scanner는 문자를 입력받는 기능이 없다.

		int result = 0; // default문을 안만들어서 초기값 없을 시 오류

		switch (ch) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;

		case '*':
			result = num1 * num2;
			break;
		case '/':
			if (num2 != 0)
				result = num1 / num2;
			else {
//				System.out.print("0 아닌 숫자 1개를 입력하시오");
//				num2 = input.nextInt();
//				result = num1 / num2;

				System.out.println("0으로 나눌 수 없습니다");
				input.close();
				return; // !!
			}

			break;
		default:
			System.out.println("사칙 연산이 아닙니다.");
			input.close();
			return; // !!

		}

		System.out.println(result);

		input.close();

	}

}
