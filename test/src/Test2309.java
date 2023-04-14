import java.io.*;
import java.util.Arrays;

public class Test2309 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] arr = new int[9];
        int[] answer = new int[7];
        int sum = 100;
        
        for (int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(br.readLine());
        
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length; i++) {
        	int target = Arrays.binarySearch(arr, Arrays.stream(arr).sum() - arr[i] - sum);
        	
			if (target > -1) {
				int y = i;
				
				answer = Arrays.stream(arr).filter(e->e != arr[y] && e != arr[target]).toArray();
				break;
			}
		}
        
        for (int i : answer){
        	bw.write(Integer.toString(i) + "\n");
        }
        
        bw.flush();
        bw.close();
	}

}
