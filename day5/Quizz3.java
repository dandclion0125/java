import java.util.*;



public class Quizz3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		// ������ ���� 3���� ������ �迭
		
		int[] numbers = new int[3];
		
		int position = 0; // ���ڸ� �����Ҷ� ���� �ϳ��� ����

		for (; ; ) {
			int number = ran.nextInt(10);
			boolean isExist = false;
			for (int i=0;i<=position ; i++) {
				if (numbers[i] == number) {
					isExist = true;
				}
			}
			if (!isExist) { // isExist �� false�� ��� true�� �Ǿ� ���๮ ����
				numbers[position] = number;
				position++;
			}
			if (position == 3) { 
				break;
			}
			
		}
		System.out.println(Arrays.toString(numbers));
		
		
		// ����ڰ� �Է��� ���� ������ �迭
		
	


		
	

		
		
		
		

		//���� for������ �ؼ� numbers �� answer�� ��
		// �ڸ��� ������ ��Ʈ����ũ�� ������Ű�� �ڸ��� �ٸ��� ���ڰ� ������ ���� ������Ų��.
		
		for (int a=1; a<=10; a++) {
			int strike = 0;
			int ball = 0;
			int[] answer = new int[3];

			System.out.print("ù��° ����");
			answer[0] = sc.nextInt();
			System.out.print("�ι�° ����");
			answer[1] = sc.nextInt();
			System.out.print("����° ����");
			answer[2] = sc.nextInt();
		
			boolean isSuccess = false;
			/*
			for (int c=0; c<3;c++) {
				System.out.print("���ڸ� �Է��ϼ���: ");
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
			
			
			
			

			
			// �ۼ���ġ
			
			
			
			
			
			
			if (strike == 3) {
				isSuccess = true;
				break;
			}



		}

		if (isSuccess) {
			System.out.println("����");
		} else {
			System.out.println("��û��");
		}
		
		

		

       

	}
}