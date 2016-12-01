public class Product {

	// 속성
	// 상품번호, 제조사, 상품명, 가격, 할인율(실수), 판매여부(불린), 
    int no;
	String name;
	String maker;
	int price;
	double discount;
	boolean isSell;

	// 생성자
	public Product(){
	
	}
	//	기본생성자, 매개변수 있는 생성자
	public Product(int a, String b, String c, int d, double e, boolean f) {
		no = a;
		name = b;
		maker = c;
		price = d;
		discount = e;
		isSell = f;
	
	}
	// 기능
	// 할인된 가격(정수)을 반환하는 메소드
	// 상품정보를 모두 출력하는 메소드(할인가 포함)
	public int priceDiscount() {
	
		int price1 = (int)(price - (discount*price));
		return price1;
	}



	public void info() {
		
		System.out.println("☆☆☆☆☆☆ 제품 정보 ☆☆☆☆☆☆");
		System.out.println("제품 번호 : " + no);
		System.out.println("제품 이름 : " + name);
		System.out.println("제 조 사  : " + maker);
		System.out.println("가     격 : " + price);
		System.out.println("할 인 율  : " + discount*100 + "%");
		if (isSell) {
			System.out.println("판매 여부 : 예" );
		} else {
			System.out.println("판매 여부 : 아니오" );
		}
		System.out.println("할 인 가  : " + priceDiscount());
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");


	}
}