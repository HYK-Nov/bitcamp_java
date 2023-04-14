import java.io.*;

public class Test10798 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[][] strArr = new String[5][];
        String result = "";
        
        for (int i = 0; i < strArr.length; i++) strArr[i] = br.readLine().split("");
        
        for (int i = 0; i < 15; i++) {
        	for (int j = 0; j < strArr.length; j++) {
        		if (strArr[j].length <= i) continue;
        		
        		result += strArr[j][i];
			}
		}
        
        bw.write(result);
        
        bw.flush();
        bw.close();
	}

}
