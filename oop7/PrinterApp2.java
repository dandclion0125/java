public class PrinterApp2 {
	public static void main(String[] args) {
		
		Printer p1 = new Printer();
		Printer p2 = new ColorPrinter();
		Printer p3 = new PhotoPrinter();
		
		/*
		�Ʒ��� ���๮�� ��� print(String text)�� ȣ���Ѵ�.
		������, �������� ���� �ٸ��� �����ȴ�.

		print(String text)�� ����������, 
		������ ������ ��ü�� Printer�� print(String text) �޼ҵ带
		�������� �޼ҵ尡 �����ϸ�, Printer�� print(String text) �޼ҵ� ���
		������ �� �� �޼ҵ尡 ����ȴ�.

		����, print(String text)��� �ϰ��� �̸�(����)����
		(������ �� ��ü�� �������� �ʰ� �ִ���...)
		���� ������ ��ü�� ������ �� ����� �����ų �� �ִ�. 
		*/
		p1.print("���� ����...");
		p2.print("���� ��Ȳ...");
		p3.print("���� ����...");

		/*
		ColorPrinter p4 = (ColorPrinter) p2; //p2�� ����Ŭ������ �����Ͽ� p4�� ����
												// ���ο� ��ü�� �����Ǵ� ���� �ƴ϶� �̵���...
		p4.chargeInk();
		*/
	}
}