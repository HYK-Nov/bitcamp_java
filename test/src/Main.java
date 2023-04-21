import java.io.*;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] A = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] B = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int sumA = 0; int sumB = 0;
		boolean defeat = false;
		
		for (int i = 0; i < 9; i++) {
			if(((sumA += A[i]) > sumB) & (sumA <= (sumB += B[i]))) defeat = true;
			else if(sumA >= sumB) defeat = false;
		}

		if(defeat == true) bw.write("Yes");
		else bw.write("No");

		bw.flush();
		bw.close();
	}
}