package exam_while;

public class exx {

	public static void main(String[] args) {
		// while문을 이용하여 1부터 5까지 출력하는 코드를 작성

		int a = 1;
		while (a >= 1 && a <= 5) {
			System.out.println(a++);
		}
		System.out.println();
		
		

		// for문을 이용해서 1-10까지의 정수 중 3의 배수의 총합을 구하는 코드]
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0)
				sum += i;

		}
		System.out.println(sum);
	}
}
