public class Library {
	private Book[] db = new Book[100];
	private int position = 0;
	

	public void addBook(Book newbook) throws LibraryException {
		for (Book b : db) {
			if (b != null && b.getNo() == newbook.getNo()) {
				throw new LibraryException("동일한 책 번호가 존재합니다.");
			}
			
		}
		db[position] = newbook;
		position++;
	}
	public void findBooksByNo(int no) throws LibraryException {
		// null이 아닌경우 출력
		// 없으면 예외발생

		boolean isExist = false;
		for (Book b : db) {
			if (b != null && b.getNo() == no) {
				isExist = true;
				System.out.println("--------검색 결과--------");
				System.out.println(b.getNo());
				System.out.println(b.getName());
				System.out.println(b.getWriter());
				System.out.println(b.getPublisher());
				System.out.println(b.getPrice());
				System.out.println(b.getGenre());
			} 
		}
		if(!isExist){
			throw new LibraryException("검색한 번호의 책이 존재하지 않습니다.");
		}

		

	}
	public void findBooksByTitle(String title) throws LibraryException {
		boolean isExist = false;

		for (Book b : db) {
			if (b != null && b.getName() == title) {
				isExist = true;
				System.out.println("--------검색 결과--------");
				System.out.println(b.getNo());
				System.out.println(b.getName());
				System.out.println(b.getWriter());
				System.out.println(b.getPublisher());
				System.out.println(b.getPrice());
				System.out.println(b.getGenre());
			} 
		}

		if(!isExist){
			throw new LibraryException("검색한 제목의 책이 존재하지 않습니다.");
		}

	}
	public void findBoiksByGenre(String genre) throws LibraryException{
		boolean isExist = false;

		for (Book b : db) {
			if (b != null && b.getGenre() == genre) {
				isExist = true;
				System.out.println("--------검색 결과--------");
				System.out.println(b.getNo());
				System.out.println(b.getName());
				System.out.println(b.getWriter());
				System.out.println(b.getPublisher());
				System.out.println(b.getPrice());
				System.out.println(b.getGenre());
			} 
		}

		if(!isExist){
			throw new LibraryException("검색한 쟝르의 책이 존재하지 않습니다.");
		}

	}
}
