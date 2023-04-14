import java.io.*;

public class Test2522 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int N = Integer.parseInt(br.readLine());
        
        for (int i = N-1; i >= 0; i--) {
        	for (int j = N; j > N-i; j--) bw.write(" ");
			for (int j = 0; j < N-i; j++) bw.write("*");
			bw.newLine();
		}
        
        for (int i = N-1; i > 0; i--) {
        	for (int j = 0; j < N-i; j++) bw.write(" ");
        	for (int j = N; j > N-i; j--) bw.write("*");
        	bw.newLine();
		}
        
        bw.flush();
        bw.close();
	}

}
