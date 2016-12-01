public class Demo4  {
	public static void main(String[] args) {
		// ºñÆ®¿¬»êÀÚ
		int a = 4;
		int b = 6;

		int result = a & b;
		System.out.println(result);
		result = a | b;
		System.out.println(result);
		result = a ^ b;
		System.out.println(result);
		result = ~a;
		System.out.println(result);

		int c = -4;

		result = c >> 2; // 2ÀÇ 2½ÂÀ» ³ª´«°ª
		System.out.println(result);
		result = c << 3; // 2ÀÇ 3½ÂÀ» °öÇÑ°ª
		System.out.println(result);
		result = c >>> 2; 
		System.out.println(result);
	}
}