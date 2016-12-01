public class BookApp {
	public static void main(String[] args) {
	
		Book[] bookCart = new Book[5];
		bookCart[0] = new Book(3, "이것이 자바다","신용권", "한빛미디어", 35000, "2015-10-10");
		bookCart[1] = new Book(6, "이것이 자바까", "길동", "한빛", 25000, "2016-02-11");
		bookCart[2] = new Book(7, "에헴", "흥부", "제비집", 15000, "2010-01-01");
		bookCart[3] = new Book(11, "해리포터", "놀부", "호그와트", 20000, "2014-04-15");
		bookCart[4] = new Book(17, "백설공주", "마녀", "신데렐라", 23000, "1998-09-09");

		// 카트에 저장된 모든 책들의 제목을 표시하기

		for (Book book : bookCart) {
			System.out.println("책제목: " + book.getTitle());
		}

		// 카트에 저장된 책들의 가격 총합을 표시하기

		int total = 0;

			for (Book book: bookCart) {
				total += book.getPrice();
			}
			System.out.println("가격 총합: " + total);

		// 카트에 저장된 책중에서 가장 비싼 가격의 책 제목과 가격을 표시하기

		int max = 0;
		String maxtitle = null;
		for (Book book: bookCart) {
			if (book.getPrice()>max) {
				max = book.getPrice();
				maxtitle = book.getTitle();
			}
		
			
		}
		System.out.println("가장 비싼 책 제목: " + maxtitle + " || 가격: " + max);

	
	}
}