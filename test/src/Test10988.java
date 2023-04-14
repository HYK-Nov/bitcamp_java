import java.io.*;

public class Test10988 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] strArr = br.readLine().toLowerCase().split("");
		
		int result = 1;
		
		for (int i = 0; i < strArr.length/2; i++) {
			if (!strArr[i].equals(strArr[strArr.length - (1 + i)])) {
				result = 0;
				break;
			}
		}
		
		bw.write(Integer.toString(result));
		
		bw.flush();
		bw.close();
	}

}
