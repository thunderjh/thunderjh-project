package exam_operation;

import java.util.Scanner;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		
		System.out.println("�� �� �߿��� �ִ밪 : " + ((x>y)? x : y)); //�����ϰ�
		
		//������ ���� ���� ������ �����ϰ� �� ���� ¦������ Ȧ�������� ����� �� �ֵ��� �ۼ�
		//���� ��� "4�� ¦���Դϴ�.
		
	
		  int num;
		  Scanner input = new Scanner(System.in);
		  System.out.print("���� �Է��� �ּ���."); 
		  num = input.nextInt();
		  
		  System.out.printf(num + "��");
		  System.out.printf((num%2 ==0) ? "¦��" : "Ȧ��");
		  System.out.printf("�Դϴ�");
		  
		  input.close();
		 
		//�μ��� ���� ����� �ּ���. �� ū������ �������� ���� ��� ����Ѵ�.
		
		
		  int a, b; 
		 
		  // Scanner input = new Scanner(System.in);   !!! �ٽ� ���� ���ص� �ȴ�
		  
		  System.out.print("���� �Է��� �ּ���.");
		  a = input.nextInt();
		  System.out.print("���� �Է��� �ּ���.");
		  b = input.nextInt();
		  
		  System.out.println("�� ���� ����" + ((a>b) ? a-b : b-a));
		  
		  input.close();
		 
		
	}

}
