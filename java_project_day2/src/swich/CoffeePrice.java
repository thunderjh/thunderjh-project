package swich;

import java.util.Scanner;

public class CoffeePrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("���� Ŀ�� ��?");
		String order = scanner.next();

		int price = 0;

		switch (order) {
		case "īǪġ��":
		case "ī���":
			price = 3500;
			break;
		case "����������":
		case "�Ƹ޸�ī��":
			price = 2000;
			break;
		default:
			System.out.println("�޴��� ����");
		}

		if (price != 0) {
			System.out.println(order + "��" + price + "���Դϴ�");

		}

		scanner.close();
	}
}
