//10.Write the Java program that reads an input string and converts it to an integer, handling the exceptions if the input contains non-digits or if the input is larger than what an integer can store:



package assignment4;

import java.util.Scanner;

public class ConvertToInteger {

	public static void converting(String input) throws IllegalArgumentException {
		// TODO Auto-generated method stub

		int num = Integer.parseInt(input);
		if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) {
			throw new IllegalArgumentException();
		}
	}

	public static void main(String[] args) {
		try {
			System.out.println(Integer.MAX_VALUE);
			System.out.println(Integer.MIN_VALUE);
			System.out.println("enter the number");
			Scanner sc = new Scanner(System.in);
			String num = sc.next();
			converting(num);
			System.out.println("convert into integer successfully..........");

		} catch (IllegalArgumentException e) {
			System.out.println("number should not be excceds the range of integer.....");
		}
	}
}
