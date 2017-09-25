import java.io.File;
import java.io.*;

public class CopyCmd
{
	private String copyFile;
	private String copyTo;
	private int buffer;
	File copy = new File(copyFile);
	File output = new File(copyTo);
	
	public CopyCmd(String s2, String s3, int s4)
	{
		copyFile = s2;
		copyTo = s3;
		buffer = s4;
	}
	public boolean validateInputFile()
	{
		boolean isDirectory = copy.isDirectory();
		if (isDirectory == true)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public boolean validateOutputFile()
	{
		boolean isDirectory = output.isDirectory();
		if (isDirectory == true)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public void excute() throws Exception
	{
		final int bufferSize = buffer;
		
		FileOutputStream fos = new FileOutputStream(copyTo);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		byte[];
		
	}
}