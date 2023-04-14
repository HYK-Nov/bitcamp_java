import java.io.*;
import java.util.Arrays;

public class Test5086 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			
			if (arr[0] == 0 && arr[1] == 0) break;
			
			if (arr[0] % arr[1] == 0 || arr[1] % arr[0] ==0) {
				if (arr[0] > arr[1]) bw.write("multiple");
				else bw.write("factor");
			}else bw.write("neither");

			bw.newLine();
		}

		bw.flush();
		bw.close();
	}

}
