import java.io.*;

public class Test11653 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		while (N > 1) {
			for (int i = 2; i <= N; i++) {
				if (N % i == 0) {
					N = N / i;
					bw.write(Integer.toString(i) + "\n");
					break;
				}
			}
		}
		
		bw.flush();
		bw.close();
	}

}
