import java.io.File;
import java.io.*;
import java.util.Scanner;

public class SearchCmd
{
	private String fileName;
	private String searchTerm;
	File name = null;
	String term = "";
	FileReader fread = null;
	BufferedReader bread = null;
	
	public SearchCmd(String s2, String s3)
	{
		fileName = s2;
		searchTerm = s3;
		name = new File(fileName);
		term = searchTerm;
	}
	public boolean validateInputFile()
	{
		if (name.exists()== false)
		{
			System.out.println("ERROR: the file does not exist: " + name);
			return false;
		}
		else
		{
			if (name.isDirectory() == true)
			{
				System.out.println("ERROR: this is not a file, it is a directory");
				return false;
			}
			else
			{
				return true;
			}
		}
	}
	
	public boolean execute()
	{
		try
		{	
			fread = new FileReader(name);
			bread = new BufferedReader(fread);
			String line = bread.readLine();
			
			while (line != null)
			{
				if (line.contains(term))
				{
					System.out.println("Found it!");
					break;
				}
				else
				{
					line = bread.readLine();
				}
			}
			
			
		}	
		catch(IOException ioe)
		{
			ioe.printStackTrace( System.err );
		}
		
		finally
		{
			try
			{
			if (fread != null)
			{
				fread.close();
			}
			if (bread != null)
			{
				bread.close();
			}
			}
			catch(IOException ioe)
			{
				
			}
		}
		return true;
	}
	public void main(String[] args)
	{
		if (validateInputFile() == true)
		{
			System.out.println("fuck this sit");
		}
		else
		{
			System.out.println("Fuck my life");
		}
	}
}