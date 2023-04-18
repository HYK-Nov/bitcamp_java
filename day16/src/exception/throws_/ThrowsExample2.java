package exception.throws_;

public class ThrowsExample2 {
	
	public void aaa(int n) throws Exception{
		System.out.println(new StringBuffer("aaa 호출"));
		int i = 10 / n;
		System.out.println(new StringBuffer("계산 결과").append(i));
		System.out.println(new StringBuffer("aaa 실행 종료"));
	}
	
	public void bbb() throws Exception{
		System.out.println(new StringBuffer("bbb 호출"));
		aaa(0);
		System.out.println(new StringBuffer("bbb 실행 종료"));
	}
	
	public void ccc() throws Exception{
		System.out.println(new StringBuffer("ccc 호출"));
		bbb();
		System.out.println(new StringBuffer("ccc 실행 종료"));
	}
	
	public ThrowsExample2() throws Exception{
		System.out.println(new StringBuffer("생성자 호출"));
		ccc();
		System.out.println(new StringBuffer("생성자 종료"));
	}
	
	public static void main(String[] args) {
		try {
			ThrowsExample2 te = new ThrowsExample2();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("진짜 끝");
	}

}
