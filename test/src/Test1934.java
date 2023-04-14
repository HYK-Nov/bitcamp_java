import java.io.*;
import java.util.*;

public class Test1934 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		int[][] arr = new int[T][2];
		int count = 0;
		
		for (int i = 0; i < T; i++) arr[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i][1] % arr[i][0] == 0) {
				bw.write(Integer.toString(arr[i][1]));
				break;
			}
			
			count = arr[i][1];
			
			while(!((count % arr[i][0] == 0) && (count % arr[i][1] == 0))) {
				count++;
			}
			bw.write(Integer.toString(count) + "\n");
		}
		
		bw.flush();
		bw.close();
	}

}
