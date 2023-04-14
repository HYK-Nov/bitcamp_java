import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Test2501 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] measure = IntStream.rangeClosed(1, arr[0]).filter(e->arr[0]%e == 0).toArray();
		
		if (measure.length < arr[1]) bw.write(Integer.toString(0));
		else bw.write(Integer.toString(measure[arr[1] - 1]));
		
		bw.flush();
		bw.close();
	}

}
