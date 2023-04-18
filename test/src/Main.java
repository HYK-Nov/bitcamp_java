import java.io.*;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[2];
		int value = 1;
		
		for (int i = 0; i < N; i++) {
			value = 1;
			
			arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			
			for (int j = 2; j <= Arrays.stream(arr).min().getAsInt(); j++) {
				if(arr[0] % j == 0 && arr[1] % j == 0) {
					value *= j;
					arr[0] /= j;
					arr[1] /= j;
					j--;
				}
			}
			bw.write(Integer.toString(value * arr[0] * arr[1]) + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}