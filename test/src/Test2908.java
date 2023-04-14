import java.io.*;
import java.util.*;

public class Test2908 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] strArr = br.readLine().split(" ");
		List<String> listA = Arrays.asList(strArr[0].split(""));
		List<String> listB = Arrays.asList(strArr[1].split(""));
		
		Collections.reverse(listA);
		Collections.reverse(listB);
		
		int A = Integer.parseInt(String.join("", listA));
		int B = Integer.parseInt(String.join("", listB));
		
		bw.write(Integer.toString(A > B ? A : B));
		
		bw.flush();
		bw.close();
	}

}
