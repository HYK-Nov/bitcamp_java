import java.io.*;
import java.util.Arrays;

public class Test1037 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int count = 1;
        
        Arrays.sort(arr);
        
        outer: while (true) {
			for (int i = 0; i < arr.length; i++) {
				if (Arrays.binarySearch(arr, count / arr[i]) < 0) break;
				if (count % arr[i] == 0 && i == arr.length-1) break outer;
			}
			count++;
		}
        
        bw.write(Integer.toString(count));
        
        bw.flush();
        bw.close();
	}

}
