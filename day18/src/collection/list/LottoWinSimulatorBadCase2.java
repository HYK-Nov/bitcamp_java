package collection.list;

import java.util.*;

// 기능 분리 없이 구현에만 초점을 맞춘 케이스
public class LottoWinSimulatorBadCase2 {
	public static void main(String[] args) {
		// 1. 당첨 번호 6개 뽑기
		// 2. 추첨 번호 6개 추가로 뽑고 같은게 나올 때 까지 비교 -> 추첨 반복

		List<Integer> powerWinNumbers = new ArrayList<>();
		int random;

		while (powerWinNumbers.size() < 5) {
			random = (int)(Math.random()*69+1);
			if (!powerWinNumbers.contains(random)) powerWinNumbers.add(random);
		}
		Collections.sort(powerWinNumbers);
		
		random = (int)(Math.random()*27+1);
		powerWinNumbers.add(random);

		System.out.println("*** 1등 번호 ***");
		System.out.println(powerWinNumbers);

		List<Integer> powerTryNumbers = new ArrayList<>();
		long count = 0;

		System.out.println("*** 시뮬레이션 ***");
		while (!(powerTryNumbers.equals(powerWinNumbers) && 
			(powerWinNumbers.equals(powerTryNumbers)))) {
			powerTryNumbers.clear();
			++count;
			while (powerTryNumbers.size() < 5) {
				random = (int)(Math.random()*69+1);
				if (!powerTryNumbers.contains(random)) powerTryNumbers.add(random);
			}
		}
		random = (int)(Math.random()*26+1);
		powerTryNumbers.add(random);
		
		Collections.sort(powerTryNumbers);

		System.out.println(powerTryNumbers);
		System.out.println("당신은 로또 " + count + " 장을 사고나서야 당첨되었습니다.");
		System.out.println("돈으로 환산하면 " + (count*1000) + " 원 이네요!");
	}
}
