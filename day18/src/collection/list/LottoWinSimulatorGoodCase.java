package collection.list;

import java.util.*;

public class LottoWinSimulatorGoodCase {
	
	private int count; // �õ� Ƚ���� �����ϴ� �������
	
	// �޼���� ��� �ϳ��� ���
	// 1~45���� ���� �ϳ� �̴� �뵵�� �޼���
	public List<Integer> getLottoNumbers(){
		List<Integer> lottoNumbers = new ArrayList<>();

		while(lottoNumbers.size() < 6) {
			Integer getNumber = (int)(Math.random()*45+1);
			if (!lottoNumbers.contains(getNumber)) lottoNumbers.add(getNumber);
		}
		Collections.sort(lottoNumbers);
		
		return lottoNumbers;
	}
	
	// ��÷ �� ������ �� �ݺ��ϴ� �޼���
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
