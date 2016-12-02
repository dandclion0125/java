public class Book{
	private int no;
	private String name;
	private String writer;
	private String publisher;
	private int price;
	private String genre;

	public Book() {}
	
	public Book(int no, String name, String writer, String publisher, int price, String genre) {
		this.no = no;
		this.name = name;
		this.writer = writer;
		this.publisher = publisher;
		this.price = price;
		this.genre = genre;
	}
	

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

}