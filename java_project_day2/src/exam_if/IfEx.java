package exam_if;

import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// ����1. ����ڷ� �Ͽ��� ���� �ϳ��� �Է¹޾� ¦���� Ȧ���� ����ϴ� �ڵ带 �ۼ��� �ּ���

		int su = 0;

		System.out.print("���ڸ� �Է��Ͻÿ�");
		su = input.nextInt();

		if (su % 2 == 0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}

		// ����2 ����ڷ� �Ͽ��� ������ �Է¹޾� ���� ���

		int jumsu = 0;

		System.out.print("�����Է���");
		jumsu = input.nextInt();
		
		//while�� ��� �̷��� �ϸ� if���� �ʿ� ����!
		//while(jumsu <0 || jumsu >100) {
		//System.out.print("������ 0~100 ���̷� �Է��� �ּ���.");
		//jumsu = input.nextInt();}
		
		//do {
			//System.out.println("������ 0~100 ���̷� �Է��� �ּ���.");
		//}while(jumsu <0 || jumsu >100);
		
		
		if (jumsu < 0 || jumsu > 100) {
			System.out.println("������ �߸� �Է��Ͽ����ϴ�");
		} else {

			char hakjum; // char hakjum = '\0' �ƹ� �͵� �������� �ʾ��� �� �ƽ�Ű �ڵ� ������ 0 : NUL(NULL)

			if (jumsu >= 90)
				hakjum = 'A';
			else if (jumsu >= 80)
				hakjum = 'B';
			else if (jumsu >= 70)
				hakjum = 'C';
			else if (jumsu >= 60)
				hakjum = 'D';
			else
				hakjum = 'F';

			System.out.printf("���� = %d ���� = %c", jumsu, hakjum);
		}

		System.out.println();

		// switch �̿�
		// switch(jumsu/10) {
		// case 9 : hakjum = 'A';
		// break;
		// case 8: hakjum ='B';
		// break;
		// case 7: hakjum = 'C';
		// break;
		// case 6: hakjum = 'D';
		// break;

		// default : hakjum = 'F'; }

		// System.out.printf("���� = %d ���� = %c", jumsu, hakjum);

		// 3���� ������ �Է� �޾Ƽ� �ִ밪 ���

		int x, y, z;

		System.out.printf("������ �Է��Ͻÿ�");
		x = input.nextInt();
		System.out.printf("������ �Է��Ͻÿ�");
		y = input.nextInt();
		System.out.printf("������ �Է��Ͻÿ�");
		z = input.nextInt();

		input.close(); // �Է¹޴� ���� �ʿ����� ������ �ߴ��ϱ� �� ������ x

		if (x > y && x > z)
			System.out.println("�ִ밪�� " + x);
		else if (y > x && y > z)
			System.out.println("�ִ밪�� " + y);
		else
			System.out.println("�ִ밪�� " + z);

		// ���2
		// int max = x;

		// if (y > max)
		// max = y;
		// if (z > max)
		// max = z;

		// System.out.println("�ִ밪��" + max);

	}

}
