import java.util.Scanner;
import java.util.Random;

public class Quizz4 {
	public static void main(String[] args) {
	 
	 // 1번을 누르면 주사위를 굴리고 0번은 그만두기
	 // 두 주사위의 합이 7이 되면 무인도행
	 // 무인도 탈출을 위해서 같은 수가 나오면 된다.
	 // 무인도에 갇힌 경우 주사위를 3변 굴렸다면 무인도에서 탈출
	 // 무인도에 갇히지 않은 경우에는 주사위의 합만큼 칸을 이동
	Scanner sc = new Scanner(System.in);
	Random random = new Random();

	int island = 0; //0이면 자유, 1이면 무인도
	int count = 3; // 무인도에 갇힌 경우 주사위를 굴릴때마다 1씩 감소
	int distance = 0; // 50이 되면 탈출가능
	

	for (; ; ) {
		System.out.println("------------------------");
		System.out.println("1.주사위 굴리기 | 0.종료");
		System.out.println("------------------------");

		System.out.println("선택하세요:");
		int no = sc.nextInt();
		int first = random.nextInt(6) +1;
		int second = random.nextInt(6) +1;
		int total = first + second; 
		
		if (total == 7 && island == 0) {
			island =1 ;
			System.out.println("무인도에 걸렸습니다.");
			System.out.println("주사위를 다시 던져주세요.");
			for (; count >=2; count--) {
				System.out.println("------------------------");
				System.out.println("1.주사위 굴리기 | 0.종료");
				System.out.println("------------------------");

				System.out.println("선택하세요:");
				int no2 = sc.nextInt();
				int first1 = random.nextInt(6) +1;
				int second1 = random.nextInt(6) +1;
				if (first1 == second1) {
					count = 0;
					System.out.println("탈출하였습니다.");
				} else {
					count = 1; 
					System.out.println("탈출하였습니다.");
				}
			}



         /*무인도 걸렸습니다.
		 	주사위를 다시 던져주세요~

			무인도 3번 던지는 for문
			for ( ; count >=2 ; count--)
				같은게 나오면 탈출 식1
				다 던졌을 때 탈출 식2

				100 -= sum;


				distance <= 0 종료식
		 */
	

		} else if (total != 7) {


			System.out.println (total + "칸 전진하세요.");
			distance += total;
			System.out.println("지금위치는" + distance + "칸입니다.");
			
			if (distance >= 50) {
					System.out.println("도착하였습니다.");
					break;	
			}


		
					
				
				

			 
				
		} else if (no == 0) {
			System.out.println("종료하겠습니다.");
				break;
		}

	}
	/*

	 Random random = new Random();
	 for (int i=1; i<=10; i++) {
		 int first = random.nextInt(6) + 1;
		 int second = random.nextInt(6) + 1;

		 System.out.printf("(%d, %d)\n", first, second);
	 }
	 */
	 System.out.println("프로그램을 종료합니다.");
	} 
}