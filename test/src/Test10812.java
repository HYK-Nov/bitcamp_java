import java.io.*;
import java.util.*;

public class Test10812 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// N, M �޾ƿ���
		int[] inputArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		List<Integer> N = new ArrayList<>();
		
		for (int i = 1; i <= inputArr[0]; i++) N.add(i);
		
		for (int i = 0; i < inputArr[1]; i++) {
			// i, j, k �޾ƿ���
			int[] changeArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			// k���� j���� ���� �� ���� �� i�� �߰�
			List<Integer> addArr = new ArrayList<>(N.subList(changeArr[2]-1, changeArr[1]));
			
			N.removeAll(addArr);
			N.addAll(changeArr[0]-1, addArr);
		}
		
		bw.write(Arrays.toString(N.toArray()).replaceAll("[\\[,\\]]", ""));
		
		bw.flush();
		bw.close();
	}

}
