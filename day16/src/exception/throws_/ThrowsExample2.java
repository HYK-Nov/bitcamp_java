package exception.throws_;

public class ThrowsExample2 {
	
	public void aaa(int n) throws Exception{
		System.out.println(new StringBuffer("aaa ȣ��"));
		int i = 10 / n;
		System.out.println(new StringBuffer("��� ���").append(i));
		System.out.println(new StringBuffer("aaa ���� ����"));
	}
	
	public void bbb() throws Exception{
		System.out.println(new StringBuffer("bbb ȣ��"));
		aaa(0);
		System.out.println(new StringBuffer("bbb ���� ����"));
	}
	
	public void ccc() throws Exception{
		System.out.println(new StringBuffer("ccc ȣ��"));
		bbb();
		System.out.println(new StringBuffer("ccc ���� ����"));
	}
	
	public ThrowsExample2() throws Exception{
		System.out.println(new StringBuffer("������ ȣ��"));
		ccc();
		System.out.println(new StringBuffer("������ ����"));
	}
	
	public static void main(String[] args) {
		try {
			ThrowsExample2 te = new ThrowsExample2();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("��¥ ��");
	}

}
