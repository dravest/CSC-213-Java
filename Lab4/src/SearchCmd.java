import java.io.File;
import java.io.*;
import java.util.Scanner;

public class SearchCmd
{
	private String fileName;
	private String searchTerm;
	File name = new File(fileName);
	String term = searchTerm;
	
	public SearchCmd(String s2, String s3)
	{
		fileName = s2;
		searchTerm = s3;
	}
	public boolean validateInputFile()
	{
		boolean isDirectory = name.isDirectory();
		if (isDirectory == true)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public boolean execute() throws Exception
	{
			FileInputStream fis = new FileInputStream(name);
			boolean x = false;
			try
			{
				int c = -1;
				
				while((c = fis.read())!= -1)
				{
					Scanner Scanner = new Scanner(fis);
					while(Scanner.nextLine() != null)
					{
						String line = Scanner.nextLine();
						if(line.equals(term))
						{
							System.out.println("Term found!");
							x = true;
						}
					}
				}
			}
			finally
			{
				if (fis != null)
				{
					fis.close();
				}
			}
		if (x == true)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
			
	}