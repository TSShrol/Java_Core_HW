package java_core_lesson10;

import java.util.Arrays;
import java.util.Scanner;

public class Application_task1_4 {

	public static void main(String[] args) {
		task1();
		task2();
		task3();
		task4();
	}

	/*
	 * 1 �������� ��������, ��� ���� ���������, �� � ����� � �'��� ����, �������
	 * ������������, ���������� (��������: ������, ������). ���� ������� ����� ��
	 * � 5 ����, �� ���������� ��� �������. �������� ������� ��������� ���������
	 * �����, ����� ���� � ����� ���������� ������� ������ �������. ���������,
	 * ����� ������ ��� �����л ��� ����� ������� �����������.
	 */

	static void task1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �����. ��������� �� ��������!");
		String s1;
		s1 = sc.next();
		StringBuffer stb = new StringBuffer(s1);
		String s2 = stb.reverse().toString();
		if (s1.length() <= 5) {
			if (s1.equalsIgnoreCase(s2)) { // ����� � ���� ������ s1.compareToIgnoreCase(s2) == 0
				System.out.println(s1 + " is polindrom!");
			} else {
				System.out.println(s1 + " NOT is polindrom!");
			}
		} else {
			System.out.println(s1 + " is more 5 symbol!");
		}
	}

	/*
	 * 2 ������ �� ������ ����� � ����� �� ���� ('-').
	 */

	static void task2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �����:");
		char[] golosni = { '�', '�', '�', '�', '�', '�', '�' };
		String s1;
		s1 = sc.nextLine();
		for (char element : golosni) {
			s1 = s1.replace(element, '-');
		}
		System.out.println(s1);
	}

	/*
	 * ���� ��������: 3. ���������� ������� ��� � ������. (������� �������)
	 */
	static void task3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �����:");
		String s1;
		s1 = sc.nextLine();
		int countWords = 0;
		for (String element : s1.split(" ")) {
			if (element.length() >= 2) {
				countWords++;
			}
		}
		System.out.println(countWords);
	}

	/*
	 * 4. ������ �����, ��� ��������� ����������� � ������.
	 */
	static void task4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �����:");
		String s1;
		s1 = sc.nextLine();
		int countWords = 0;
		String maxCountWords;
		// �������� �� ����� ����������, ����� ACCII 33-64 (����� ����������, �����)

		for (byte i = 33; i <= 64; i++) {
			System.out.print((char) i + " ");
			s1 = s1.replace(String.valueOf((char) i), "");
		}
		System.out.println(s1);
		String[] masWords = s1.split(" ");
		System.out.println(Arrays.toString(masWords));
		int countMaxWord = 0;
		String maxWord="";
		int currentCountWord;
		for (String word : masWords) {
			currentCountWord = 0;
			if (word.length() > 2) {
				for (String currentWord : masWords) {
					if (currentWord.contentEquals(word)) {
						currentCountWord++;
					}
				}
			}
			if (countMaxWord < currentCountWord) {
				countMaxWord = currentCountWord;
				maxWord=word;
			}
		}

		System.out.println("The word "+maxWord+" occurs maximum number of times - "+countMaxWord);
	}

}
