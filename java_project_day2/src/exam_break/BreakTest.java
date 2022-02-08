package exam_break;

public class BreakTest {

	public static void main(String[] args) {
		//1
		int i;
		i = 5;
		System.out.println("Countdown strart!");

		while (true) {
			if (i == 0) {
				break;
			} // 무한 반복문 종료
			System.out.println(i);
			i--; }
		//2
			int j=1;
			System.out.println("Countdown strart!");

			while(true) {
				if(j==6) {
					break;
				}
				System.out.println(j);
				j++;}
		}

	}



