public class ForDemo4 {
	public static void main(String[] args) {
		
		// ������ : ���� ��� �ȿ��� a�� �ι� �����߱� ������
		/*
		int a = 10;
		System.out.println(a);

		int a = 20;
		System.out.println(a);
		*/
		
		//�ٸ� ��Ͽ����� ���� �̸����� �����ص� �����Ѵ�.
		/*
		int x = 4;
		if (x%2 ==0) {
			int a = x*100;
		} else {
			int a = x*300;
		}
		*/
		// for���� ���� a ���� for���� ������ ��������. 
		// for�� �ۿ����� �����̳� ����� �Ұ���
		for (int a=1; a<=10; a++) {

		}
		for (int a=1; a<20; a++) {
		}
		// ������ �ۿ����� ���� ����������
		// �ڹٿ����� ������ �� �� �ִ� �� ���� ����ϴ°� �����Ѵ�.

		
		// �ʱ�ȭ: ������ ���ʿ� ���� �ִ� ��.
		// �Ʒ� �ڵ�� �ʱ�ȭ ������ ���� �ʾұ� ������ �������� �ʴ´�.
		// �ʱ�ȭ �����μ� ������ ���� ���� �� �ִ�.
		// �׷��� ���� ��� int a = 0;ó�� ���� �־��ش�.
		/*
		int a;

		System.out.println(a);
		*/
		/*
		int a ;
		int b = 30;
		if (b>10){
			a = 20;
		} else {
			a = 20;
		}
		System.out.println(a);
		*/

		for (int a=1; a<=5; a++) {
			System.out.println("����");
			for (int b=1; b<=10; b++) {
				if ((a + b)%3 == 0)	{
				System.out.println("a�� ��:" + a + "\tb�� ��:" + b);
				}
				
			}
		}
	
		for (int a=1; a<=9; a++) {
			
			for (int b=2; b<=9; b++) {
				System.out.print(b + "*" + a +"=" + (a*b) + "\t");
			}

			System.out.println();
		}
	}

}