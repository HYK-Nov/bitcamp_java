import java.io.*;
import java.util.Arrays;

public class Test3009 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[][] arr = new int[3][];
		
		for (int i = 0; i < arr.length; i++) 
			arr[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		bw.flush();
		bw.close();
	}

}
