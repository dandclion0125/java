import java.util.*;
import java.io.*;

class Ex59_Test_celebrateDay
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader reader = getReader();

		System.out.print("���� ������: 2012-08-01");
		String inputDate = reader.readLine();	// �Է��� ���
		
		String[] dateArr = inputDate.split("-"); //��,��,�� ����
		int year = Integer.parseInt(dateArr[0]); // �Է� �⵵
		int month = Integer.parseInt(dateArr[1]); // �Է� ��
		int day = Integer.parseInt(dateArr[2]); // �Է� ��

		Calendar today = Calendar.getInstance();	//����
		Calendar ca = Calendar.getInstance();		//�Է���

		//�Է��Ϸ� ����
		ca.set(year,month-1,day);

		// ����Ϸκ��� ���ñ���
		long span = today.getTime().getTime() - ca.getTime().getTime();
		System.out.printf("������ ���� ���� �� %d�� ° �Ǵ� ���Դϴ�.%n"
						,span/1000/60/60/24+1);//���� �� ����
		
		// ����Ϻ��� 1��.
		ca.add(Calendar.DATE, 99);	//  100��° ��
		System.out.printf(" 100�� : %tF%n",ca);
		ca.add(Calendar.DATE, 100);	//  200��° ��
		System.out.printf(" 200�� : %tF%n",ca);		
		ca.add(Calendar.DATE, 100);	//  300��° ��
		System.out.printf(" 300�� : %tF%n",ca);
		ca.add(Calendar.DATE, 200);	//  500��° ��
		System.out.printf(" 500�� : %tF%n",ca);
		ca.add(Calendar.DATE, 500);	// 1000��° ��
		System.out.printf("1000�� : %tF%n",ca);
	}//end main

	public static BufferedReader getReader() {
		BufferedReader reader = 
			new BufferedReader(new InputStreamReader(System.in));
		return reader;
	}
}