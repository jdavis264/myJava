package task2;

import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("how many iterations would you like: ");
		int iterations = reader.nextInt();
		
		String output = "*";
		for (int i=0;i<iterations;i++)
		{
			System.out.println(output);
			output += "*";
		}
		reader.close();
	}

}
