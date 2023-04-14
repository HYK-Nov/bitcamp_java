import java.io.*;
import java.util.Arrays;

public class Test1267 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int Y = 0;
        int M = 0;
        
        for(int i : arr) {
        	Y += (i / 30 + 1) * 10;
        	M += (i / 60 + 1) * 15;
        }
        
        if (Y > M) {
        	bw.write("M " + Integer.toString(M));
		}
        else if (Y < M) {
        	bw.write("Y " + Integer.toString(Y));
		}else {
			bw.write("Y M " + Integer.toString(Y));
		}
        
        bw.flush();
        bw.close();
	}

}
