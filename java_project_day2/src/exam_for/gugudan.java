package exam_for;

import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) {
		// ������
		Scanner input = new Scanner(System.in);
		System.out.println("����� ���� �Է��Ͻÿ�");

		int dan = input.nextInt();

		if (dan < 2 || dan > 9) {
			System.out.println("���� 2�ܿ������� 9�ܱ����� �Է��� �ּ���");
		} else {
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + "*" + i + "=" + (dan * i));
			}

		}

		input.close();

		// for(int i =2; i<=9; i++) {
		// for(int j=1; j<=9; j++) {
		// System.out.println(i + "*" + j +"=" + i * j);
		// }}
	}
}
