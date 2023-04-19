import java.io.*;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		LocalDate date = LocalDate.now();
		
		bw.write(String.valueOf(date));
		
		bw.flush();
		bw.close();
	}
}