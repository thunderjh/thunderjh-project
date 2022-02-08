package exam;

import java.util.Scanner;

public class GragesProgramming {
	/*
	 * ������ ���� �������� ���� ó�� ���α׷��� �ۼ��Ͻÿ�. [����] �� �߰����, �⸻���, ����Ʈ, �⼮ ������ �Է¹޾Ƽ� ����Ѵ� ��
	 * ������ �Ʒ��� ���� ������ �ջ��ϵ� �Ҽ� ���� 2�ڸ����� ����϶� �� (�߰�+�⸻)/2 -> 60% �� ����Ʈ -> 20% �� �⼮ ->
	 * 20% �� ������ ����(if ~ else if ~ else�� �̿�) 90�̻� 'A'���� / 80�̻� 'B'���� / 70���̻� 'C'���� /
	 * 60���̻� 'D'���� / ������ 'F'���� �� �򰡱���(switch���̿�) A,B���� "excellent" -> C,D���� ->
	 * "good" F���� -> "poor" �� ���ȭ�� ------ ����Դϴ� ------ �߰����: 90 �⸻���: 89 ����Ʈ: 99
	 * �⼮����: 100
	 * 
	 * ���� : 93.50 ���� : A �� : excellent
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("�߰���� ������ �Է�:");
		int first = scanner.nextInt();

		System.out.print("�⸻��� ������ �Է�:");
		int second = scanner.nextInt();
		;

		System.out.print("����Ʈ ������ �Է�:");
		int report = scanner.nextInt();

		System.out.print("�⼮ ������ �Է�:");
		int attendance = scanner.nextInt();

		float score = (float)(((first + second) / 2 * 0.6) + (report * 0.2) + (attendance * 0.2)); //double��
		//double score = ((first + second) / 2 * 0.6) + (report * 0.2) + (attendance * 0.2);
		
		char grade;

		if (score > 90)
			grade = 'A';
		else if (score > 80)
			grade = 'B';
		else if (score > 70)
			grade = 'C';
		else if (score > 60)
			grade = 'D';
		else
			grade = 'F';

		String appraisal = "";

		switch (grade) {
		case 'A':
		case 'B':
			appraisal = "excellent";
			break;
		case 'C':
		case 'D':
			appraisal = "good";
			break;
		case 'F':
			appraisal = "poor";
			break;
		}

		System.out.println("------ ����Դϴ� ------");
		System.out.println("�߰����: " + first);
		System.out.println("�⸻���: " + second);
		System.out.println("����Ʈ: " + report);
		System.out.println("�⼮����: " + attendance);
		System.out.println();
		System.out.printf("����: %.2f ", score);
		System.out.println();
		System.out.println("����: " + grade);
		System.out.println("��: " + appraisal);

		scanner.close();

	}

}
