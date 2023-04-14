import java.io.*;
import java.util.Arrays;

public class Test1427 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long[] longArr = Arrays.stream(br.readLine().split("")).mapToLong(Long::parseLong).toArray();
		
		for(int i = longArr.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				long x;
				
				if (longArr[j] < longArr[j+1]) {
					x = longArr[j+1];
					longArr[j+1] = longArr[j];
					longArr[j] = x;
				}
			}
		}
		
		bw.write(Arrays.toString(longArr).replaceAll("[\\[,\\s\\]]", ""));
		
		bw.flush();
		bw.close();
	}

}
