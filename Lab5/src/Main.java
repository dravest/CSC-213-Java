import java.util.Comparator;

/**
 * Application entry point and test definitions.
 */
public class Main 
{
	public static void main( String[] args )
	{
		ICSList<Integer> list     = new CSList<Integer>();
		Integer		     save     = null;
		Integer		     fortyTwo = 42;
		
		for ( int i = 0; i < 20; i++ )
		{
			list.add( i + 1 );
			save = i + 1;
		}
		
		// Test the basic methods.
		System.out.println( "Is the list empty (should be false): " + list.isEmpty() );
		System.out.println( "How many elements in the list (should be 20): " + list.size() );
		System.out.println( "Testing contains() (should return true): " + list.contains( save ) );
		System.out.println( "Testing contains() (should return false): " + list.contains( 42 ) );
		System.out.println( "Contents:" );
		
		for ( int i = 0; i < list.size(); i++ )
		{
			System.out.print( list.get( i ) + ", " );
		}
		System.out.println();
		
		System.out.println( "Testing remove with saved element (should return true): " + list.remove( save ) );
		System.out.println( "Testing remove with unsaved element (should return false): " + list.remove( fortyTwo ) );
		System.out.println( "Test set() (should return 1): " + list.set( 0, fortyTwo ) );
		System.out.println( "Testing remove(int) (should return 42): " + list.remove( 0 ) );
		System.out.println( "Testing indexOf (should return 4): " + list.indexOf( 6 ) );
		
		list.clear();
	
		System.out.println( "Testing clear - list size should be 0 now: " + list.size() );
		
		for ( int i = 100; i > 0; i-- )
		{
			list.add( i );
		}
		
		System.out.println( "Re-populated list contents:" );
		for ( int i = 0; i < list.size(); i++ )
		{
			System.out.print( list.get( i ) + ", " );
		}
		System.out.println();
		
		try
		{
			list.get( 105 );
			System.out.println( "Testing invalid index #1 - FAILED" );
		}
		catch( IndexOutOfBoundsException ioobe )
		{
			System.out.println( "Testing invalid index #1 - PASSED" );
		}
		
		try
		{
			list.get( -20 );
			System.out.println( "Testing invalid index #2 - FAILED" );
		}
		catch( IndexOutOfBoundsException ioobe )
		{
			System.out.println( "Testing invalid index #2 - PASSED" );
		}
		
		list.add( 5, 10006 );
		
		System.out.println( "Testing add(index, element) - list contents (should see 10006 at index 5):" );
		for ( int i = 0; i < list.size(); i++ )
		{
			System.out.print( list.get( i ) + ", " );
		}
		System.out.println();
		
		System.out.println( "Sorting list (ascending)..." );
		list.sort( new Comparator<Integer>()
        {
            @Override
            public int compare( Integer o1, Integer o2 ) 
            {
                int x1 = o1.intValue();
                int x2 = o2.intValue();
                
                if ( x1 > x2 )
                {
                    return 1;
                }
                else if ( x1 == x2 )
                {
                    return 0;
                }
                
                return -1;
            }
        });
		
		System.out.println( "Sorted list contents:" );
		for ( int i = 0; i < list.size(); i++ )
		{
			System.out.print( list.get( i ) + ", " );
		}
		System.out.println();
		
		list.clear();
		list.add( 42 );
		list.add( 105 );
		list.add( -1 );
		list.add( -20 );
		list.add( 75 );
		
		System.out.println( "Re-populated list contents:" );
		for ( int i = 0; i < list.size(); i++ )
		{
			System.out.print( list.get( i ) + ", " );
		}
		System.out.println();
		
		System.out.println( "Sorting list (descending)..." );
		list.sort( new Comparator<Integer>()
        {
            @Override
            public int compare( Integer o1, Integer o2 ) 
            {
                int x1 = o1.intValue();
                int x2 = o2.intValue();
                
                if ( x1 > x2 )
                {
                    return -1;
                }
                else if ( x1 == x2 )
                {
                    return 0;
                }
                
                return 1;
            }
        });		
		
		System.out.println( "Sorted list contents:" );
		for ( int i = 0; i < list.size(); i++ )
		{
			System.out.print( list.get( i ) + ", " );
		}
		System.out.println();
	}
}
