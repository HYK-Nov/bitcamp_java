package collection.list;

public class LottoWinSimulatorMain2 {

	public static void main(String[] args) {
		// 로또 시뮬레이터 클래스 기능을 실행만 함
		LottoWinSimulatorGoodCase2 ls = new LottoWinSimulatorGoodCase2();
		
		ls.tryWinLoop();
		
		System.out.println("반복 횟수: " + ls.getCount());
	}

}
