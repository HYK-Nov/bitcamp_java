import java.io.*;
import java.util.*;

public class Test2751 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < N; i++) list.add(Integer.parseInt(br.readLine()));
		
		Collections.sort(list);
		
		for(int i = 0; i < list.size(); i++) bw.write(list.get(i).toString() + "\n");
		
		bw.flush();
		bw.close();
	}

}
