import java.io.*;
import java.util.*;

public class Test1076 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<String> resister = Arrays.asList("black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white");
        String[] color = new String[3];
        
        for (int i = 0; i < color.length; i++) color[i] = br.readLine();
        
        int value = resister.indexOf(color[0]) * 10 + resister.indexOf(color[1]);
        
        if (value == 0) {
        	bw.write(Integer.toString(value));
		}else {
			bw.write(Integer.toString(value) + String.valueOf(0).repeat(resister.indexOf(color[2])));
		}
        
        bw.flush();
        bw.close();
	}

}
