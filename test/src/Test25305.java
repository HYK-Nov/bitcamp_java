import java.io.*;
import java.util.Arrays;

public class Test25305 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] studentArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] scoreArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		Arrays.sort(scoreArr);
		
		bw.write(Integer.toString(scoreArr[scoreArr.length-studentArr[1]]));

		bw.flush();
		bw.close();
	}

}
