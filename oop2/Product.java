public class Product {

	// �Ӽ�
	// ��ǰ��ȣ, ������, ��ǰ��, ����, ������(�Ǽ�), �Ǹſ���(�Ҹ�), 
    int no;
	String name;
	String maker;
	int price;
	double discount;
	boolean isSell;

	// ������
	public Product(){
	
	}
	//	�⺻������, �Ű����� �ִ� ������
	public Product(int a, String b, String c, int d, double e, boolean f) {
		no = a;
		name = b;
		maker = c;
		price = d;
		discount = e;
		isSell = f;
	
	}
	// ���
	// ���ε� ����(����)�� ��ȯ�ϴ� �޼ҵ�
	// ��ǰ������ ��� ����ϴ� �޼ҵ�(���ΰ� ����)
	public int priceDiscount() {
	
		int price1 = (int)(price - (discount*price));
		return price1;
	}



	public void info() {
		
		System.out.println("�١١١١١� ��ǰ ���� �١١١١١�");
		System.out.println("��ǰ ��ȣ : " + no);
		System.out.println("��ǰ �̸� : " + name);
		System.out.println("�� �� ��  : " + maker);
		System.out.println("��     �� : " + price);
		System.out.println("�� �� ��  : " + discount*100 + "%");
		if (isSell) {
			System.out.println("�Ǹ� ���� : ��" );
		} else {
			System.out.println("�Ǹ� ���� : �ƴϿ�" );
		}
		System.out.println("�� �� ��  : " + priceDiscount());
		System.out.println("�١١١١١١١١١١١١١١١١١�");


	}
}