import java.io.*;
import java.util.Arrays;

public class Test2490 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        for (int i = 0; i < 3; i++) {
			int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			
			switch (Arrays.stream(arr).filter(e->e == 1).toArray().length) {
			case 1:
				bw.write("C");
				break;
			case 2:
				bw.write("B");
				break;
			case 3:
				bw.write("A");
				break;
			case 4:
				bw.write("E");
				break;
			case 0:
				bw.write("D");
				break;
			}
			bw.newLine();
		}
        
        bw.flush();
        bw.close();

	}

}
