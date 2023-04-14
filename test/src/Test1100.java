import java.io.*;

public class Test1100 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[][] chess = new String[8][8];
        int count = 0;
        
        for (int i = 0; i < chess.length; i++) chess[i] = br.readLine().split("");
        
        for (int i = 0; i < chess.length; i++) {
        	if (i % 2 == 0) {
        		for (int j = 0; j < chess[i].length; j+=2) {
    				if(chess[i][j].equals("F")) count++;
    			}
			}else {
				for (int j = 1; j < chess[i].length; j+=2) {
					if(chess[i][j].equals("F")) count++;
				}
			}
		}
        
        bw.write(Integer.toString(count));
        
        bw.flush();
        bw.close();
	}

}
