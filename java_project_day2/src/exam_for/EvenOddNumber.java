package exam_for;
import java.util.Scanner;
public class EvenOddNumber {

	public static void main(String[] args) {
		//!!!!!!�� ���� �Է� �޾� �� �� ���̿� Ȧ���� �հ� ¦�� ��
		Scanner input = new Scanner(System.in);
		System.out.println("���� 1���� �Է�");
		int a = input.nextInt();
		System.out.println("���� 1���� �Է�");
		int b = input.nextInt();
		
		int sum1=0;
		int sum2=0;
		//���� ũ�⿡ ������� ���� �����ϵ���!!!!!!
			if(a>b) {
			int temp = a;
			a =b;
			b= temp;
		}
		
		for(int i =a ; b>=i;i++) {
			if(i%2==0) {sum1 += i;}
			else {sum2 +=i;}
		}
		System.out.println("Ȧ���� ����" + sum2 + "¦���� ����" + sum1);
		
		input.close();
		
		//���2
		
	}

}
