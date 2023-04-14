import java.io.*;
import java.util.Arrays;

public class Test10814 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String[][] arr = new String[N][];
		
		for (int i = 0; i < arr.length; i++) arr[i] = br.readLine().split(" ");
		
		Arrays.sort(arr, (o1, o2)->Integer.valueOf(o1[0]).compareTo(Integer.valueOf(o2[0])));
		
		for(String[] str : arr) {
			bw.write(Arrays.toString(str).replaceAll("[\\[,\\]]", "") + "\n");
		}
		
		bw.flush();
		bw.close();
	}

}
