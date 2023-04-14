import java.io.*;
import java.util.Arrays;

public class Test10989 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 카운팅 정렬
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[] result = new int[N];
		
		for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(br.readLine());
		
		int[] counting = new int[Arrays.stream(arr).max().getAsInt()+1];
		
		for (int i = 0; i < arr.length; i++) {
			counting[arr[i]]++;
		}
		
		for (int i = 1; i < counting.length; i++) {
			counting[i] += counting[i-1];
		}
		
		for (int i = arr.length-1; i >= 0; i--) {
			result[--counting[arr[i]]] = arr[i];
		}
		
		for(int i : result) bw.write(Integer.toString(i) + "\n");
		
		bw.flush();
		bw.close();
	}

}
