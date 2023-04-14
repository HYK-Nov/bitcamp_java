import java.io.*;
import java.util.Arrays;

public class Test2525 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] timer = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int C = Integer.parseInt(br.readLine());
        
        timer[1] += C;
        timer[0] = (timer[0] + (timer[1] / 60)) % 24;
        timer[1] %= 60;
        
        bw.write(Arrays.toString(timer).replaceAll("[\\[,\\]]", ""));

        bw.flush();
        bw.close();
	}

}
