public class Library {
	private Book[] db = new Book[100];
	private int position = 0;
	

	public void addBook(Book newbook) throws LibraryException {
		for (Book b : db) {
			if (b != null && b.getNo() == newbook.getNo()) {
				throw new LibraryException("������ å ��ȣ�� �����մϴ�.");
			}
			
		}
		db[position] = newbook;
		position++;
	}
	public void findBooksByNo(int no) throws LibraryException {
		// null�� �ƴѰ�� ���
		// ������ ���ܹ߻�

		boolean isExist = false;
		for (Book b : db) {
			if (b != null && b.getNo() == no) {
				isExist = true;
				System.out.println("--------�˻� ���--------");
				System.out.println(b.getNo());
				System.out.println(b.getName());
				System.out.println(b.getWriter());
				System.out.println(b.getPublisher());
				System.out.println(b.getPrice());
				System.out.println(b.getGenre());
			} 
		}
		if(!isExist){
			throw new LibraryException("�˻��� ��ȣ�� å�� �������� �ʽ��ϴ�.");
		}

		

	}
	public void findBooksByTitle(String title) throws LibraryException {
		boolean isExist = false;

		for (Book b : db) {
			if (b != null && b.getName() == title) {
				isExist = true;
				System.out.println("--------�˻� ���--------");
				System.out.println(b.getNo());
				System.out.println(b.getName());
				System.out.println(b.getWriter());
				System.out.println(b.getPublisher());
				System.out.println(b.getPrice());
				System.out.println(b.getGenre());
			} 
		}

		if(!isExist){
			throw new LibraryException("�˻��� ������ å�� �������� �ʽ��ϴ�.");
		}

	}
	public void findBoiksByGenre(String genre) throws LibraryException{
		boolean isExist = false;

		for (Book b : db) {
			if (b != null && b.getGenre() == genre) {
				isExist = true;
				System.out.println("--------�˻� ���--------");
				System.out.println(b.getNo());
				System.out.println(b.getName());
				System.out.println(b.getWriter());
				System.out.println(b.getPublisher());
				System.out.println(b.getPrice());
				System.out.println(b.getGenre());
			} 
		}

		if(!isExist){
			throw new LibraryException("�˻��� ������ å�� �������� �ʽ��ϴ�.");
		}

	}
}
