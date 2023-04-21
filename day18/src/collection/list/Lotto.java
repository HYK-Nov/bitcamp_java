package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		List<Integer> lottery = new ArrayList<>();
		List<Integer> lotterySimulation = new ArrayList<>();
		long count = 0;
		Random r = new Random();
		
		while (lottery.size() < 6) {
			int i = r.nextInt(45)+1;
			if (!lottery.contains(i)) lottery.add(i);
		}
		Collections.sort(lottery);
		
		System.out.println("*** 1�� ��ȣ ***");
		System.out.println(lottery);
		
		System.out.println("*** �ùķ��̼� ***");
		while(true) {
			lotterySimulation.clear(); ++count;
			
			while (lotterySimulation.size() < 6) {
				int i = r.nextInt(45)+1;
				if (!lotterySimulation.contains(i)) lotterySimulation.add(i);
			}
			
			if(lottery.containsAll(lotterySimulation)) break;
		}
		Collections.sort(lotterySimulation);
		
		System.out.println(lotterySimulation);
		System.err.println("����� �ζ� " + Long.toString(count).replaceAll("\\B(?=(\\d{3})+(?!\\d))", ",") + " ���� ������� ��÷�Ǿ����ϴ�.");
		System.out.println("������ ȯ���ϸ� " + Long.toString(count*1000).replaceAll("\\B(?=(\\d{3})+(?!\\d))", ",") + " �� �̳׿�!");
	}

}
