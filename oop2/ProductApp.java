public class ProductApp {
	public static void main(String[] args) {
	

		//상품을 5개 담는 배열을 정의하기
		Product[] goods = new Product[5]; 

		//배열에 상품 5개 저장하기
		goods[0] = new Product(34, "텔레비젼", "LG", 1200000, 0.2, true);
		goods[1] = new Product(33, "냉장고", "삼성", 2500000, 0.3, false);
		goods[2] = new Product(65, "청소기", "LG", 300000, 0.15, true);
		goods[3] = new Product(12, "전기밥솥", "쿠쿠", 400000, 0.1, false);
		goods[4] = new Product(88, "정수기", "웅진", 2000000, 0.25, true);

		// 배열에 저장된 상품중에서 판매중(true)인 상품만 표시하기
		System.out.println("◎◎판매중인 상품◎◎");
		for (Product pro : goods ) {
			if (pro.isSell == true) {
				
				System.out.println(pro.name);
			}
		}

		//배열에 저장된 상품중에서 가격이 1000000원 이상인 상품만 표시하기
		System.out.println("◎◎1000000원 이상의 상품◎◎");
		for (Product pro : goods ) {
			if (pro.priceDiscount() >= 1000000){
				System.out.println(pro.name);	
			}
			
		}

		// 배열에 저장된 상품의 전체 가격을 표시하기
		System.out.println("◎◎전체 상품의 가격◎◎");
		for (Product pro : goods ) {
			System.out.println(pro.no + "  " + pro.name + "  " + pro.priceDiscount());
		}


		System.out.println("◎◎상품 리스트◎◎");
		for (Product pro : goods ) {
			pro.info();
		}


		
	}

}