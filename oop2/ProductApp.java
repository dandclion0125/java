public class ProductApp {
	public static void main(String[] args) {
	

		//��ǰ�� 5�� ��� �迭�� �����ϱ�
		Product[] goods = new Product[5]; 

		//�迭�� ��ǰ 5�� �����ϱ�
		goods[0] = new Product(34, "�ڷ�����", "LG", 1200000, 0.2, true);
		goods[1] = new Product(33, "�����", "�Ｚ", 2500000, 0.3, false);
		goods[2] = new Product(65, "û�ұ�", "LG", 300000, 0.15, true);
		goods[3] = new Product(12, "������", "����", 400000, 0.1, false);
		goods[4] = new Product(88, "������", "����", 2000000, 0.25, true);

		// �迭�� ����� ��ǰ�߿��� �Ǹ���(true)�� ��ǰ�� ǥ���ϱ�
		System.out.println("�ݡ��Ǹ����� ��ǰ�ݡ�");
		for (Product pro : goods ) {
			if (pro.isSell == true) {
				
				System.out.println(pro.name);
			}
		}

		//�迭�� ����� ��ǰ�߿��� ������ 1000000�� �̻��� ��ǰ�� ǥ���ϱ�
		System.out.println("�ݡ�1000000�� �̻��� ��ǰ�ݡ�");
		for (Product pro : goods ) {
			if (pro.priceDiscount() >= 1000000){
				System.out.println(pro.name);	
			}
			
		}

		// �迭�� ����� ��ǰ�� ��ü ������ ǥ���ϱ�
		System.out.println("�ݡ���ü ��ǰ�� ���ݡݡ�");
		for (Product pro : goods ) {
			System.out.println(pro.no + "  " + pro.name + "  " + pro.priceDiscount());
		}


		System.out.println("�ݡݻ�ǰ ����Ʈ�ݡ�");
		for (Product pro : goods ) {
			pro.info();
		}


		
	}

}