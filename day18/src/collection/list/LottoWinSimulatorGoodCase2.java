package collection.list;

import java.util.*;

public class LottoWinSimulatorGoodCase2 {
	
	private long count; // 시도 횟수를 조사하는 멤버변수
	private List<Integer> powerWinNumbers = this.getPowerNumbers();
	private List<Integer> powerGetNumbers = this.getPowerNumbers();
	private Integer powerWinNumber = this.getPowerNumber();
	private Integer powerGetNumber = this.getPowerNumber();
	
	// 메서드는 기능 하나를 담당
	// 1~45까지 난수 하나 뽑는 용도인 메서드
	public List<Integer> getPowerNumbers(){
		List<Integer> powerNumbers = new ArrayList<>();

		while(powerNumbers.size() < 5) {
			Integer getNumber = (int)(Math.random()*69+1);
			if (!powerNumbers.contains(getNumber)) powerNumbers.add(getNumber);
		}
		Collections.sort(powerNumbers);
		
		return powerNumbers;
	}
	
	public Integer getPowerNumber() {
		return new Random().nextInt(1,27); // 익명객체
	}
	
	// 당첨 될 때까지 비교 반복하는 메서드
	public void tryWinLoop() {
		while (!(this.powerGetNumbers.equals(this.powerWinNumbers) && 
				this.powerGetNumber.equals(this.powerWinNumber))) {
			this.powerGetNumbers = this.getPowerNumbers();
			this.powerGetNumber = this.getPowerNumber();
			this.addCount();
		}
		System.out.println(this.powerWinNumbers + " " + this.powerWinNumber);
		System.out.println(this.powerGetNumbers + " " + this.powerGetNumber);
	}

	public long getCount() {
		return count;
	}
	
	public void addCount() {
		this.count++;
	}
}
