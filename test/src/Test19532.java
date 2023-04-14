import java.io.*;
import java.util.Arrays;

public class Test19532 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int x = 1;
		int y = 1;
		
		while(true) {
			if (arr[0] * x + arr[1] * y == arr[2] && arr[0] * x + arr[1] * y == arr[2]) 
		}
		
		bw.flush();
		bw.close();
	}

}
