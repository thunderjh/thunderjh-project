package exam_for;
import java.util.Scanner;
public class MaxMinEx {

	public static void main(String[] args) {
		//10개의 데이터를 입력받아 최소값, 최대값 구하여 출력
		Scanner input = new Scanner(System.in);
		//!!최소값, 최대값!! 구할 때 담을 수 있는 변수를 어떤 값으로 초기화 할 것인가.
		int a;
		int max = 99999; //!!
		int min = -99999; //!!
		
		for(int i=0; i<10;i++) {
			System.out.println("숫자 입력");
			a = input.nextInt();
			
			if(max < a) {
				max = a;
		
			} else if(min > a) {
				min = a;
			}
			
			if(i==9)
				input.close();
			
			
		}
		System.out.printf("최대값은 %d\t최솟값은 %d\n", max, min);

	}

}
