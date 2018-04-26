package learningString;

import java.util.Scanner;

public class LearnStringFn {

	public static void main(String[] args) {

		int count = 0;
		Scanner name = new Scanner(System.in);

		System.out.println("Enter the string to find the repeated values: ");

		String s = name.nextLine();
		
		char c = name.next().charAt(0);

		System.out.println("Find the length of the word: " + s.length());

		for(int i = 0 ; i < s.length(); i++)
		{
			//char current = s.charAt(i);
			//for(int j = 1; j < s.length(); j++)
		//{
				//char value = s.charAt(j);
						
			if (s.charAt(i)== c)
			{
				count++;
			}
			
		//}
		
	}
		System.out.println(count);
		
		}
}


