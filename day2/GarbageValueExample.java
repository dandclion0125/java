public class GarbageValueExample {
	public static void main (String[] args) {
		byte var1 = 125; //var1�� 125�� ����
		int var2 = 125; //var2�� 125�� ����
		for (int i=0; i<5 ; i++ ) { //i�� 0���� 4�� �ɶ�����
			var1++; //var1�� 1�� ������Ų��. 
			//byte������ 127�̶�� �ְ��� �Ѿ ���� �ּҰ��� -128���� �ٽ� ����ȴ�.
			var2++; //var2�� 1�� ������Ų��.
			System.out.println("var1:" + var1 + "\t" + "var2:" + var2);
		}
		
	}
}