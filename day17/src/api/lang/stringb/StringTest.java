package api.lang.stringb;

public class StringTest {
	
	public static void main(String[] args) {
		long start, end;
		start = System.currentTimeMillis();
		String str = "ABCD";
		
		for (int i = 0; i < 100000; i++) {
			str += "ABCD";
		}
		
		end = System.currentTimeMillis();
		System.out.println("String 소요 시간: "+ (end - start));
		
		// StringBuffer 시작
		start = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("ABCD");
		
		for (int i = 0; i < 100000; i++) {
			sb.append("ABCD");
		}
		
		end = System.currentTimeMillis();
		System.out.println("StringBuffer 소요 시간: " + (end - start));
	}
}
