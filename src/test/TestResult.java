package test;

import java.util.Scanner;
import domain.Exercise;

public class TestResult {
    
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("str: ");
			String str = sc.nextLine();
			
			System.out.println("shift: ");
			int shiftKey = sc.nextInt();
			
			String crypt = Exercise.crypt(str, shiftKey);
			System.out.println("Crypt => " + crypt);
			System.out.println("Decrypt => " + Exercise.decrypt(crypt, shiftKey));
		}
	}
}
