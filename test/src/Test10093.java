import java.io.*;
import java.util.*;

public class Test10093 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        long[] inputArr = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        List<Long> numArr = new ArrayList<>();
        
        Arrays.sort(inputArr);
        
        for (long i = inputArr[0] + 1; i < inputArr[1]; i++) {
			numArr.add(i);
		}
        
        long[] resultArr = numArr.stream().mapToLong(Long::longValue).toArray();
        
        bw.write(resultArr.length + "\n" + Arrays.toString(resultArr).replaceAll("[\\[,\\]]", ""));
        
        bw.flush();
        bw.close();
	}

}
