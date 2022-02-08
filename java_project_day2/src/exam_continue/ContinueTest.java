package exam_continue;

public class ContinueTest {

	public static void main(String[] args) {
		// 1~10까지의 수 중에서 홀수 출력.continue 사용
		int a = 0;
		do {
			a++;
			if (a % 2 == 0) //짝수면 그냥 넘어가라 조건문으로 다시
				continue;
			System.out.printf("%5d", a);

		} while (a < 10);

		System.out.println();
		// 1~10 짝수

		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0)
				continue; // for문 벗어나기
			System.out.printf("%5d", i);

		}
		System.out.println();
	}

}
