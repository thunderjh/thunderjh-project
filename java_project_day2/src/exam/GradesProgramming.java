package exam;

import java.util.Scanner;

public class GradesProgramming {

	public static void main(String[] args) {
		/*
		 * 369������ ������ �ۼ��غ���. 1~99������ ������ Ű����κ��� �Է¹ް� �� ���� ������ ������ ������ "���� ������ �ʰ��Ͽ����ϴ�"
		 * ��� ����ϰ� �����Ѵ�. ������ 3, 6, 9 �� �ϳ��� �ִ� ���� "�ڼ�¦"�� ����ϰ� �� �� �ִ� ���� "�ڼ�¦¦"�� ����ϴ�
		 * ���α׷��� �ۼ��϶�. ���� ��� ������ 13�� ��� "�ڼ�¦" , 36�� ��� "�ڼ�¦¦"�� ����ϸ� �ȴ�.
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.println("1-99������ ������ �Է��Ͻÿ�");
		System.out.println("1-99������ ������ �Է��Ͻÿ�");
		int x = scanner.nextInt();

		if (x < 0 || x > 99)
			System.out.println("���� ������ �ʰ��Ͽ����ϴ�");

		int a = x / 10;
		int b = x % 10;

		if ((a == 3 || a == 6 || a == 9) && (b == 3 || b == 6 || b == 9)) {
			System.out.println("�ڼ�¦¦");
		} else if ((a == 3 || a == 6 || a == 9) || (b == 3 || b == 6 || b == 9)) {
			System.out.println("�ڼ�¦");
		}

		scanner.close();

	}
}
