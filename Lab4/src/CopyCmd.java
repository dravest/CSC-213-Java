import java.io.File;
import java.io.*;

public class CopyCmd
{
	private String copyFile;
	private String copyTo;
	private int buffer;
	File copy = null;
	File output = null;
	
	public CopyCmd(String s2, String s3, int s4)
	{
		copyFile = s2;
		copyTo = s3;
		buffer = s4;
		copy = new File(copyFile);
		output = new File(copyTo);
	}
	public boolean validateInputFile()
	{
		if (copy.exists() == false)
		{
			System.out.println("ERROR: the file does not exist: " + copy);
			return false;
		}
		else
		{
			if (copy.isDirectory() == true)
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
	public boolean validateOutputFile()
	{
			if (output.isDirectory() == true)
			{
				System.out.println("ERROR: this is not a file, it is a directory" + output);
				return false;
			}
			else
			{
				return true;
			}
	}
	public void execute()
	{
		
		// Binary read/write
				FileInputStream      fis = null;
				BufferedInputStream  bis = null;
				FileOutputStream	 fos = null;
				BufferedOutputStream bos = null;
				
				// Text read/write
				FileReader     fread  = null;
				BufferedReader bread  = null;
				FileWriter	   fwrite = null;
				BufferedWriter bwrite = null;
				PrintWriter	   pwrite = null;
				
		
		
		//if (output.exists() && !output.isDirectory());
		try
		{
			// Copy file as a binary file
						fis = new FileInputStream(copy);
						bis = new BufferedInputStream( fis );
						fos = new FileOutputStream(copyTo);
						bos = new BufferedOutputStream( fos );
						
						long remain = copy.length();
						
						while( remain > 0 )
						{
							// Ternary statement: translates to:
							// if ( remain > 512 )
							// {
							//		howMuch = 512
							// }
							// else
							// {
							//		howMuch = remain
							// }
							int    howMuch = ((int)remain > buffer ? buffer : (int)remain);
							byte[] local   = new byte[howMuch];
							
							int nRead = bis.read( local, 0, local.length );
							
							bos.write( local, 0, local.length );
							
							remain -= nRead;
						}
						
						bos.flush();
		
						 //Copy file as text - uncomment to run
			 			fread  = new FileReader( copy );
			 			bread  = new BufferedReader( fread );
			 			fwrite = new FileWriter( copyTo );
			 			bwrite = new BufferedWriter( fwrite );
			 			pwrite = new PrintWriter( bwrite );
			 			
			 			String s = null;
			 			
			 			while( (s = bread.readLine()) != null )
			 			{
			 				pwrite.println( s );
			 			}
			 			
			 			pwrite.flush();
		}
		catch( IOException ioe )
		{
			// Handle errors here
			ioe.printStackTrace( System.err );
		}
		finally
		{
			try
			{
				if ( bis != null )
					bis.close();
				
				if ( fis != null )
					fis.close();
				
				if ( bos != null )
					bos.close();
				
				if ( fos != null )
					fos.close();
				
				if ( bread != null )
					bread.close();
				
				if ( fread != null )
					fread.close();
				
				if ( pwrite != null )
					pwrite.close();
				
				if ( bwrite != null )
					bwrite.close();
				
				if ( fwrite != null )
					fwrite.close();
			}
			catch( IOException ioe ) {}
		}
	}
}