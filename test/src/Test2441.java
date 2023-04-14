import java.io.*;

public class Test2441 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		for (int i = N; i > 0; i--) {
			for (int k = 0; k < N - i; k++) {
				bw.write(" ");
			}
			for (int j = i; j > 0; j--) {
				bw.write("*");
			}
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}

}
