package kr.co.jhta;

import kr.co.l2.Employee;	//import�ǹ������ �ΰ����� �ִ�.
//import kr.co.l2.* //�� ���� ������ Ŭ������ �̸��� ��Ȯ�� ������ �ִ� ���� ����.
import kr.co.l2.sub.Family;					// *�δ� ������Ű�� ������ �������� ���Ѵ�. �� ������
					// Ŭ������ �����ü� �ִ�.

public class Demo {
	public static void main(String[] args) {
		System.out.println("��Ű�� ���� ���ø����̼�");

		Person p = new Person();
		p.setName("ȫ�浿");
		System.out.println(p);
		System.out.println(p.getName());

		Employee e = new Employee();	// ���� ��Ű�� �ȿ� ������� �ʱ� ������
		System.out.println(e);		// ���� �߻�

		//import�� �����ϸ� ������ ����

		Family f = new Family();
		System.out.println(f);

	}	

}