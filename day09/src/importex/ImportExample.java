package importex;
/*
 * ���� ������Ʈ ���� �ڵ峢���� Ȥ�� �ڹٿ��� �⺻���� �����ϴ� Ŭ����������
 * ������ �����ٰ� ����� �� ����
 * �ٸ� �ٸ� ��Ű���� �ִ� Ŭ������ ����Ϸ��� �ݵ�� package ����� �Ʒ�(1������ �Ʒ�)
 * import ������ ���� �����ϰ� ���� Ŭ������ ���(��Ű����� Ŭ������)�� ����� ��
 */

import fruit.Pear;
import fruit.WaterMelon;
import hello.bye.Bye;
import hello.hi.Hi;

public class ImportExample {

	public static void main(String[] args) {
		WaterMelon waterMelon = new WaterMelon();
		Pear pear = new Pear();
		Hi hi = new Hi();
		Bye bye = new Bye();
		
		// ���� ��Ű���� ��� import ���� �ڵ� Ȱ�� ����
		Test test = new Test();
	}

}
