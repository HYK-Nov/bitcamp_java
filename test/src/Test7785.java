import java.io.*;
import java.util.*;

public class Test7785 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String[][] arr= new String[N][2];
		List<String> list = new ArrayList<>();
		
		for (int i = 0; i < N; i++) arr[i] = br.readLine().split(" ");
		
		Arrays.sort(arr , (o1, o2)->o1[0].compareTo(o2[0]));
		
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i][0].equals(arr[i+1][0])) {
				if (arr[i+1][1].equals("enter")) {
					list.add(arr[i+1][0]);
				}else {
					if (list.contains(arr[i+1][0])) {
						list.remove(arr[i+1][0]);
					}
				}
			}else {
				list.add(arr[i][0]);
			}
		}
		
		list.sort(Comparator.reverseOrder());
		
		bw.write(Arrays.deepToString(arr) + "\n");
		bw.write(list.toString().replaceAll("[\\[,\\]]", "").replaceAll("\\s", "\n"));
		
		
		bw.flush();
		bw.close();
	}

}
