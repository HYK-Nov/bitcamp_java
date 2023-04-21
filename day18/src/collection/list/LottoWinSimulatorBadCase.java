package collection.list;

import java.util.*;

// ��� �и� ���� �������� ������ ���� ���̽�
public class LottoWinSimulatorBadCase {
	public static void main(String[] args) {
		// 1. ��÷ ��ȣ 6�� �̱�
		// 2. ��÷ ��ȣ 6�� �߰��� �̰� ������ ���� �� ���� �� -> ��÷ �ݺ�

		List<Integer> lottery = new ArrayList<>();
		Random r = new Random();

		while (lottery.size() < 6) {
			int i = r.nextInt(45) + 1;
			if (!lottery.contains(i))
				lottery.add(i);
		}
		Collections.sort(lottery);

		System.out.println("*** 1�� ��ȣ ***");
		System.out.println(lottery);

		List<Integer> lotteryTryNumbers = new ArrayList<>();
		long count = 0;

		System.out.println("*** �ùķ��̼� ***");
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
		System.out.println("����� �ζ� " + count + " ���� ������� ��÷�Ǿ����ϴ�.");
		System.out.println("������ ȯ���ϸ� " + (count*1000) + " �� �̳׿�!");
	}
}
