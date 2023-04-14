import java.io.*;
import java.util.Arrays;

public class Test2798 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] cardArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int x = 0;
		
		outer : for (int i = 0; i < arr[0]-2; i++) {
			for (int j = i+1; j < arr[0]-1; j++) {
				for (int k = j+1; k < arr[0]; k++) {
					int y = cardArr[i] + cardArr[j] + cardArr[k];
					
					if(x == arr[1]) break outer;
					else if (y > x && y <= arr[1]) x = y;
				}
			}
		}
		
		bw.write(Integer.toString(x));
		
		bw.flush();
		bw.close();
	}

}
