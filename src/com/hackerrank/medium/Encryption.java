package com.hackerrank.medium;

import java.io.IOException;

/**
 *
 * https://www.hackerrank.com/challenges/encryption/problem
 *
 * 30 points
 *
 *
 */
public class Encryption {

	static void encryption() {

		String s = "feedthedog";
		s = "chillout";

		String sTrim = s.replaceAll("", "");

		int rowCount = (int) Math.floor(Math.sqrt(sTrim.length()));
		int colCount = (int) Math.ceil(Math.sqrt(sTrim.length()));

		if (rowCount * colCount < sTrim.length()) {
			rowCount = colCount;
		}

		String[] row = new String[rowCount];
		int i = 0, y = 0;

		// get the row array from input String -- feed thed og
		while (sTrim.length() > 0) {

			row[i] = sTrim.substring(0, colCount > sTrim.length() ? sTrim.length() : colCount);

			if (colCount > sTrim.length()) {
				break;
			}
			sTrim = sTrim.substring(y + colCount, sTrim.length());

			i++;
		}

		// get the encrypted words from row array
		String encryptedWord = "";

		for (int eachCharCount = 0; eachCharCount < colCount; eachCharCount++) {

			for (String rowString : row) {

				if (eachCharCount >= rowString.length()) {
					break;
				}
				encryptedWord = encryptedWord + rowString.charAt(eachCharCount);

			}
			encryptedWord = encryptedWord + " ";
		}

		System.out.println(encryptedWord);

	}

	public static void main(String[] args) throws IOException {
		encryption();
	}

}
