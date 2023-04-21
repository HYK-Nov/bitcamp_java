package collection.list;

import java.util.*;

// ��� �и� ���� �������� ������ ���� ���̽�
public class LottoWinSimulatorBadCase2 {
	public static void main(String[] args) {
		// 1. ��÷ ��ȣ 6�� �̱�
		// 2. ��÷ ��ȣ 6�� �߰��� �̰� ������ ���� �� ���� �� -> ��÷ �ݺ�

		List<Integer> powerWinNumbers = new ArrayList<>();
		int random;

		while (powerWinNumbers.size() < 5) {
			random = (int)(Math.random()*69+1);
			if (!powerWinNumbers.contains(random)) powerWinNumbers.add(random);
		}
		Collections.sort(powerWinNumbers);
		
		random = (int)(Math.random()*27+1);
		powerWinNumbers.add(random);

		System.out.println("*** 1�� ��ȣ ***");
		System.out.println(powerWinNumbers);

		List<Integer> powerTryNumbers = new ArrayList<>();
		long count = 0;

		System.out.println("*** �ùķ��̼� ***");
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
		System.out.println("����� �ζ� " + count + " ���� ������� ��÷�Ǿ����ϴ�.");
		System.out.println("������ ȯ���ϸ� " + (count*1000) + " �� �̳׿�!");
	}
}
