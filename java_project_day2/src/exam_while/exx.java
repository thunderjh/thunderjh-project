package exam_while;

public class exx {

	public static void main(String[] args) {
		// while���� �̿��Ͽ� 1���� 5���� ����ϴ� �ڵ带 �ۼ�

		int a = 1;
		while (a >= 1 && a <= 5) {
			System.out.println(a++);
		}
		System.out.println();
		
		

		// for���� �̿��ؼ� 1-10������ ���� �� 3�� ����� ������ ���ϴ� �ڵ�]
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0)
				sum += i;

		}
		System.out.println(sum);
	}
}
