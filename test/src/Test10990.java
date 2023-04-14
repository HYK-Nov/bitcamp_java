import java.io.*;

public class Test10990 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int count = 1;
        
        for (int i = 1; i <= N; i++) {
        	for (int j = 0; j < N-i; j++) bw.write(" ");
        	bw.write("*");
        	
        	if (i>1) {
				for (int j = 0; j < count; j++) bw.write(" ");
				
				count += 2;
				bw.write("*");
			}
        	
        	bw.newLine();
        }
        
        bw.flush();
        bw.close();
	}

}
