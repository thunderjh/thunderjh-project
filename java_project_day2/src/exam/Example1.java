package exam;

import java.util.Scanner;

public class Example1 {
	/*
	 * ���� ����� �켱 ����ڷκ��� 2���� ���ڸ� �Է¹޴´� �̾ ����ڷκ��� �ϳ��� ���ڸ� �Է¹޴´� ����ڷκ��� ���� ���ڰ� '+'�̸�
	 * �� ���� ������ '-'�̸� ���� '*'�̸� ���� '/'�̸� �������� �����ϵ��� �������� ��� �и� 0�� �ƴ����� ���� �˻�
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);


		System.out.print("�ѹ� �� �غ��ϴ�");
		System.out.print("�ѹ� �� �غ��ϴ�");
		System.out.print("�ѹ� �� �غ��ϴ�");
		System.out.print("test���� �ٲ� ����");
		System.out.print("�ƿ� �����");
		System.out.print("�ƿ� �����");
		System.out.print("���� 1���� �Է��Ͻÿ�");
		System.out.print("���� 1���� �Է��Ͻÿ�");
		int num1 = input.nextInt();

		System.out.print("���� 1���� �Է��Ͻÿ�");
		int num2 = input.nextInt();
		input.nextLine(); // �����Է�..���Ͱ� ����!!

		System.out.print("���� 1���� �Է��Ͻÿ�");
		char ch = input.next().charAt(0); // !! �ڹ� Scanner�� ���ڸ� �Է¹޴� ����� ����.

		int result = 0; // default���� �ȸ��� �ʱⰪ ���� �� ����

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
//				System.out.print("0 �ƴ� ���� 1���� �Է��Ͻÿ�");
//				num2 = input.nextInt();
//				result = num1 / num2;

				System.out.println("0���� ���� �� �����ϴ�");
				input.close();
				return; // !!
			}

			break;
		default:
			System.out.println("��Ģ ������ �ƴմϴ�.");
			input.close();
			return; // !!

		}

		System.out.println(result);

		input.close();

	}

}
