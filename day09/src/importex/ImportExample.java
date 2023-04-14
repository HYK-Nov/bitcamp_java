package importex;
/*
 * 같은 프로젝트 내의 코드끼리나 혹은 자바에서 기본으로 제공하는 클래스파일은
 * 언제든 가져다가 사용할 수 있음
 * 다만 다른 패키지에 있는 클래스를 사용하려면 반드시 package 선언부 아래(1번라인 아래)
 * import 선언을 통해 도입하고 싶은 클래스의 경로(패키지명과 클래스명)를 적어야 함
 */

import fruit.Pear;
import fruit.WaterMelon;
import hello.bye.Bye;
import hello.hi.Hi;

public class ImportExample {

	public static void main(String[] args) {
		WaterMelon waterMelon = new WaterMelon();
		Pear pear = new Pear();
		Hi hi = new Hi();
		Bye bye = new Bye();
		
		// 같은 패키지인 경우 import 없이 코드 활용 가능
		Test test = new Test();
	}

}
