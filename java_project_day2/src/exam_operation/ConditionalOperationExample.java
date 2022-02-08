package exam_operation;

import java.util.Scanner;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		
		System.out.println("두 수 중에서 최대값 : " + ((x>y)? x : y)); //간단하게
		
		//임의의 수를 가진 변수를 선언하고 그 값이 짝수인지 홀수인지를 출력할 수 있도록 작성
		//예를 들어 "4는 짝수입니다.
		
	
		  int num;
		  Scanner input = new Scanner(System.in);
		  System.out.print("숫자 입력해 주세요."); 
		  num = input.nextInt();
		  
		  System.out.printf(num + "는");
		  System.out.printf((num%2 ==0) ? "짝수" : "홀수");
		  System.out.printf("입니다");
		  
		  input.close();
		 
		//두수의 차를 출력해 주세요. 단 큰수에서 작은수를 빼서 결과 출력한다.
		
		
		  int a, b; 
		 
		  // Scanner input = new Scanner(System.in);   !!! 다시 정의 안해도 된다
		  
		  System.out.print("숫자 입력해 주세요.");
		  a = input.nextInt();
		  System.out.print("숫자 입력해 주세요.");
		  b = input.nextInt();
		  
		  System.out.println("두 수의 차는" + ((a>b) ? a-b : b-a));
		  
		  input.close();
		 
		
	}

}
