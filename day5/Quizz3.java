import java.util.*;



public class Quizz3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		// 임의의 숫자 3개를 저장할 배열
		
		int[] numbers = new int[3];
		
		int position = 0; // 숫자를 대입할때 마다 하나씩 증가

		for (; ; ) {
			int number = ran.nextInt(10);
			boolean isExist = false;
			for (int i=0;i<=position ; i++) {
				if (numbers[i] == number) {
					isExist = true;
				}
			}
			if (!isExist) { // isExist 가 false일 경우 true가 되어 실행문 실행
				numbers[position] = number;
				position++;
			}
			if (position == 3) { 
				break;
			}
			
		}
		System.out.println(Arrays.toString(numbers));
		
		
		// 사용자가 입력한 답을 저장할 배열
		
	


		
	

		
		
		
		

		//이중 for문으로 해서 numbers 와 answer를 비교
		// 자리가 같으면 스트라이크를 증가시키고 자리는 다르고 숫자가 같으면 볼을 증가시킨다.
		
		for (int a=1; a<=10; a++) {
			int strike = 0;
			int ball = 0;
			int[] answer = new int[3];

			System.out.print("첫번째 숫자");
			answer[0] = sc.nextInt();
			System.out.print("두번째 숫자");
			answer[1] = sc.nextInt();
			System.out.print("세번째 숫자");
			answer[2] = sc.nextInt();
		
			boolean isSuccess = false;
			/*
			for (int c=0; c<3;c++) {
				System.out.print("숫자를 입력하세요: ");
				int answerNumber = sc.nextInt();
				answer[c] = answerNumber;
				*/
		
				
			for (int a=0; a<=2; a++) {
				for (int b=0; b<3;b++ ) {
					if (numbers[a] == numbers[b]) {
						if (a == b) {
							strike++;
						} else 	{
							ball++;
						}

					}


				}
				/*
				if (numbers[i] == answer[i]) {
					strike += 1;
				} else if (numbers[i] == ~answer[i]  ) {
					ball += 1;
				} else
					System.out.println("no Strike no ball");
				}*/
					
			}
			System.out.println(strike + "strike" + ball + "ball");
				
		}
			
			
			
			

			
			// 작성위치
			
			
			
			
			
			
			if (strike == 3) {
				isSuccess = true;
				break;
			}



		}

		if (isSuccess) {
			System.out.println("성공");
		} else {
			System.out.println("멍청이");
		}
		
		

		

       

	}
}