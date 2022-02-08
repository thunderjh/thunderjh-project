package exam_while;

import java.util.Scanner;

public class NumverSum {
//사용자로부터 5개의 정수 읽어서 합과 평균값 계산하여 출력

	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		double avg = 0;

		Scanner input = new Scanner(System.in);
		//int i =1;
		//while(i<=5){System.out.println(i + "번째 수 입력: ");
		//int a = input.nextInt();
		//sum += a;
		//i++}
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "번째 수 입력: ");
			int a = input.nextInt();
			sum += a;
			count++;

		}
		if (count != 0)
			avg = sum / count;
		else
			System.out.println("입력하지 않았습니다");

		System.out.println("입력 받은 수");
		System.out.printf("합계 : %d 평균: %.1f", sum, avg);

		input.close();
	}

}
