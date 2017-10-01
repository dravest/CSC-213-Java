import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static void main( String[] args )
    {
        FileReader              fr      = null;
        BufferedReader          br      = null;
        ICSMap<String, Integer> wordMap = new CSMap<String, Integer>();
        
        try
        {
            fr = new FileReader( new File( "sample.txt" ) );
            br = new BufferedReader( fr );
            
            String line = null;
            
            while( (line = br.readLine()) != null )
            {
                String[] words = line.split( " " );
                
                for ( String word : words )
                {
                    word = word.trim();
                    word = word.toLowerCase();
                    
                    if ( wordMap.containsKey( word ) )
                    {
                        int currCount = wordMap.get( word );
                        wordMap.put( word, ++currCount );
                    }
                    else
                    {
                        wordMap.put( word, 1 );
                    }
                }
            }
            
            for ( String keyWord : wordMap.getKeys() )
            {
                System.out.println( keyWord + ": " + wordMap.get( keyWord ) );
            }
        }
        catch( Exception e )
        {
            e.printStackTrace( System.err );
        }
        finally
        {
            try
            {
                if ( br != null )
                    br.close();
            
                if ( fr != null )
                    fr.close();
            }
            catch( Exception e ) {}
        }
    }
}
