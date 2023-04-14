import java.io.*;
import java.util.*;

public class Test1546 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int[] scoreArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        float avg = 0;
        
        int M = Arrays.stream(scoreArr).max().getAsInt();
        
        for (int i = 0; i < scoreArr.length; i++) {
				avg += (float)scoreArr[i]/(float)M*100;
		}
        
        bw.write(Float.toString(avg/N));
        
        bw.flush();
        bw.close();
	}
}
