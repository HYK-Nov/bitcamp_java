import java.io.*;
import java.util.Arrays;

public class Test2720 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
			int C = Integer.parseInt(br.readLine());
			int[] chgArr = new int[4];
			
			while(C > 0) {
				if (C / 25 > 0) {
					chgArr[0] += C / 25;
					C %= 25;
				}else if(C / 10 > 0) {
					chgArr[1] += C / 10;
					C %= 10;
				}else if (C / 5 > 0) {
					chgArr[2] += C / 5;
					C %= 5;
				}else {
					chgArr[3] += C / 1;
					break;
				}
				
			}
			bw.write(Arrays.toString(chgArr).replaceAll("[\\[,\\]]", "") + "\n");
		}
        
        bw.flush();
        bw.close();
	}

}
