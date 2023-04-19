package api.util;

import java.util.Arrays;

public class ArraysSearch {
	
	public static void main(String[] args) {
		int[] scores = {75, 47, 23, 56, 89};
		int[] scores2 = Arrays.copyOf(scores, scores.length);
		
		// Arrays.sort(): �迭�� �����͸� ������������ �����ϴ� �޼���
		Arrays.sort(scores2);
		System.out.println(new StringBuffer("scores: ").append(Arrays.toString(scores)));
		System.out.println(new StringBuffer("scores2: ").append(Arrays.toString(scores2)));
		
		// Arrays.binarySearch(): �迭 ���� �ε��� ��ȣ�� Ž���ϴ� �޼���
		int index = Arrays.binarySearch(scores, 75);
		System.out.println(new StringBuffer("75�� ����� �ε��� ��ȣ: ").append(index));
		
		// Arrays.equals(�迭1, �迭2): �迭 ���� ��� ��
		int[] arr1 = {1, 3, 5, 7, 9};
		int[] arr2 = {1, 3, 5, 7, 9};
		String result = Arrays.equals(arr1, arr2) ? "�׸� ��ġ" : "�׸� ����ġ";
		System.out.println(new StringBuffer(result));
	}
}
