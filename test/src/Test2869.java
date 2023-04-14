import java.io.*;
import java.util.Arrays;

public class Test2869 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int A = arr[0];
		int B = arr[1];
		int V = arr[2];
		int count = (int)Math.ceil((double)V/A);
		int meter = (A * count) - (B * count);
		
		while (true) {
			++count;
			meter += A;
			
			if (meter >= V) break;
			
			meter -= B;
		}
		
		bw.write(Integer.toString(count));

		bw.flush();
		bw.close();
	}

}
