import java.io.*;

public class Test2445 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		
		for (int i = N; i > 0; i--) {
			for (int j = 0; j < N - i + 1; j++) {
				bw.write("*");
			}
			for (int k = 0; k < 2 * i - 2; k++) {
				bw.write(" ");
			}
			for (int j = 0; j < N - i + 1; j++) {
				bw.write("*");
			}
			bw.newLine();
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N - (i + 1); j++) {
				bw.write("*");
			}
			for (int k = 0; k < 2 * i + 2; k++) {
				bw.write(" ");
			}
			for (int j = 0; j < N - (i + 1); j++) {
				bw.write("*");
			}
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
	}

}
