import java.io.*;
import java.util.Arrays;

public class Test1152 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] strArr = br.readLine().split(" ");	
		int count = Arrays.stream(strArr).filter(e->e != "").toArray().length;

		bw.write(Integer.toString(count));
		
		bw.flush();
		bw.close();
	}

}
