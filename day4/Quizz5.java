import java.util.Scanner;
import java.util.Random;

public class Quizz5 {
	public static void main(String[] args) {
	 
	 // 1번을 누르면 주사위를 굴리고 0번은 그만두기
	 // 두 주사위의 합이 7이 되면 무인도행
	 // 무인도 탈출을 위해서 같은 수가 나오면 된다.
	 // 무인도에 갇힌 경우 주사위를 3변 굴렸다면 무인도에서 탈출
	 // 무인도에 갇히지 않은 경우에는 주사위의 합만큼 칸을 이동
	Scanner sc = new Scanner(System.in);
	Random random = new Random();

		boolean island = false; 
		int count = 3;
		int distance = 0;


		for (; ; ) {
			System.out.println("------------------------");
			System.out.println("1.주사위 굴리기 | 0.종료");
			System.out.println("------------------------");

			System.out.println("선택하세요:");
			int no = sc.nextInt();
		
			



			if (no ==1) {
				int first = random.nextInt(6) +1;
				int second = random.nextInt(6) +1;
				System.out.printf("(%d, %d)\n", first, second);
				
				if (!island) { // 섬에 갇혀있지 않는 경우

					if (first + second == 7) { // 주사위의 합이 7이 나온경우
						island = true; // 무인도행
						
						count = 3;  // 탈출까지 3회 남음
						System.out.println("무인도로 가세요");
					} else {
						
						distance += first + second; // 이동거리 증가
						
					    System.out.println("이동거리" + distance + "칸");
						if (distance > 100) {
							System.out.println("목적지 도착");
							break;
						}
					}
				} else { // 무인도에 갇혀있는 경우
					if (first == second) { // 주사위가 같은 경우
						island = false; //무인도 탈출
						System.out.println("무인도탈출");
					} else { // 주사위가 다른 경우
						count--;
						
						if (count == 0) {
							island = false;
							System.out.println("3회를 쉬어서 무인도 탈출");
						} else {
							System.out.println("탈출까지 [" + count + "] 회 남았습니다.");
						}
						
					}
				}
			} else if (no==0) {
				break;
			}
        }
		System.out.println("종료합니다.");
	}
}			