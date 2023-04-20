import java.io.*;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int count = 0;
		
		for (int i = 0; i < N; i++) {
			String[] arr = br.readLine().split("");
			Stack<String> stack = new Stack<>();
			
			for(String str : arr) {
				if(!stack.isEmpty() && stack.peek().equals(str)) stack.pop();
				else stack.push(str);
			}
			
			if(stack.isEmpty()) count++;
		}
		
		bw.write(Integer.toString(count));

		bw.flush();
		bw.close();
	}
}