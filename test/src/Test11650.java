import java.io.*;
import java.util.Arrays;

public class Test11650 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][];
		
		for (int i = 0; i < arr.length; i++) arr[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		Arrays.sort(arr, (o1, o2)->o1[1]-o2[1]);
		Arrays.sort(arr, (o1, o2)->o1[0]-o2[0]);
		
		for(int[] i : arr) {
			bw.write(Arrays.toString(i).replaceAll("[\\[,\\]]", "") + "\n");
		}
		
		bw.flush();
		bw.close();
	}

}
