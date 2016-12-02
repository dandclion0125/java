import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		// 이름을 여러 개 저장할 수 있는 ArrayList만들기
		ArrayList<String> names = new ArrayList<String>();

		// ArrayList에 String객체 저장하기
		names.add("홍길동");
		names.add("김유신");
		names.add("이순신");
		names.add("강감찬");
		names.add("강감찬");
		names.add("강감찬");
		names.add("강감찬");
		names.add("강감찬");
		names.add("강감찬");
		names.add("강감찬");


		// ArrayList에 저장된 엘리먼트 전부 삭제하기
		//names.clear();
		
		// ArrayList에 저장된 엘리먼트 갯수 조회하기
		int size = names.size();
		System.out.println("저장된 갯수: "+size);
		
		// ArrayList에 저장된 엘리먼트 불러오기
		
		for (String username :names) {
			System.out.println(username);
		}
		
		/*
		for (int i=0;i<size;i++) {
			String username = names.get(i);
			System.out.println(username);
		}
		
		String name1 = names.get(0);
		String name2 = names.get(1);
		String name3 = names.get(2);
		String name4 = names.get(3);

		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
		*/
		
		// ArrayList에 엘리먼트가 저장되어 있는지 확인하기
		boolean empty = names.isEmpty();
		if (!empty) {
			System.out.println("엘리먼트가 존재하는 ArrayList다.");

		} else {
			System.out.println("비어있는 ArrayList다.");
		}

	}	
}