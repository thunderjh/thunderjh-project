package exam_continue;

public class ContinueExample {
	// ���ڿ� "no news is good news"�� ������� �ݺ��Ͽ� ���� 'n'�� ��Ÿ���� Ƚ���� ī�����Ѵ�
	// ���� ���� ���ڰ� 'n'�� �ƴϸ� continue���� ���Ͽ� ������ ������ �κ��� �����ϰ� ���� ���ڸ� ó��
	// ���� ���� ���̴� ���ڿ�������.length()�� ���� �� ������
	// ���ڿ�������.charAt(0)�� ����ϸ� ���ڿ������� ����� ���ڿ��� ù��° ���� �ϳ�(0)�� ��ȯ
	// .length()����������������
	//countinue�� �̿� ����
	public static void main(String[] args) {
		String a = "no news is good news";
		int count = 0;

		for (int i = 0; i < a.length(); i++) {

			if (a.charAt(i) != 'n')
				continue;

			count++;
		}
		System.out.println(count);
	}

}
