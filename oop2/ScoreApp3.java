public class ScoreApp3 {

	public static void main(String[] args) {
		
		Score s = new Score("�浿", 90, 40, 80);
		
		System.out.println("����" + s.total());
	
		System.out.println("���" + s.average());

		Score s1 = new Score("����", 90, 70, 88);
		System.out.println("����" + s1.total());
	
		System.out.println("���" + s1.average());

	}
}