package exam_while;

import java.util.Scanner;

public class NumverSum {
//����ڷκ��� 5���� ���� �о �հ� ��հ� ����Ͽ� ���

	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		double avg = 0;

		Scanner input = new Scanner(System.in);
		//int i =1;
		//while(i<=5){System.out.println(i + "��° �� �Է�: ");
		//int a = input.nextInt();
		//sum += a;
		//i++}
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "��° �� �Է�: ");
			int a = input.nextInt();
			sum += a;
			count++;

		}
		if (count != 0)
			avg = sum / count;
		else
			System.out.println("�Է����� �ʾҽ��ϴ�");

		System.out.println("�Է� ���� ��");
		System.out.printf("�հ� : %d ���: %.1f", sum, avg);

		input.close();
	}

}
