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
			if (!s1.equalsIgnoreCase("Copy") && !s1.equalsIgnoreCase("Search") && !s1.equalsIgnoreCase("Copy"))
			{
				System.out.println("ERROR: command not recognized");
				continue;
			}
			if (s1.equalsIgnoreCase("Search")) 
			{
				System.out.println("Please enter the path to the file to search");
				System.out.print(">");
				String s2 = input.nextLine();
				if (s2.isEmpty() == true)
				{
					System.out.println("ERROR: the file name cannot be null or empty string");
					continue;
				}
				System.out.println("Please enter the term to search for");
				System.out.print(">");
				String s3 = input.nextLine();
				if (s3 == "")
					{
						System.out.println("ERROR: search term cannot be empty string");	
					}
				SearchCmd SC = new SearchCmd(s2, s3);
				if (SC.validateInputFile() == true)
				{
					SC.execute();
					continue;
				}
			}			
			if (s1.equalsIgnoreCase("copy"))
			{
				System.out.println("Please enter the path to the file to copy");
				System.out.print(">");
				String s2 = input.nextLine();
				if (s2.isEmpty() == true)
				{
					System.out.println("ERROR: the file name cannot be null or empty string");
					continue;
				}
				System.out.println("Please enter the destination path");
				System.out.print(">");
				String s3 = input.nextLine();
				if (s3.isEmpty() == true)
				{
					System.out.println("ERROR: the file name cannot be null or empty string");
					continue;
				}
				System.out.println("Please enter the size of the read buffer");
				System.out.print(">");
				//int s4 = input.nextInt();
				//input.nextLine();
				int s4 = Integer.parseInt( input.nextLine() );
				if (s4 <= 0)
				{
					System.out.println("ERROR: invalid read length" + s4);
					continue;
				}
				CopyCmd CC = new CopyCmd(s2, s3, s4);
				if (CC.validateInputFile() == true && CC.validateOutputFile() == true)
				{
					CC.execute();
					continue;
				}
			}
		}
	}
}