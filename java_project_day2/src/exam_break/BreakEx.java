package exam_break;

import java.util.Scanner;

public class BreakEx {
	// 사용자가 입력한 점수의 총점, 평균을 내는 프로그램을 작성하시오
	// 단 종료는 0~100 사이가 아닌 값 입력하면 된다.
	public static void main(String[] args) {

		int total = 0;
		int count = 0;
		double average = 0;
		
		Scanner input = new Scanner(System.in);
		while (true) {

			System.out.print("점수를 입력해주세요(종료는 0~100 사이가 아닌 값 입력)");
			int sub = input.nextInt();

			if (sub < 0 || sub > 100)
				{System.out.println("프로그램을 종료합니다.");
				break;}

			total += sub;

			count++;

		}
		input.close();

		if (count != 0) {
			average = total / count;
			System.out.println("총점: " + total);
			System.out.printf("평균: %.1f", average);

		} 
	}

}
