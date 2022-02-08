package exam_for;
import java.util.Scanner;
public class EvenOddNumber {

	public static void main(String[] args) {
		//!!!!!!두 수를 입력 받아 두 수 사이에 홀수의 합과 짝수 합
		Scanner input = new Scanner(System.in);
		System.out.println("숫자 1개를 입력");
		int a = input.nextInt();
		System.out.println("숫자 1개를 입력");
		int b = input.nextInt();
		
		int sum1=0;
		int sum2=0;
		//수의 크기에 상관없이 수행 가능하도록!!!!!!
			if(a>b) {
			int temp = a;
			a =b;
			b= temp;
		}
		
		for(int i =a ; b>=i;i++) {
			if(i%2==0) {sum1 += i;}
			else {sum2 +=i;}
		}
		System.out.println("홀수의 합은" + sum2 + "짝수의 합은" + sum1);
		
		input.close();
		
		//방법2
		
	}

}
