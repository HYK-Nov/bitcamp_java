import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Test9506 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if (n == -1) break;
			
			int[] measure = IntStream.rangeClosed(1, n-1).filter(e->n%e == 0).toArray();
			
			if (Arrays.stream(measure).sum() == n) {
				bw.write(Integer.toString(n) + " = ");
				bw.write(Arrays.toString(measure).replaceAll("[\\[\\s\\]]", "").replaceAll("[,]", " + ") + "\n");
			}else bw.write(Integer.toString(n) + " is NOT perfect.\n");
		}
		
		bw.flush();
		bw.close();
	}

}
