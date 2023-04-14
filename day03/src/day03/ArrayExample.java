package day03;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		// �迭 ���� - stack�� �迭 �ּҸ� ���� ���� ����
		int[] score; // int score[]; �� ����
		
		// �迭 ���� - heap�� ���� �����Ͱ� ����� ���� ����
		// �迭 ���� ��, ũ�⸦ ���. �� �� ũ�� ���� ��, ���� �Ұ�
		score = new int[5]; // int 5���� ���� �� �ִ� ũ��
		System.out.println(score); // ������ �ּҸ� ��� �����Ƿ� �ּ� ���
		
		// �迭 �ʱ�ȭ - �迭 ���ο� ���� ���� ����
		// ���α׷��� ������ 0���� ������
		score[0] = 12;
		score[1] = 67;
		score[4] = 55;
		
		// �迭 �� ����
		System.out.printf("%d %d %d %d %d\n", score[0], score[1], score[2], score[3], score[4]);
		
		// �迭 ���� ���� ���ڿ��� ��ȸ -> Arrays.toString();
		System.out.println(Arrays.toString(score));
		
		// �迭 ���� -> .length
		System.out.println(score.length);
		
		// �迭 ����� ���� ���ÿ�
		int[] iArr = new int[7];
		
		// �迭 ����� �ʱ�ȭ ���ÿ�
		int[] iArr2 = {1, 3, 5, 7, 9};
		
		System.out.println(Arrays.toString(iArr2));
	}

}
