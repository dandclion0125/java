public class CarApp {
	public static void main(String[] args) {
		
		// Car c�� �ǹ� : Car��� ���赵�� ����ؼ� ������ ��ü�� �ּҰ��� ��� ���� c�� �����.
		// CarŸ��(Ŭ���� Ÿ�� = ����Ÿ��)�� ���� c(��������)�� �����.
		// c �� �������� : �ּҰ��� ��� ������
		// new Car(); -> Car���赵�� �ε��ؼ� ��ü�� �����ϰ�, 
		// ������ ��ü�� ������ �� �ִ� �ּҰ��� ��ȯ�ϴ� �ڵ��.
		// Car c = new Car(); -> Car���赵�� �ε��ؼ� ��ü�� �����ϰ�, 
		// ������ ��ü�� ������ �� �ִ� �ּҰ��� CarŸ���� ���� c�� �����϶�.
		
		Car c = new Car();
		System.out.println(c);

		Car c2 = new Car();
		System.out.println(c2);
		// ������ ��ü�� �ʵ�, ������ ��ü�� �޼ҵ带 ����ϱ�
		
		System.out.println(c.speed);
		c.speed = 10;
		System.out.println(c.speed);
		c.speedUp();
		System.out.println(c.speed);
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();


		

	}
}