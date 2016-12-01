import java.util.*;

public class Quizz2 {
	public static void main(String[] args) {
		// 3자리의 정수를 입력받아서
		// 100의 자리 숫자
		// 10의 자리 숫자
		// 1의 자리 숫자를 각각 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		int number = sc.nextInt();

		int hundred = (int) number/100;
		int ten = (int) (number - 100*hundred)/10;
		int one = number - 100*hundred - 10*ten;

		System.out.println("100의 자리숫자: " + hundred);
		System.out.println("10의 자리숫자: " + ten);
		System.out.println("1의 자리숫자: " + one);


	}
}