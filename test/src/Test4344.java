import java.io.*;
import java.util.Arrays;

public class Test4344 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int C = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < C; i++) {
			int[] studentArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int N = studentArr[0];
			
			studentArr = Arrays.stream(studentArr, 1, studentArr.length).toArray();
			
			int avg = (int)(Arrays.stream(studentArr).average().orElse(0));
			
			bw.write(String.format("%.3f", Math.round(Arrays.stream(studentArr).filter(e->e > avg).toArray().length / (double)N * 100000) / 1000.0) + "%\n");
		}
		
		bw.flush();
		bw.close();
	}

}
