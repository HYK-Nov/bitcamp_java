package collection.list;

public class LottoWinSimulatorMain2 {

	public static void main(String[] args) {
		// �ζ� �ùķ����� Ŭ���� ����� ���ุ ��
		LottoWinSimulatorGoodCase2 ls = new LottoWinSimulatorGoodCase2();
		
		ls.tryWinLoop();
		
		System.out.println("�ݺ� Ƚ��: " + ls.getCount());
	}

}
