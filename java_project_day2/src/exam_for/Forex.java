package exam_for;

import java.util.Scanner;

public class Forex {

	public static void main(String[] args) {
		// �ǽ�1

		for (int i = 1; i <= 5; i++) {
			System.out.print(i + ". ");
			System.out.print("Hello World!");
			System.out.println("I love Coding"); //1. Hello World!I love Coding
		}

		// �ǽ� 2 1���� 10���� ������ ��
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}

		System.out.printf("1���� 10���� ������ �� = %d\n", sum);
		System.out.println();

		// �ǽ� 3
		int start, end;
		Scanner input = new Scanner(System.in);
		System.out.print("�ΰ��� �� �Է�: ");
		start = input.nextInt();
		end = input.nextInt();

		for (int i = start; i <= end; i++) {
			System.out.print(i + " ");
		}

		input.close();
	}

}
