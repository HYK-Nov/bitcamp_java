import java.io.*;
import java.util.Arrays;

public class Test2587 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] arr = new int[5];
        
        for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
        
        Arrays.sort(arr);
        
        bw.write(Integer.toString(Arrays.stream(arr).sum()/arr.length));
        bw.newLine();
        bw.write(Integer.toString(arr[arr.length/2]));
        
        bw.flush();
        bw.close();
	}

}
