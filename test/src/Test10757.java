import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;

public class Test10757 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BigInteger[] bigArr = Arrays.stream(br.readLine().split(" ")).map(BigInteger::new).toArray(BigInteger[]::new);
		
		bw.write((bigArr[0].add(bigArr[1])).toString());
		
		bw.flush();
		bw.close();
	}

}
