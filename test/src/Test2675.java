import java.io.*;

public class Test2675 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			String[] testCase = br.readLine().split(" ");
			String[] P = testCase[1].split("");
			String str = "";
			
			for(String s : P) {
				str += s.repeat(Integer.parseInt(testCase[0]));
			}
			
//			for (int j = 0; j < P.length; j++) {
//				str += P[j].repeat(Integer.parseInt(testCase[0]));
//			}
			
			bw.write(str);
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
	}
}
