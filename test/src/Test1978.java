import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Test1978 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int count = 0;
		
		for (int i = 0; i < N; i++) {
			int arrNumber = arr[i];
			
			if (arr[i] > 1) {
				int[] decimalArr = IntStream.rangeClosed(1, arr[i]).filter(e->arrNumber%e == 0).toArray();
				if(decimalArr.length == 2) count++;
			}
		}
		
		bw.write(Integer.toString(count));
		
		bw.flush();
		bw.close();
	}

}
