import java.util.Scanner;
import java.util.Random;

public class Quizz5 {
	public static void main(String[] args) {
	 
	 // 1���� ������ �ֻ����� ������ 0���� �׸��α�
	 // �� �ֻ����� ���� 7�� �Ǹ� ���ε���
	 // ���ε� Ż���� ���ؼ� ���� ���� ������ �ȴ�.
	 // ���ε��� ���� ��� �ֻ����� 3�� ���ȴٸ� ���ε����� Ż��
	 // ���ε��� ������ ���� ��쿡�� �ֻ����� �ո�ŭ ĭ�� �̵�
	Scanner sc = new Scanner(System.in);
	Random random = new Random();

		boolean island = false; 
		int count = 3;
		int distance = 0;


		for (; ; ) {
			System.out.println("------------------------");
			System.out.println("1.�ֻ��� ������ | 0.����");
			System.out.println("------------------------");

			System.out.println("�����ϼ���:");
			int no = sc.nextInt();
		
			



			if (no ==1) {
				int first = random.nextInt(6) +1;
				int second = random.nextInt(6) +1;
				System.out.printf("(%d, %d)\n", first, second);
				
				if (!island) { // ���� �������� �ʴ� ���

					if (first + second == 7) { // �ֻ����� ���� 7�� ���°��
						island = true; // ���ε���
						
						count = 3;  // Ż����� 3ȸ ����
						System.out.println("���ε��� ������");
					} else {
						
						distance += first + second; // �̵��Ÿ� ����
						
					    System.out.println("�̵��Ÿ�" + distance + "ĭ");
						if (distance > 100) {
							System.out.println("������ ����");
							break;
						}
					}
				} else { // ���ε��� �����ִ� ���
					if (first == second) { // �ֻ����� ���� ���
						island = false; //���ε� Ż��
						System.out.println("���ε�Ż��");
					} else { // �ֻ����� �ٸ� ���
						count--;
						
						if (count == 0) {
							island = false;
							System.out.println("3ȸ�� ��� ���ε� Ż��");
						} else {
							System.out.println("Ż����� [" + count + "] ȸ ���ҽ��ϴ�.");
						}
						
					}
				}
			} else if (no==0) {
				break;
			}
        }
		System.out.println("�����մϴ�.");
	}
}			