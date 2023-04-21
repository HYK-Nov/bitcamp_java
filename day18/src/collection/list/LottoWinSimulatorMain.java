package collection.list;

import java.util.List;

public class LottoWinSimulatorMain {

	public static void main(String[] args) {
		// 로또 시뮬레이터 클래스 기능을 실행만 함
		LottoWinSimulatorGoodCase ls = new LottoWinSimulatorGoodCase();
		List<Integer> lottoWinNumbers = ls.getLottoNumbers();
		List<Integer> lottoGetNumbers = ls.getLottoNumbers();
		
		ls.tryWin(lottoWinNumbers, lottoGetNumbers);
		
		System.out.println("반복 횟수: " + ls.getCount());
	}

}
