public class ScoreApp {

	public static void main(String[] args) {

		Score s = new Score();
		s.name = "±æµ¿";
		s.kor = 100;
		s.eng = 20;
		s.math = 77;

		
		System.out.println("ÃÑÁ¡" + s.total());
	
		System.out.println("Æò±Õ" + s.average());

	}
}