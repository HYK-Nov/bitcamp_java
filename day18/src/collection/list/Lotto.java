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
		
		System.out.println("*** 1등 번호 ***");
		System.out.println(lottery);
		
		System.out.println("*** 시뮬레이션 ***");
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
		System.err.println("당신은 로또 " + Long.toString(count).replaceAll("\\B(?=(\\d{3})+(?!\\d))", ",") + " 장을 사고나서야 당첨되었습니다.");
		System.out.println("돈으로 환산하면 " + Long.toString(count*1000).replaceAll("\\B(?=(\\d{3})+(?!\\d))", ",") + " 원 이네요!");
	}

}
