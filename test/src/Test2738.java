import java.io.*;
import java.util.Arrays;

public class Test2738 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] NM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] A = new int[NM[0]][NM[1]];
        int[][] B = new int[NM[0]][NM[1]];
        
        for (int i = 0; i < A.length; i++) {
			A[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
        
        for (int i = 0; i < B.length; i++) {
        	B[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
        
        for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B[i].length; j++) {
				B[i][j] += A[i][j];
			}
			bw.write(Arrays.toString(B[i]).replaceAll("[\\[,\\]]", "") + "\n");
		}
        
        bw.flush();
        bw.close();
	}

}
