public class ForDemo4 {
	public static void main(String[] args) {
		
		// 오류식 : 같은 블록 안에서 a를 두번 정의했기 때문에
		/*
		int a = 10;
		System.out.println(a);

		int a = 20;
		System.out.println(a);
		*/
		
		//다른 블록에서는 같은 이름으로 정의해도 성립한다.
		/*
		int x = 4;
		if (x%2 ==0) {
			int a = x*100;
		} else {
			int a = x*300;
		}
		*/
		// for문에 쓰인 a 값은 for문이 끝나면 없어진다. 
		// for문 밖에서는 연산이나 출력이 불가능
		for (int a=1; a<=10; a++) {

		}
		for (int a=1; a<20; a++) {
		}
		// 변수를 밖에서도 정의 가능하지만
		// 자바에서는 변수를 될 수 있는 한 좁게 사용하는걸 권장한다.

		
		// 초기화: 변수에 최초에 값을 넣는 것.
		// 아래 코드는 초기화 설정이 되지 않았기 때문에 성립하지 않는다.
		// 초기화 함으로서 쓰레기 값을 없앨 수 있다.
		// 그래서 예를 들어 int a = 0;처럼 값을 넣어준다.
		/*
		int a;

		System.out.println(a);
		*/
		/*
		int a ;
		int b = 30;
		if (b>10){
			a = 20;
		} else {
			a = 20;
		}
		System.out.println(a);
		*/

		for (int a=1; a<=5; a++) {
			System.out.println("실행");
			for (int b=1; b<=10; b++) {
				if ((a + b)%3 == 0)	{
				System.out.println("a의 값:" + a + "\tb의 값:" + b);
				}
				
			}
		}
	
		for (int a=1; a<=9; a++) {
			
			for (int b=2; b<=9; b++) {
				System.out.print(b + "*" + a +"=" + (a*b) + "\t");
			}

			System.out.println();
		}
	}

}