package exam_while;

import java.util.Scanner;

public class WhileExample {
	// -1�� �Էµ� ������(-1�� �ԷµǸ� �����Ű���) ������ �Է¹޾� �� ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int sum = 0;
		int count = 0;

		System.out.println("������ �Է��Ͻÿ�[����� -1]");
		int x = input.nextInt();

		while (x != -1) {
			sum += x;
			count++;
			x = input.nextInt(); // !!
		}

		if (count == 0)
			System.out.println("�Էµ� ���� ����");

		System.out.println(sum);

		input.close();
	}

}
