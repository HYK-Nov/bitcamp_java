import java.io.*;
import java.util.Arrays;

public class Test1268 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int[][] student = new int[N][5];
        int[] count = new int[N];
        
        for (int i = 0; i < student.length; i++) {
			student[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			bw.write(Arrays.toString(student[i]) + "\n");
		}
        
        bw.flush();
        bw.close();
	}

}
