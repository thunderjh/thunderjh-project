package exam;

import java.util.Scanner;

public class RepetitiveExample {
	// [�䱸����]
	// �޴��� �ִ� �����ڸ� �����ϰ� �ǿ����� �� ���� ���� �Է¹޾� ��Ģ������ �ϴ� ���α׷��� �ڵ带 �ۼ��Ͽ���.
	// [����]
	// �� �޴����� 1~5���̰� �ƴϸ� �ٽ� �Է�
	// �� ���ᰡ ���õ� ������ �ݺ�
	// [���� ��]
	// �����ڸ� 1~4����, ����� 5�� ������ �ּ���.
	// 1. +
	// 2. -
	// 3. *
	// 4. /
	// 5. ����
	// ����>>
	// 1
	// ��Ģ������ �� �� ���� �Է��ϼ��� : 1 4
	// 1 + 4 = 5
	// 1. +
	// 2. -
	// 3. *
	// 4. /
	// 5. ����
	// ����>>
	// 9
	// 1~5 ������ ���ڸ� �Է����ּ���.
	// 1. +
	// 2. -
	// 3. *
	// 4. /
	// 5. ����
	// ����>>
	// 5
	// ���α׷��� �����մϴ�.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.println("�����ڸ� 1~4����, ����� 5�� ������ �ּ���.");
			System.out.println("1. +");
			System.out.println("2. -");
			System.out.println("3. *");
			System.out.println("4. /");
			System.out.println("5. ����");
			System.out.println("����>>");
			int op = input.nextInt();

			if (op == 5) {
				break;
			} // ���� �ݺ��� ����

			if (op < 0 || op > 5) {
				System.out.println("1~5 ������ ���ڸ� �Է����ּ���.");
				continue;
			} else {
				System.out.print("��Ģ������ �� �� ���� �Է��ϼ��� : ");
				int x = input.nextInt();
				int y = input.nextInt();

				if (x < 0 || x > 5 || y < 0 || y > 5) {
					System.out.println("1~5 ������ ���ڸ� �Է����ּ���.");
					continue;
				} else if (x == 5 || y == 5) {
					break; //��� �ɵ�
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
		System.out.println("���α׷��� �����մϴ�.");
		input.close();

	}

}

////menu:
//while(true) {
//	System.out.println("�����ڸ� 1~4��, ����� 5�� ������ �ּ���.");
//	System.out.println("1. +");
//	System.out.println("2. -");
//	System.out.println("3. *");
//	System.out.println("4. /");
//	System.out.println("5. ����");
//	System.out.print("����>>");
//	int op = sc.nextInt();
//	
//	switch(op) {
//	case 1:
//		System.out.print("��Ģ������ �� �� ���� �Է��ϼ��� : ");
//		int x1 = sc.nextInt();
//		int y1 = sc.nextInt();
//		System.out.println(x1 + "+" + y1 + "=" + (x1 + y1));
//		break;
//	case 2:
//		System.out.print("��Ģ������ �� �� ���� �Է��ϼ��� : ");
//		int x2 = sc.nextInt();
//		int y2 = sc.nextInt();
//		System.out.println(x2 + "-" + y2 + "=" + (x2 - y2));
//		break;
//	case 3:
//		System.out.print("��Ģ������ �� �� ���� �Է��ϼ��� : ");
//		int x3 = sc.nextInt();
//		int y3 = sc.nextInt();
//		System.out.println(x3 + "*" + y3 + "=" + (x3 * y3));
//		break;
//	case 4:
//		System.out.print("��Ģ������ �� �� ���� �Է��ϼ��� : ");
//		int x4 = sc.nextInt();
//		int y4 = sc.nextInt();
//		System.out.println(x4 + "/" + y4 + "=" + (x4 / y4));
//		break;
//	case 5:
//		System.out.println("���α׷��� �����մϴ�.");
//		return; //����
//	default:
//		System.out.println("1~5 ������ ���ڸ� �Է��� �ּ���.");
//		continue menu;
