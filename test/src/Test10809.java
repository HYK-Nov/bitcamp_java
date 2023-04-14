import java.io.*;
import java.util.*;

public class Test10809 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		int[] position = new int[26];
		int a =(int)'a';
		
		for (int i = 0; i < position.length; i++) {
			position[i] = str.indexOf((char)a);
			a++;
		}
		
		bw.write(Arrays.toString(position).replaceAll("[\\[,\\]]", ""));
		
		bw.flush();
		bw.close();
	}
}
