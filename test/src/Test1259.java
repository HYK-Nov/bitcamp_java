import java.io.*;

public class Test1259 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = "";

		while (true) {
			str = br.readLine();

			if (str.equals("0")) break;
			
			String[] arr = str.split("");

			if (arr.length < 2) bw.write("yes\n");
			else {
				for (int i = 0; i < arr.length / 2; i++) {
					if (!arr[i].equals(arr[arr.length - 1 - i])) {
						bw.write("no\n");
						break;
					} else if (i == arr.length / 2 - 1 && arr[i].equals(arr[arr.length - 1 - i])) {
						bw.write("yes\n");
					}
				}
			}
		}

		bw.flush();
		bw.close();
	}

}
