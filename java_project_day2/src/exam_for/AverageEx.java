package exam_for;
import java.util.Scanner;
public class AverageEx {

	public static void main(String[] args) {
		// !!10개의 숫자를 입력받아 0보다 큰 숫자에 대한 평균과 개수를 출력 !!
		Scanner input = new Scanner(System.in);
		
		int i, total = 0, count =0, a;
		double avg;
		//숫자 10개 입력받자 반복문으로
		for (i=0; i<10; i++) {
			System.out.println("숫자 하나를 입력");
			a = input.nextInt();
			
			if(a>0) {
				total += a;
				count ++;
			}
			if(i==9) {
				input.close(); //10개 다 받았으니 종료
			}
			
		} //반복문 끝
		
		if(count !=0) {
			avg = (double) total /  count; //평균 double 형
			System.out.printf("평균은 %10.2f 개수는 %d\n", avg,count);
			//%10.2f 10째자리수표시 + 소수점 둘째자리수
		}else {System.out.println("평균을 구할 수 없다");}
	}

}
