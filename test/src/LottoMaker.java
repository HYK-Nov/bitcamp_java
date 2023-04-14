import java.util.Arrays;

public class LottoMaker {

	public static void main(String[] args) {
		int[] lottoNumber = new int[6];
		
		for (int i = 0; i < lottoNumber.length; i++) {
			lottoNumber[i] = (int)(Math.random() * 45)+1;
			System.out.println(Arrays.toString(lottoNumber));
			System.out.println(Arrays.binarySearch(lottoNumber, lottoNumber[i]));
			
//			if (Arrays.asList(lottoNumber).indexOf(lottoNumber[i]) != -1) {
//				System.out.println(Arrays.asList(lottoNumber).indexOf(lottoNumber[i]));
//				while(Arrays.asList(lottoNumber).indexOf(lottoNumber[i]) == -1) {
//					lottoNumber[i] = (int)(Math.random() * 45)+1;
//				}
//			}
		}
		
		Arrays.sort(lottoNumber);
		
		System.out.println(Arrays.toString(lottoNumber));
		
//		int[] autoNumbering = new int[6];
	}

}
