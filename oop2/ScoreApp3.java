public class ScoreApp3 {

	public static void main(String[] args) {
		
		Score s = new Score("±æµ¿", 90, 40, 80);
		
		System.out.println("ÃÑÁ¡" + s.total());
	
		System.out.println("Æò±Õ" + s.average());

		Score s1 = new Score("°¨Âù", 90, 70, 88);
		System.out.println("ÃÑÁ¡" + s1.total());
	
		System.out.println("Æò±Õ" + s1.average());

	}
}