package collection.list;

import java.util.*;

public class LottoWinSimulatorGoodCase {
	
	private int count; // 시도 횟수를 조사하는 멤버변수
	
	// 메서드는 기능 하나를 담당
	// 1~45까지 난수 하나 뽑는 용도인 메서드
	public List<Integer> getLottoNumbers(){
		List<Integer> lottoNumbers = new ArrayList<>();

		while(lottoNumbers.size() < 6) {
			Integer getNumber = (int)(Math.random()*45+1);
			if (!lottoNumbers.contains(getNumber)) lottoNumbers.add(getNumber);
		}
		Collections.sort(lottoNumbers);
		
		return lottoNumbers;
	}
	
	// 당첨 될 때까지 비교 반복하는 메서드
	public void tryWin(List<Integer> winNumbers, List<Integer> getNumbers) {
		while (!getNumbers.equals(winNumbers)) {
			getNumbers = this.getLottoNumbers();
			this.addCount();
		}
		System.out.println(winNumbers);
		System.out.println(getNumbers);
	}

	public int getCount() {
		return count;
	}
	
	public void addCount() {
		this.count++;
	}
}
