import java.io.*;
import java.util.Arrays;

public class Test2576 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] arr = new int[7];
        
        for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
        
        Arrays.sort(arr);
        arr = Arrays.stream(arr).filter(e->e % 2 == 1).toArray();
        
        int sum = Arrays.stream(arr).sum();
        
        if (sum == 0) {
        	bw.write(Integer.toString(-1));
        }
        else {
        	bw.write(Integer.toString(sum) + "\n" + Integer.toString(arr[0]));
        }
        
        bw.flush();
        bw.close();
	}

}
