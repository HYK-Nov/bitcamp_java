package collection.list;

import java.util.List;

public class LottoWinSimulatorMain {

	public static void main(String[] args) {
		// �ζ� �ùķ����� Ŭ���� ����� ���ุ ��
		LottoWinSimulatorGoodCase ls = new LottoWinSimulatorGoodCase();
		List<Integer> lottoWinNumbers = ls.getLottoNumbers();
		List<Integer> lottoGetNumbers = ls.getLottoNumbers();
		
		ls.tryWin(lottoWinNumbers, lottoGetNumbers);
		
		System.out.println("�ݺ� Ƚ��: " + ls.getCount());
	}

}
