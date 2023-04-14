import java.io.*;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class Test2581 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> decimalList = new ArrayList<>(); 
		
		for (int i = M; i <= N; i++) {
			int decimalNumber = i;
			int[] decimalArr = IntStream.rangeClosed(1, decimalNumber).filter(e->decimalNumber%e == 0).toArray();
			
			if(decimalArr.length == 2) decimalList.add(decimalNumber);
		}
		
		if (decimalList.toArray().length != 0) {
			bw.write(Integer.toString(decimalList.stream().mapToInt(Integer::intValue).sum()) + "\n");
			bw.write(Integer.toString(decimalList.get(0)));
		}
		else bw.write(Integer.toString(-1));
		
		bw.flush();
		bw.close();
	}

}
