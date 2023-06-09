package equals.array;

import java.util.Arrays;

public class ArrayEqualsTest {

	public static void main(String[] args) {
		// 배열은 참조형 변수이기 때문에, 단순 대입시 문제가 발생
		int[] intArray1 = {1, 2, 3, 4, 5};
		System.out.println("배열 주소: " + intArray1);
		System.out.println(Arrays.toString(intArray1));
		System.out.println("----------------------------");
		// 새로 생성하지 않고, intArray1을 대입받는 intArray2
		// 단순 대입으로 주소를 복사하는 경우를 얕은 복사라고 함
		// int[] intArray2 = intArray1;
		
		// 힙의 자료를 새로 똑같이 할당하는 복사를 깊은 복사라고 함
		// 변수 뒤에 .clone()을 써서 수행함
		int[] intArray2 = intArray1;
		intArray1[0] = 100;
		System.out.println(Arrays.toString(intArray1));
		System.out.println(Arrays.toString(intArray2));
		System.out.println("배열2 주소: " + intArray2);
	}

}
