package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		List<Integer> lottery = new ArrayList<>();
		List<Integer> lotterySimulation = new ArrayList<>();
		long count = 0; int confirm = 0;
		Random r = new Random();
		
		while (lottery.size() < 6) {
			int i = r.nextInt(45)+1;
			if (!lottery.contains(i)) lottery.add(i);
		}
		System.out.println("*** 1�� ��ȣ ***");
		System.out.println(lottery);
		
		System.out.println("*** �ùķ��̼� ***");
		while(confirm < 6) {
			lotterySimulation.clear();
			confirm = 0; ++count;
			
			while (lotterySimulation.size() < 6) {
				int i = r.nextInt(45)+1;
				if (!lotterySimulation.contains(i)) lotterySimulation.add(i);
			}
			
			for(int i : lotterySimulation) {
				if(!lottery.contains(i)) break;
				else confirm++;
			}
		}
		System.out.println(lotterySimulation);
		System.out.println(count + " �� ���� ��÷�Ǿ����ϴ�.");
	}

}
