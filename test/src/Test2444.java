import java.io.*;

public class Test2444 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N - (i + 1); j++) {
				bw.write(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				bw.write("*");
			}
			bw.newLine();
		}
		
		for (int i = N - 1; i > 0; i--) {
			for (int j = 0; j < N - i; j++) {
				bw.write(" ");
			}
			for (int k = 0; k < 2 * i - 1; k++) {
				bw.write("*");
			}
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
	}

}
