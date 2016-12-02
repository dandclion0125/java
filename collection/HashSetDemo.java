import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		// 메뉴이름을 저장하는 HashSet객체 만들기

		HashSet<String> menuset = new HashSet<String>();

		boolean r = false;
		r = menuset.add("청국장"); // 입력되었는지 boolean값으로 확인
		System.out.println("청국장--->" + r); // 청국장--->true 출력
		menuset.add("된장찌개");
		menuset.add("김치찌개");
		menuset.add("두부조림");
		menuset.add("한우육회");
		menuset.add("황태찌개");
		menuset.add("제육쌈밥");
		menuset.add("제육쌈밥");
		menuset.add("제육쌈밥");
		r = menuset.add("제육쌈밥");
		System.out.println("제육쌈밥--->" + r); // 제육쌈밥--->false 출력

		System.out.println("저장된 갯수: " + menuset.size()); // 7 출력 --> 중복된 엘리먼트는 제외

		for(String me:menuset) { // 인헨스드for문으로 엘리머트 출력
			System.out.println(me);
			/*
			--------- 실행 ----------	
			한우육회
			청국장
			황태찌개
			제육쌈밥
			두부조림
			김치찌개
			된장찌개
			
			로 출력 ---> 입력순서대로 출력X

			*/
		}

	}
}