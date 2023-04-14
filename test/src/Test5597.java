import java.io.*;
import java.util.*;

public class Test5597 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] submitArr = new int[28];
		ArrayList<Integer> noSubmit = new ArrayList<>();

		for (int i = 1; i <= 30; i++) {
			noSubmit.add(i);
		}
		
		for (int i = 0; i < submitArr.length; i++) {
			submitArr[i] = Integer.parseInt(br.readLine());
			noSubmit.remove(Integer.valueOf(submitArr[i]));
		}
		
		int[] resultArr = noSubmit.stream().mapToInt(i->i).toArray();
		
		bw.write(Integer.toString(resultArr[0]));
		bw.newLine();
		bw.write(Integer.toString(resultArr[1]));

		bw.flush();
		bw.close();

	}
}
