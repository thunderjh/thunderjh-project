package exam_while;

import java.util.Scanner;

public class WhileExample {
	// -1이 입력될 때까지(-1이 입력되면 종료시키면됨) 정수를 입력받아 그 수들의 합을 출력하는 프로그램을 작성하시오
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int sum = 0;
		int count = 0;

		System.out.println("정수를 입력하시오[종료는 -1]");
		int x = input.nextInt();

		while (x != -1) {
			sum += x;
			count++;
			x = input.nextInt(); // !!
		}

		if (count == 0)
			System.out.println("입력된 수가 없다");

		System.out.println(sum);

		input.close();
	}

}
