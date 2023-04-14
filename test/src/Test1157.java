import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Test1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] strArr = br.readLine().toUpperCase().split("");
		int[] countArr = new int[26];
		
		for (int i = 0; i < strArr.length; i++) {
			// String -> ASCII 변환 후 갯수 저장
			countArr[(int)strArr[i].charAt(0) % 65] += 1;
		}
		
		// 최대값 중복 찾기
		if (Arrays.stream(countArr).filter(e->e == Arrays.stream(countArr).max().getAsInt()).toArray().length > 1) {
			bw.write("?");
		}else {
			// int[] -> List -> 최대값 index 찾기 -> ASCII 변환
			bw.write((char)(Arrays.stream(countArr).boxed()
					.collect(Collectors.toList()).indexOf(Arrays.stream(countArr).max().getAsInt()) + 65));
		}
		
		bw.flush();
		bw.close();
	}

}
