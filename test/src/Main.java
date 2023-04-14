import java.io.*;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] result = new int[arr.length];
        int[] counting = new int[arr.length+1];
        
        for (int i = 0; i < arr.length; i++) {
        	arr[i] = Integer.parseInt(br.readLine());
        	counting[arr[i]] += 1;
        }
        
        for (int i = counting.length-1; i > 0; i--) counting[i-1] += counting[i];
        
        System.out.println(Arrays.toString(counting));
        
//        for (int i = arr.length-1; i >= 0; i--) {
//			result[--counting[arr[i]]] = arr[i];
//		}
//        
//        System.out.println(Arrays.toString(result));
        
        bw.flush();
        bw.close();
	}
}