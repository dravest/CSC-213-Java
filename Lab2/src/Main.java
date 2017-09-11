import java.util.Scanner;

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
				System.exit(0);
			
			int index = exp.indexOf("+");
			
			String firstStr = "";
			String secondStr = "";
			
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
				}
				
				System.out.print("The result is: ");
				System.out.println(first + second);
				
				
			}
				int index1 = exp.indexOf( "-" );
				
				String firstStr1 = "";
				String secondStr1 = "";
				
				if (index1 != -1)
				{
					firstStr1 = exp.substring(0 , index1 );
					firstStr1 = firstStr1.trim();
					secondStr1 = exp.substring( index1 + 1 );
					secondStr1 = secondStr1.trim();
					
					try
					{
						int first = Integer.parseInt( firstStr1 );
						int second = Integer.parseInt( secondStr1 );
					}
					catch(Exception e)
					{
						System.out.println("ERROR: invalid number detected");
						continue;
					}
					int first = Integer.parseInt( firstStr1 );
					int second = Integer.parseInt( secondStr1 );
					if (first < 0 | second < 0)
					{
						System.out.println("ERROR: negative numbers are not allowed");
					}
					System.out.print("The result is: ");
					System.out.println(first - second);
				}
				if (index == -1 && index1 == -1)
				{
					System.out.println("ERROR: invalid or no operator specified, please try again");
				}
		}
	}	
}
		