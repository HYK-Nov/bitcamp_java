import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Test3052 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] numberArray = new int[10];
		
		for (int i = 0; i < numberArray.length; i++) {
			numberArray[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 0; i < numberArray.length; i++) {
			numberArray[i] = numberArray[i] % 42;
		}
		
		numberArray = IntStream.of(numberArray).distinct().toArray();
		
		
		bw.write(Integer.toString(numberArray.length));
		
		bw.flush();
        bw.close();
	}

}
