import java.io.*;
import java.util.Arrays;

public class Test1085 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] calcArr = {Math.abs(arr[0] - 0), Math.abs(arr[0] - arr[2]), Math.abs(arr[1] - 0), Math.abs(arr[1] - arr[3])};
		
		bw.write(Integer.toString(Arrays.stream(calcArr).min().getAsInt()));
		
		bw.flush();
		bw.close();
	}

}
