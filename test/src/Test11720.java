import java.io.*;
import java.util.*;

public class Test11720 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		arr = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
		
		int result = Arrays.stream(arr).sum();
		
		bw.write(Integer.toString(result));
		
		bw.flush();
		bw.close();
	}

}
