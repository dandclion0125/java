import java.util.Scanner;
import java.util.Random;

public class Quizz4 {
	public static void main(String[] args) {
	 
	 // 1���� ������ �ֻ����� ������ 0���� �׸��α�
	 // �� �ֻ����� ���� 7�� �Ǹ� ���ε���
	 // ���ε� Ż���� ���ؼ� ���� ���� ������ �ȴ�.
	 // ���ε��� ���� ��� �ֻ����� 3�� ���ȴٸ� ���ε����� Ż��
	 // ���ε��� ������ ���� ��쿡�� �ֻ����� �ո�ŭ ĭ�� �̵�
	Scanner sc = new Scanner(System.in);
	Random random = new Random();

	int island = 0; //0�̸� ����, 1�̸� ���ε�
	int count = 3; // ���ε��� ���� ��� �ֻ����� ���������� 1�� ����
	int distance = 0; // 50�� �Ǹ� Ż�Ⱑ��
	

	for (; ; ) {
		System.out.println("------------------------");
		System.out.println("1.�ֻ��� ������ | 0.����");
		System.out.println("------------------------");

		System.out.println("�����ϼ���:");
		int no = sc.nextInt();
		int first = random.nextInt(6) +1;
		int second = random.nextInt(6) +1;
		int total = first + second; 
		
		if (total == 7 && island == 0) {
			island =1 ;
			System.out.println("���ε��� �ɷȽ��ϴ�.");
			System.out.println("�ֻ����� �ٽ� �����ּ���.");
			for (; count >=2; count--) {
				System.out.println("------------------------");
				System.out.println("1.�ֻ��� ������ | 0.����");
				System.out.println("------------------------");

				System.out.println("�����ϼ���:");
				int no2 = sc.nextInt();
				int first1 = random.nextInt(6) +1;
				int second1 = random.nextInt(6) +1;
				if (first1 == second1) {
					count = 0;
					System.out.println("Ż���Ͽ����ϴ�.");
				} else {
					count = 1; 
					System.out.println("Ż���Ͽ����ϴ�.");
				}
			}



         /*���ε� �ɷȽ��ϴ�.
		 	�ֻ����� �ٽ� �����ּ���~

			���ε� 3�� ������ for��
			for ( ; count >=2 ; count--)
				������ ������ Ż�� ��1
				�� ������ �� Ż�� ��2

				100 -= sum;


				distance <= 0 �����
		 */
	

		} else if (total != 7) {


			System.out.println (total + "ĭ �����ϼ���.");
			distance += total;
			System.out.println("������ġ��" + distance + "ĭ�Դϴ�.");
			
			if (distance >= 50) {
					System.out.println("�����Ͽ����ϴ�.");
					break;	
			}


		
					
				
				

			 
				
		} else if (no == 0) {
			System.out.println("�����ϰڽ��ϴ�.");
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
	 System.out.println("���α׷��� �����մϴ�.");
	} 
}