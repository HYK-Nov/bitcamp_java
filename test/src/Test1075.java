import java.io.*;

public class Test1075 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        long N = Long.parseLong(br.readLine());
        int F = Integer.parseInt(br.readLine());
		
        N -= N % 100;
        
        while (true) {
			if(N % F == 0) break;
			N++;
		}
        
        bw.write(String.valueOf(N).replaceAll(".(?=.{2,}$)", ""));
        
        bw.flush();
        bw.close();
	}

}
