import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Boolean x = true;
		while (x == true)	
		{
			System.out.println("Please enter a command (Copy|Search|Exit)");
			System.out.print(">");
			String s1 = input.nextLine();
			if (s1.equalsIgnoreCase("Exit"))
			{
				x = false;
			}
			else if (s1.equalsIgnoreCase("copy"))
			{
				System.out.println("Please enter the path to the file to copy");
				System.out.print(">");
				String s2 = input.nextLine();
				System.out.println("Please enter the destination path");
				System.out.print(">");
				String s3 = input.nextLine();
				System.out.println("Please enter the size of the read buffer");
				System.out.print(">");
				int s4 = input.nextInt();
				CopyCmd CC = new CopyCmd(s2, s3, s4);
				continue;
				
			}
			else if (s1.equalsIgnoreCase("Search")) 
			{
				System.out.println("Please enter the path to the file to search");
				System.out.print(">");
				String s2 = input.nextLine();
				System.out.println("Please enter the term to search for");
				System.out.print(">");
				String s3 = input.nextLine();
				SearchCmd SC = new SearchCmd(s2, s3);
				continue;
			}
			else
			{
				System.out.println("ERROR: command not recognized");
				continue;
			}
		}
	}
}