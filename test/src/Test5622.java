import java.io.*;
import java.util.Arrays;

public class Test5622 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] strArr = br.readLine().split("");
        String[][] test = {{"A","B","C"},{"D","E","F"},{"G","H","I"},{"J","K","L"},
        		{"M","N","O"},{"P","Q","R","S"},{"T","U","V"},{"W","X","Y","Z"}};
        int result = 0;
        
        for (int i = 0; i < strArr.length; i++) {
        	for (int j = 0; j < test.length; j++) {
				if (Arrays.asList(test[j]).contains(strArr[i])) {
					result += (j + 2) + 1;
					break;	
				}
			}
		}
        
        bw.write(Integer.toString(result));
        
        bw.flush();
        bw.close();
	}

}
