package exam_for;
import java.util.Scanner;
public class MaxMinEx {

	public static void main(String[] args) {
		//10���� �����͸� �Է¹޾� �ּҰ�, �ִ밪 ���Ͽ� ���
		Scanner input = new Scanner(System.in);
		//!!�ּҰ�, �ִ밪!! ���� �� ���� �� �ִ� ������ � ������ �ʱ�ȭ �� ���ΰ�.
		int a;
		int max = 99999; //!!
		int min = -99999; //!!
		
		for(int i=0; i<10;i++) {
			System.out.println("���� �Է�");
			a = input.nextInt();
			
			if(max < a) {
				max = a;
		
			} else if(min > a) {
				min = a;
			}
			
			if(i==9)
				input.close();
			
			
		}
		System.out.printf("�ִ밪�� %d\t�ּڰ��� %d\n", max, min);

	}

}
