import java.io.*;
import java.util.*;
import java.lang.*;

public class ProductApp {
	
	// 상품정보 텍스트 한 줄을 전달받아서
	// 잘 잘라서 Product에 담아서 반환하는 메소드
	public static Product parseData(String text) {
		
		Product p = new Product();
		String[] arr = text.split(",");
		p.setName(arr[0]);
		p.setMaker(arr[1]);
		int price = Integer.parseInt(arr[2]);
		p.setPrice(price);
		double discount = Double.parseDouble(arr[3]);
		p.setDiscount(discount);
		return p;		
		
	}
	
	
	public static void main(String[] args) throws Exception {
	
		Product[] products = new Product[4];

		BufferedReader reader = new BufferedReader(new FileReader("product.txt"));
		
		for (int i=0 ; i<products.length ; i++) {
			products[i] = parseData(reader.readLine());
		}
		/*
		String text1 = reader.readLine();
		String text2 = reader.readLine();
		String text3 = reader.readLine();
		String text4 = reader.readLine();
		products[0] = parseData(text1);
		products[1] = parseData(text2);
		products[2] = parseData(text3);
		products[3] = parseData(text4);
		*/
		for (Product pro : products) {
			System.out.println("이  름: " + pro.getName());
			System.out.println("제조사: " + pro.getMaker());
			System.out.println("가  격: " + pro.getPrice());
			System.out.println("할인률: " + pro.getDiscount());
			
		}


		

	}	
}