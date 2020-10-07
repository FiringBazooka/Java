package com.hackerrank.medium;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/sha-256/problem
 *
 * Max score : 30
 * 0a979e43f4874eb24b740c0157994e34636eed0425688161cc58e8b26b1dcf4e
 * a979e43f4874eb24b740c0157994e34636eed0425688161cc58e8b26b1dcf4e
 *
 * @author Suryadeepak_Bpl
 *
 */
public class Sha256 {

	public static void main(String[] args) throws NoSuchAlgorithmException {

		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		MessageDigest md = MessageDigest.getInstance("SHA-256");

		byte[] hash = md.digest(input.getBytes(StandardCharsets.UTF_8));

		BigInteger signHash = new BigInteger(1, hash);

		String output = signHash.toString(16);

		while (output.length() < 64) {
			output = "0" + output;
		}

		System.out.println(output);

	}

}
