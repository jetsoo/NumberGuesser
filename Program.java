import java.util.ArrayList;
import java.math.*;
import java.util.Scanner;
	

public class Program 
{
	public static void difference(int a, int b)
	{
		if(Math.abs(a-b) < 3)
		{
			System.out.println("sooo close");
	
		}
		if(Math.abs(a-b)>10) 
		{
			System.out.println("difference is more than 10");
		}
		if(Math.abs(a-b) < 10)
		{
			System.out.println("difference is less than 10");
		}
		
	}
	
	public static void main(String[] args) 
	{
		int realnumber = (int)(Math.random() *100) + 1;
		System.out.println("number generated, take your guess");
		
		Scanner scan = new Scanner(System.in);
		int inputnumber = scan.nextInt();
		int guessamount = 0;
		int score = 100;
		
		
		while(inputnumber != realnumber)
		{
		
			if(inputnumber < realnumber)
			{
				System.out.println("too low");
				difference(realnumber,inputnumber);
			}
			if(inputnumber > realnumber)
			{
				System.out.println("too high");
				difference(realnumber,inputnumber);
			}
			System.out.println("try again");
			int inputnumber2 = scan.nextInt();
			inputnumber = inputnumber2;
			guessamount++;
			score -= 5;
		}
		
		if(inputnumber == realnumber)
		{
			System.out.println("you guessed right after " + guessamount + " trys");
			System.out.println("Score: " + score+ "/100");
		}
	}
}


