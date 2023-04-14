import java.io.*;
import java.util.*;

public class Test1181 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        String[] arrRead = new String[N];
        
        for (int i = 0; i < N; i++) arrRead[i] = br.readLine();
        
        String[] resultArr = Arrays.stream(arrRead).distinct().toArray(String[]::new);
        
        Arrays.sort(resultArr);
        Arrays.sort(resultArr, Comparator.comparing(String::length));
        
        bw.write(Arrays.toString(resultArr));
        
        for(String str : resultArr) {
        	bw.write(str + "\n");
        }
        
        bw.flush();
        bw.close();
	}

}
