public class ScoreApp {

	public static void main(String[] args) {

		Score s = new Score();
		s.name = "�浿";
		s.kor = 100;
		s.eng = 20;
		s.math = 77;

		
		System.out.println("����" + s.total());
	
		System.out.println("���" + s.average());

	}
}