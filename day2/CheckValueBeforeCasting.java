public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		int i = 118;
		
		if((i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)) { // (i<-128) ||<--�Ǵ� (i>127)�� ����.
			System.out.println("byte Ÿ������ ��ȯ�� �� �����ϴ�."); 
			System.out.println("���� �ٽ� Ȯ���� �ּ���");
		}	else {
			byte b = (byte) i; // �� ���� ��� i���� byteŸ������ ���
			System.out.println(b);
		}
	}
}