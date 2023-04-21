package collection.list;

import java.util.*;

public class LottoWinSimulatorGoodCase2 {
	
	private long count; // �õ� Ƚ���� �����ϴ� �������
	private List<Integer> powerWinNumbers = this.getPowerNumbers();
	private List<Integer> powerGetNumbers = this.getPowerNumbers();
	private Integer powerWinNumber = this.getPowerNumber();
	private Integer powerGetNumber = this.getPowerNumber();
	
	// �޼���� ��� �ϳ��� ���
	// 1~45���� ���� �ϳ� �̴� �뵵�� �޼���
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
		return new Random().nextInt(1,27); // �͸�ü
	}
	
	// ��÷ �� ������ �� �ݺ��ϴ� �޼���
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
