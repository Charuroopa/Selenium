package learningjava;

import java.util.Scanner;

public class PrimeandNonPrimefactors {

	static Scanner sc = new Scanner(System.in);
	
	static int num = sc.nextInt();
	int number = sc.nextInt();
	public void factors()
	{
		for(int i = 1 ; i <= number; i++)
		{
			if(number %i == 0)
			{
				System.out.println("Factors of the " + number + " is " + i + " ");
			}
		}
	}
	
	public static void primenumbers()
	{
		System.out.println("The prime factors are: ");
		for (int i = 2; i<=num ; i++)
		{	
			while(num%i == 0)
			{
				System.out.println(i);
				num = num/i;
			}
		}
		if (num<1)
		System.out.println(num);

	}
	
	public static void main(String[] args) {
		
		System.out.println("Calling the Static function without object: ");
		primenumbers();
		
		System.out.println("Calling non static function with object creation: ");
		
		PrimeandNonPrimefactors obj = new PrimeandNonPrimefactors();
		obj.factors();
	}
}
