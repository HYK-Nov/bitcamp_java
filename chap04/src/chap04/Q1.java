package chap04;

public class Q1 {

	public static void main(String[] args) {
		String a_08 = "write once, run anywhere";
		
		if (a_08.contains("wife")) {
			System.out.println("wife");
		}else if(a_08.contains("once") && !a_08.contains("run")) {
			System.out.println("once");
		}else if(a_08.contains("everywhere")) {
			System.out.println("everywhere");
		}else if(a_08.contains("anywhere")) {
			System.out.println("anywhere");
		}else {
            System.out.println("none");
        }
	}

}
