import java.io.*;

public class ExceptionDemo4 {
	public static void writing() { // L2Exception�� ���࿹���̱� ������ throws���� �ʾƵ� �ȴ�. 
									// ���࿹�ܴ� try/catch�� �������� �ʴ´�. 
		try {
			FileWriter writer = new FileWriter("sample.txt");
			String text = "12�� 3�� ������ ����� �ܼ�Ʈ";

			writer.write(text);
			writer.flush();
		} catch(FileNotFoundException e) {
			throw new L2Exception();
		} catch(IOException e) {
			throw new L2Exception();
		}
	}

	public static void reading() {
		try{
			// FileNotFoundException�� ������ ������
			BufferedReader reader = new BufferedReader(new FileReader("memo.txt"));
			// IOException�� ������ �޼ҵ�
			String text = reader.readLine();
			System.out.println("����: " + text);
		} catch(FileNotFoundException e) {
			// FileNotFoundException�� �߻��� ���� ����ä��, ��� HtaException�� �����ؼ� ������
			throw new L2Exception();
		} catch(IOException e) {
			throw new L2Exception();
		}

	}	
	public static void main (String[] srgs) {
		ExceptionDemo4.reading();
		ExceptionDemo4.writing();
		
	}
}