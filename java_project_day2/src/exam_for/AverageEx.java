package exam_for;
import java.util.Scanner;
public class AverageEx {

	public static void main(String[] args) {
		// !!10���� ���ڸ� �Է¹޾� 0���� ū ���ڿ� ���� ��հ� ������ ��� !!
		Scanner input = new Scanner(System.in);
		
		int i, total = 0, count =0, a;
		double avg;
		//���� 10�� �Է¹��� �ݺ�������
		for (i=0; i<10; i++) {
			System.out.println("���� �ϳ��� �Է�");
			a = input.nextInt();
			
			if(a>0) {
				total += a;
				count ++;
			}
			if(i==9) {
				input.close(); //10�� �� �޾����� ����
			}
			
		} //�ݺ��� ��
		
		if(count !=0) {
			avg = (double) total /  count; //��� double ��
			System.out.printf("����� %10.2f ������ %d\n", avg,count);
			//%10.2f 10°�ڸ���ǥ�� + �Ҽ��� ��°�ڸ���
		}else {System.out.println("����� ���� �� ����");}
	}

}
