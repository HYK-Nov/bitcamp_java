import java.io.*;
import java.util.*;
public class Test10804 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        List<Integer> cardValue = new ArrayList<>();
        
        for (int i = 0; i < 20; i++) {
			cardValue.add(i + 1);
		}
        
        for (int i = 0; i < 10; i++) {
			int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			
			for (int j = 0; j < (arr[1] - arr[0] + 1)/2; j++) {
				Collections.swap(cardValue, arr[0] - 1 + j, arr[1] - 1 - j);
			}
		}
        
        bw.write(Arrays.toString(cardValue.stream().mapToInt(Integer::intValue).toArray()).replaceAll("[\\[,\\]]", ""));
        
        bw.flush();
        bw.close();
	}

}
