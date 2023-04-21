package collection.list;

import java.util.*;

// 기능 분리 없이 구현에만 초점을 맞춘 케이스
public class LottoWinSimulatorBadCase {
	public static void main(String[] args) {
		// 1. 당첨 번호 6개 뽑기
		// 2. 추첨 번호 6개 추가로 뽑고 같은게 나올 때 까지 비교 -> 추첨 반복

		List<Integer> lottery = new ArrayList<>();
		Random r = new Random();

		while (lottery.size() < 6) {
			int i = r.nextInt(45) + 1;
			if (!lottery.contains(i))
				lottery.add(i);
		}
		Collections.sort(lottery);

		System.out.println("*** 1등 번호 ***");
		System.out.println(lottery);

		List<Integer> lotteryTryNumbers = new ArrayList<>();
		long count = 0;

		System.out.println("*** 시뮬레이션 ***");
		while (!lotteryTryNumbers.equals(lottery)) {
			++count;
			lotteryTryNumbers.clear();
			while (lotteryTryNumbers.size() < 6) {
				int i = r.nextInt(45) + 1;
				if (!lotteryTryNumbers.contains(i)) lotteryTryNumbers.add(i);
			}
		}
		
		Collections.sort(lotteryTryNumbers);

		System.out.println(lotteryTryNumbers);
		System.out.println("당신은 로또 " + count + " 장을 사고나서야 당첨되었습니다.");
		System.out.println("돈으로 환산하면 " + (count*1000) + " 원 이네요!");
	}
}
