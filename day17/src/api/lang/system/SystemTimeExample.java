package api.lang.system;

public class SystemTimeExample {

	public static void main(String[] args) {
		/*
		 * - currentTimeMillis()와 nanoTime() 메서드는
		 *   UNIX 시간이라는 체계를 사용함
		 * - UNIX 시간이란 1970년 1월 1일 00시 00분 00초를 기점으로
		 *   얼만큼의 시간이 지났는지 숫자로 표현하는 체계임
		 * - 현재까지의 시간을 1000분의 1초로 변환한 에폭시간과
		 *   현재까지의 시간을 10억분의 1초로 변환한 에폭시간을
		 *   long 타입으로 리턴함
		 */
		long start = System.currentTimeMillis(); // 메서드 리턴타입 long
		long sum = 0;
		
		for (int i = 1; i < 10000000L; i++) {
			sum += i;
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(new StringBuffer("시작 시간: ").append(start));
		System.out.println(new StringBuffer("종료 시간: ").append(end));
		System.out.println(new StringBuffer("소요 시간: ").append(end - start));
		
	}

}
