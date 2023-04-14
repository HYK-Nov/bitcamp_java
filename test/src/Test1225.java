import java.io.*;
import java.util.Arrays;

public class Test1225 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] arr = br.readLine().split(" ");
        int[] A = Arrays.stream(arr[0].split("")).mapToInt(Integer::parseInt).toArray();
        int[] B = Arrays.stream(arr[1].split("")).mapToInt(Integer::parseInt).toArray();
        long count = 0;
        
        for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				count += A[i] * B[j];
			}
		}
        
        bw.write(Long.toString(count));
        
        bw.flush();
        bw.close();
	}

}
