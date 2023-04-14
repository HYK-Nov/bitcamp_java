import java.io.*;
import java.util.Arrays;

public class Test2752 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		Arrays.sort(arr);
		
		bw.write(Arrays.toString(arr).replaceAll("[\\[,\\]]", ""));
		
		bw.flush();
		bw.close();
	}

}
