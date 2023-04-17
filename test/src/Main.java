import java.io.*;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] N = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        int[] count = new int[10];
        
        for(int i : N) count[i]++;
        
        int maxValue = 0;
        
        for (int i = 0; i < count.length; i++) {
			if(i != 6 && i != 9)
				if(maxValue < count[i]) maxValue = count[i];
		}
        
        if(maxValue < count[6] || maxValue < count[9]) {
        	if(maxValue < (int)Math.ceil((double)(count[6] + count[9]) / 2)) {
        		bw.write(Integer.toString((int)Math.ceil((double)(count[6] + count[9]) / 2)));
        	}else bw.write(Integer.toString(maxValue));
        }else {
        	bw.write(Integer.toString(maxValue));
        }
                
        bw.flush();
        bw.close();
	}
}