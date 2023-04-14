import java.io.*;
import java.util.*;

public class Test10811 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<Integer> arr2 = new ArrayList<>();
        
        for (int i = 0; i < arr[0]; i++) {
			arr2.add(i + 1);
		}
        
        for (int k = 0; k < arr[1]; k++) {
			int[] basketArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int i = basketArr[0] - 1;
			int j = basketArr[1] - 1;
			
			while(i < j) {
				Collections.swap(arr2, i, j);
				i++; j--;
			}
		}
        
        bw.write(arr2.toString().replaceAll("[\\[,\\]]", ""));
        
        bw.flush();
        bw.close();
	}
}
