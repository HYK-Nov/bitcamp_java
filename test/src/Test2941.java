import java.io.*;
import java.util.Arrays;

public class Test2941 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		String[] arr = {"c=", "c\\-", "dz=", "d\\-", "lj", "nj", "s=", "z="};
		
		System.out.println(str.replaceAll("[^(c=)|(c\\-)|(dz=)|(d\\-)|(lj)|(nj)|(s=)|(z=)]", ""));
		
		int count = str.length() - str.replaceAll("[^(c=)(c\\-)(dz=)(d\\-)(lj)(nj)(s=)(z=)]", "").length();
		
		str = str.replaceAll("[^(c=)(c\\-)(dz=)(d\\-)(lj)(nj)(s=)(z=)]", "");
		
		for(String s : arr) {
			count += (str.length() - str.replaceAll("("+s+")", "").length())/s.length();
		}
		
		System.out.println(count);
//		System.out.println(Arrays.toString(str.split("[(c=)(c\\-)(dz=)(d\\-)(lj)(nj)(s=)(z=)]")));
		
		bw.flush();
		bw.close();
	}

}
