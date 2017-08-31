import java.util.Scanner;

/***
 * 
 * Javadoc
 * 
 * 
 * @author Thomas
 *
 */
public class Main
{
	public static void main( String[] args )
	{
		//output to the console
		System.out.println("Hello World");
		System.out.print("This is csc213");
		
		//Getting input from the user
		Scanner input = new Scanner( System.in);
		String s     = input.nextLine();
		
		System.out.print("You typed:" + s);
		
		//Getting input from the user forever
		while ( true )
		{
			System.out.print(">");
			String s1 = input.nextLine();
			System.out.print("You typed: " + s1);
		}
	}
}