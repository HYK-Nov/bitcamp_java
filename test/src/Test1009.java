import java.io.*;
import java.util.Arrays;

public class Test1009 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
			int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			
			if (arr[1] % 5 == 0) {
				System.out.println("**" + (arr[1] / 5) + "**");
				if ((arr[1] / 5)%5 == 0) {
					
				}
			}
			System.out.println((int)Math.pow(arr[0], (arr[1] % 5)+1) % 10);
			
			/*
			 * if((int)Math.pow(arr[0], arr[1]%4) % 10 == 0) { bw.write(Integer.toString(10)
			 * + "\n"); }else { bw.write(Integer.toString((int)Math.pow(arr[0], arr[1]%4) %
			 * 10) + "\n"); }
			 */
		}
        
        bw.flush();
        bw.close();
	}

}
