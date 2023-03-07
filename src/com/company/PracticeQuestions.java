package com.company;

import java.util.Scanner;

public class PracticeQuestions {
		public static void reverseCharacterString(String myString) {
			String backwardsString = "";
			String currentWord = "";
			for(int i = 0; i < myString.length(); i ++){
			    char currentCharacter = myString.charAt(i);
			    if(currentCharacter != ' '){
			        currentWord += myString.charAt(i);
			    } else {
			        backwardsString = currentWord + " " + backwardsString;
			        currentWord = "";
			    }
			}
			backwardsString = currentWord + " " + backwardsString;
			System.out.println(backwardsString);
		}
		public static void mulitplyByExponent() {
			Scanner myScanner = new Scanner(System.in);
			int base;
			int exponent;
			double answer = 1;
			System.out.println("Enter base");
			base = myScanner.nextInt();
			System.out.println("Enter exponent");
			exponent = myScanner.nextInt();
			for(int i = 0; i < exponent; i++) {
				answer = answer*base;
			}
			System.out.println(answer);
		}
		public static void printPatternNestedLoop() {
			String star = "*";
			String zero = "0";
			String fullString = "";
			for(int i = 1; i <= 5; i++){
				for(int j = 0; j < i; j++){
					fullString += star;
				}
				System.out.println(fullString);
				fullString = "";
			}
		}
		
			
}
