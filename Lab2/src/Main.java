/**
 * Name: Thomas Draves
 * Date: 9-13-17
 * Class: CSC 213L
 * Program: calculator
 */
import java.util.Scanner;
/**
 * 
 * @author Thomas
 * 
 *Description: This code is a calculator that does int addition, subtraction, and multiplication.
 *				This code also does float division. 
 */
public class Main
{
	public static void main( String[] args )

	{
		String prompt = "Please enter a mathematical expression (q to exit): ";
		Scanner input = new Scanner( System.in );
		
		while(true)
		{
			System.out.print(prompt);
			String exp = input.nextLine();
			
			if (exp.equals("q"))
			{
				System.exit(0);
			}
			
			String firstStr = "";
			String secondStr = "";
			
			int index = exp.indexOf("+");
			
			if ( index != -1 )
			{
				firstStr = exp.substring(0 , index );
				firstStr = firstStr.trim();
				secondStr = exp.substring( index + 1 );
				secondStr = secondStr.trim();
				
				try
				{
					int first = Integer.parseInt( firstStr );
					int second = Integer.parseInt( secondStr );
				}
				catch(Exception e)
				{
					System.out.println("ERROR: invalid number detected");
					continue;
				}
				
				int first = Integer.parseInt( firstStr );
				int second = Integer.parseInt( secondStr );
				if (first < 0 | second < 0)
				{
					System.out.println("ERROR: negative numbers are not allowed");
					continue;
				}
				
				System.out.print("The result is: ");
				System.out.println(first + second);
				
				
			}
				int index1 = exp.indexOf( "-" );
								
				if (index1 != -1)
				{
					firstStr = exp.substring(0 , index1 );
					firstStr = firstStr.trim();
					secondStr = exp.substring( index1 + 1 );
					secondStr = secondStr.trim();
					
					try
					{
						int first = Integer.parseInt( firstStr );
						int second = Integer.parseInt( secondStr );
					}
					catch(Exception e)
					{
						System.out.println("ERROR: invalid number detected");
						continue;
					}
					int first = Integer.parseInt( firstStr );
					int second = Integer.parseInt( secondStr );
					if (first < 0 | second < 0)
					{
						System.out.println("ERROR: negative numbers are not allowed");
						continue;
					}
					System.out.print("The result is: ");
					System.out.println(first - second);
				}
				
				int index2 = exp.indexOf("*");
				
				
				if ( index2 != -1 )
				{
					firstStr = exp.substring(0 , index2 );
					firstStr = firstStr.trim();
					secondStr = exp.substring( index2 + 1 );
					secondStr = secondStr.trim();
					
					try
					{
						int first = Integer.parseInt( firstStr );
						int second = Integer.parseInt( secondStr );
					}
					catch(Exception e)
					{
						System.out.println("ERROR: invalid number detected");
						continue;
					}
					
					int first = Integer.parseInt( firstStr );
					int second = Integer.parseInt( secondStr );
					if (first < 0 | second < 0)
					{
						System.out.println("ERROR: negative numbers are not allowed");
						continue;
					}
					
					System.out.print("The result is: ");
					System.out.println(first * second);
				}
				
				int index3 = exp.indexOf( "/" );
				
				if (index3 != -1)
				{
					firstStr = exp.substring(0 , index3 );
					firstStr = firstStr.trim();
					secondStr = exp.substring( index3 + 1 );
					secondStr = secondStr.trim();
					
					try
					{
						float first = Integer.parseInt( firstStr );
						float second = Integer.parseInt( secondStr );
					}
					catch(Exception e)
					{
						System.out.println("ERROR: invalid number detected");
						continue;
					}
					float first = Integer.parseInt( firstStr );
					float second = Integer.parseInt( secondStr );
					if (second == 0)
					{
						System.out.println("ERROR: can not divide by zero");
						continue;
					}
					if (first < 0 | second < 0)
					{
						System.out.println("ERROR: negative numbers are not allowed");
						continue;
					}
					System.out.print("The result is: ");
					System.out.println(first / second);
				}
					
				if (index == -1 && index1 == -1 && index2 == -1 && index3 == -1)
				{
					System.out.println("ERROR: invalid or no operator specified, please try again");
				}
		}
	}	
}
		