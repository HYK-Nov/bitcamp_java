import java.io.*;
import java.util.Arrays;

public class Test1173 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int count = 0;
		int time = 0;
		int X = arr[1];

		while (count != arr[0]) {
			if(arr[1] + arr[3] > arr[2]) {
				time = -1;
				break;
			}
			
			if (X + arr[3] <= arr[2]) {
				X += arr[3];
				count++;
			}else {
				if (X - arr[4] < arr[1]) { X = arr[1]; }
				else { X -= arr[4]; }
			}

			time++;
		}

		bw.write(Integer.toString(time));

		bw.flush();
		bw.close();
	}

}
