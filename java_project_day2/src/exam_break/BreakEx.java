package exam_break;

import java.util.Scanner;

public class BreakEx {
	// ����ڰ� �Է��� ������ ����, ����� ���� ���α׷��� �ۼ��Ͻÿ�
	// �� ����� 0~100 ���̰� �ƴ� �� �Է��ϸ� �ȴ�.
	public static void main(String[] args) {

		int total = 0;
		int count = 0;
		double average = 0;
		
		Scanner input = new Scanner(System.in);
		while (true) {

			System.out.print("������ �Է����ּ���(����� 0~100 ���̰� �ƴ� �� �Է�)");
			int sub = input.nextInt();

			if (sub < 0 || sub > 100)
				{System.out.println("���α׷��� �����մϴ�.");
				break;}

			total += sub;

			count++;

		}
		input.close();

		if (count != 0) {
			average = total / count;
			System.out.println("����: " + total);
			System.out.printf("���: %.1f", average);

		} 
	}

}
