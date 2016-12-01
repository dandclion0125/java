public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		int i = 118;
		
		if((i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)) { // (i<-128) ||<--또는 (i>127)과 같다.
			System.out.println("byte 타입으로 변환할 수 없습니다."); 
			System.out.println("값을 다시 확인해 주세요");
		}	else {
			byte b = (byte) i; // 그 외의 경우 i값을 byte타입으로 출력
			System.out.println(b);
		}
	}
}