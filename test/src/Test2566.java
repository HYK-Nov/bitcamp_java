import java.io.*;
import java.util.Arrays;

public class Test2566 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[][] arr = new int[9][9];
        int[] maxValue = new int[9];
        
        for (int i = 0; i < arr.length; i++) {
			arr[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			maxValue[i] = Arrays.stream(arr[i]).max().getAsInt();
		}
        
        Arrays.sort(maxValue);
        
        outer: for (int j = 0; j < arr.length; j++) {
        	for (int k = 0; k < arr[0].length; k++) {
				if (arr[j][k] == maxValue[8]) {
					bw.write(maxValue[8] + "\n" + (j+1) + " " + (k+1));
					break outer;
				}
			}
		}
        
        bw.flush();
        bw.close();
	}

}
