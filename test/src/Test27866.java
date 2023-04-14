import java.io.*;

public class Test27866 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = br.readLine().split("");
		int i = Integer.parseInt(br.readLine()) - 1;
		
		bw.write(str[i]);
		
		bw.flush();
		bw.close();
	}

}
