import java.io.*;
import java.util.Arrays;

public class Test1159 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        
        for (int i = 0; i < N; i++) {
        	arr[i] = br.readLine().replaceAll("(?<=[a-zA-Z]).+", "");
        }
        
        Arrays.sort(arr);
        
        String[] distc = Arrays.stream(arr).distinct().toArray(String[]::new);
        String result = "";
        
        for (int i = 0; i < distc.length; i++) {
        	int x = i;
			if(Arrays.stream(arr).filter(e->e.equals(distc[x])).toArray().length >= 5) {
				result += distc[i];
			}
		}
        
        if(result.equals("")) result = "PREDAJA";
        
        bw.write(result);
        
        bw.flush();
        bw.close();
	}

}
