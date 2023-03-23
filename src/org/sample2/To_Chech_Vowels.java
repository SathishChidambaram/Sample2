package org.sample2;

public class To_Chech_Vowels {

	public static void main(String[] args) {

		String str = "SATHISH";

		String st = str.toLowerCase();

		if (st.contains("a") | st.contains("e") | st.contains("i") | st.contains("o") | st.contains("u")) {
			System.out.println("Contains Vowel");
		} else {
			System.out.println("Not Contains Vowels");
		}

		System.out.println("First line updated by Sathish");

		System.out.println("First line updated by Divya");
	}

}