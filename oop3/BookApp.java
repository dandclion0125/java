public class BookApp {
	public static void main(String[] args) {
	
		Book[] bookCart = new Book[5];
		bookCart[0] = new Book(3, "�̰��� �ڹٴ�","�ſ��", "�Ѻ��̵��", 35000, "2015-10-10");
		bookCart[1] = new Book(6, "�̰��� �ڹٱ�", "�浿", "�Ѻ�", 25000, "2016-02-11");
		bookCart[2] = new Book(7, "����", "���", "������", 15000, "2010-01-01");
		bookCart[3] = new Book(11, "�ظ�����", "���", "ȣ�׿�Ʈ", 20000, "2014-04-15");
		bookCart[4] = new Book(17, "�鼳����", "����", "�ŵ�����", 23000, "1998-09-09");

		// īƮ�� ����� ��� å���� ������ ǥ���ϱ�

		for (Book book : bookCart) {
			System.out.println("å����: " + book.getTitle());
		}

		// īƮ�� ����� å���� ���� ������ ǥ���ϱ�

		int total = 0;

			for (Book book: bookCart) {
				total += book.getPrice();
			}
			System.out.println("���� ����: " + total);

		// īƮ�� ����� å�߿��� ���� ��� ������ å ����� ������ ǥ���ϱ�

		int max = 0;
		String maxtitle = null;
		for (Book book: bookCart) {
			if (book.getPrice()>max) {
				max = book.getPrice();
				maxtitle = book.getTitle();
			}
		
			
		}
		System.out.println("���� ��� å ����: " + maxtitle + " || ����: " + max);

	
	}
}