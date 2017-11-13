import java.io.PrintWriter;
import java.util.Comparator;

/**
 * A class that provides the test cases for the {@link CSTree} implementation.
 * 
 * @author Benjamin Rood
 * Copyright (C) 2017 Canisius College of Buffalo
 */
public class TreeMain
{
    public static void main( String[] args )
    {
        CSTree<Integer> tree = new CSTree<Integer>( new Comparator<Integer>()
        {
            @Override
            public int compare( Integer o1, Integer o2 )
            {
                return o1.compareTo( o2 );
            }
        });
        
        System.out.print( "Testing add() and size()..." );        
        tree.add( 5 );
        tree.add( 2 );
        tree.add( 12 );
        tree.add( -4 );
        tree.add( 3 );
        tree.add( 9 );
        tree.add( 21 );
        tree.add( 19 );
        tree.add( 25 );
        
        if ( tree.size() == 9 )
        {
            System.out.println( "[PASS]");
        }
        else
        {
            System.out.println( "[FAIL]" );
        }
        
        System.out.print( "Testing contains()..." );
        if ( tree.contains( 5 )
          && tree.contains( 2 )
          && tree.contains( 12 )
          && tree.contains( -4 )
          && tree.contains( 3 )
          && tree.contains( 9 )
          && tree.contains( 21 )
          && tree.contains( 19 )
          && tree.contains( 25 ) )
        {
            System.out.println( "[PASS]" );
        }
        else
        {
            System.out.println( "[FAIL]" );
        }
        
        System.out.println( "Testing in-order traversal..." );
        tree.traverseInorder( new PrintWriter( System.out ) );
        System.out.println();
        System.out.println( "Testing pre-order traversal..." );
        tree.traversePreorder( new PrintWriter( System.out ) );
        System.out.println();
        System.out.println( "Testing post-order traversal..." );
        tree.traversePostOrder( new PrintWriter( System.out ) );
        
        System.out.println();
        System.out.println();
        
        System.out.println( "Testing remove()..." );
        tree.traverseInorder( new PrintWriter( System.out ) );
        System.out.println();
        System.out.print( "Removing 25..." );
        tree.remove( 25 );
        System.out.println( (tree.contains( 25 ) ? "[FAIL]" : "[PASS]") );
        tree.traverseInorder( new PrintWriter( System.out ) );
        System.out.println();
        System.out.print( "Removing 19..." );
        tree.remove( 19 );
        System.out.println( (tree.contains( 19 ) ? "[FAIL]" : "[PASS]") );
        tree.traverseInorder( new PrintWriter( System.out ) );
        System.out.println();
        System.out.print( "Removing 21..." );
        tree.remove( 21 );
        System.out.println( (tree.contains( 21 ) ? "[FAIL]" : "[PASS]") );
        tree.traverseInorder( new PrintWriter( System.out ) );
        System.out.println();
        System.out.print( "Removing 9..." );
        tree.remove( 9 );
        System.out.println( (tree.contains( 9 ) ? "[FAIL]" : "[PASS]") );
        tree.traverseInorder( new PrintWriter( System.out ) );
        System.out.println();
        System.out.print( "Removing 3..." );
        tree.remove( 3 );
        System.out.println( (tree.contains( 3 ) ? "[FAIL]" : "[PASS]") );
        tree.traverseInorder( new PrintWriter( System.out ) );
        System.out.println();
        System.out.print( "Removing -4..." );
        tree.remove( -4 );
        System.out.println( (tree.contains( -4 ) ? "[FAIL]" : "[PASS]") );
        tree.traverseInorder( new PrintWriter( System.out ) );
        System.out.println();
        System.out.print( "Removing 12..." );
        tree.remove( 12 );
        System.out.println( (tree.contains( 12 ) ? "[FAIL]" : "[PASS]") );
        tree.traverseInorder( new PrintWriter( System.out ) );
        System.out.println();
        System.out.print( "Removing 2..." );
        tree.remove( 2 );
        System.out.println( (tree.contains( 2 ) ? "[FAIL]" : "[PASS]") );
        tree.traverseInorder( new PrintWriter( System.out ) );
        System.out.println();
        System.out.print( "Removing 5..." );
        tree.remove( 5 );
        System.out.println( (tree.contains( 5 ) ? "[FAIL]" : "[PASS]") );
        tree.traverseInorder( new PrintWriter( System.out ) );
        System.out.println();
        
        if ( tree.size() == 0 )
        {
            System.out.println( "Testing remove()...[PASS]" );
        }
        else
        {
            System.out.println( "Testing remove()...[FAIL]" );
        }
        
        System.out.print( "Re-populating tree..." );
        tree.add( 5 );
        tree.add( 2 );
        tree.add( 12 );
        tree.add( -4 );
        tree.add( 3 );
        tree.add( 9 );
        tree.add( 21 );
        tree.add( 19 );
        tree.add( 25 );
        
        if ( tree.size() == 9 )
        {
            System.out.println( "[PASS]" );
        }
        else
        {
            System.out.println( "[FAIL]" );
        }
        
        System.out.println( "Testing remove()..." );
        tree.traverseInorder( new PrintWriter( System.out ) );
        System.out.println();
        System.out.print( "Removing 25..." );
        tree.remove( 25 );
        System.out.println( (tree.contains( 25 ) ? "[FAIL]" : "[PASS]") );
        tree.traverseInorder( new PrintWriter( System.out ) );
        System.out.println();
        System.out.print( "Removing 21..." );
        tree.remove( 21 );
        System.out.println( (tree.contains( 21 ) ? "[FAIL]" : "[PASS]") );
        tree.traverseInorder( new PrintWriter( System.out ) );
        System.out.println();
        System.out.print( "Removing 19..." );
        tree.remove( 19 );
        System.out.println( (tree.contains( 19 ) ? "[FAIL]" : "[PASS]") );
        tree.traverseInorder( new PrintWriter( System.out ) );
        System.out.println();
        System.out.print( "Removing 12..." );
        tree.remove( 12 );
        System.out.println( (tree.contains( 12 ) ? "[FAIL]" : "[PASS]") );
        tree.traverseInorder( new PrintWriter( System.out ) );
        System.out.println();
        System.out.print( "Removing 3..." );
        tree.remove( 3 );
        System.out.println( (tree.contains( 3 ) ? "[FAIL]" : "[PASS]") );
        tree.traverseInorder( new PrintWriter( System.out ) );
        System.out.println();
        System.out.print( "Removing 2..." );
        tree.remove( 2 );
        System.out.println( (tree.contains( 2 ) ? "[FAIL]" : "[PASS]") );
        tree.traverseInorder( new PrintWriter( System.out ) );
        System.out.println();
        System.out.print( "Removing 5..." );
        tree.remove( 5 );
        System.out.println( (tree.contains( 5 ) ? "[FAIL]" : "[PASS]") );
        tree.traverseInorder( new PrintWriter( System.out ) );
        System.out.println();
        System.out.print( "Removing 9..." );
        tree.remove( 9 );
        System.out.println( (tree.contains( 9 ) ? "[FAIL]" : "[PASS]") );
        tree.traverseInorder( new PrintWriter( System.out ) );
        System.out.println();
        System.out.print( "Removing -4..." );
        tree.remove( -4 );
        System.out.println( (tree.contains( -4 ) ? "[FAIL]" : "[PASS]") );
        tree.traverseInorder( new PrintWriter( System.out ) );
        System.out.println();
        
        if ( tree.size() == 0 )
        {
            System.out.println( "Testing remove()...[PASS]" );
        }
        else
        {
            System.out.println( "Testing remove()...[FAIL]" );
        }
        
        System.out.print( "Re-populating tree..." );
        tree.add( 5 );
        tree.add( 2 );
        tree.add( 12 );
        tree.add( -4 );
        tree.add( 3 );
        tree.add( 9 );
        tree.add( 21 );
        tree.add( 19 );
        tree.add( 25 );
        
        if ( tree.size() == 9 )
        {
            System.out.println( "[PASS]" );
        }
        else
        {
            System.out.println( "[FAIL]" );
        }
        
        tree.traverseInorder( new PrintWriter( System.out ) );
        System.out.println();
        
        System.out.println( "Testing remove()..." );
        System.out.print( "Removing 12..." );
        tree.remove( 12 );
        System.out.println( (tree.contains( 12 ) ? "[FAIL]" : "[PASS]") );
        tree.traverseInorder( new PrintWriter( System.out ) );
        System.out.println();
        System.out.print( "Removing 19..." );
        tree.remove( 19 );
        System.out.println( (tree.contains( 19 ) ? "[FAIL]" : "[PASS]") );
        tree.traverseInorder( new PrintWriter( System.out ) );
        System.out.println();
        System.out.print( "Removing 21..." );
        tree.remove( 21 );
        System.out.println( (tree.contains( 21 ) ? "[FAIL]" : "[PASS]") );
        tree.traverseInorder( new PrintWriter( System.out ) );
        System.out.println();
        System.out.print( "Removing 25..." );
        tree.remove( 25 );
        System.out.println( (tree.contains( 25 ) ? "[FAIL]" : "[PASS]") );
        tree.traverseInorder( new PrintWriter( System.out ) );
        System.out.println();
        System.out.print( "Removing 9..." );
        tree.remove( 9 );
        System.out.println( (tree.contains( 9 ) ? "[FAIL]" : "[PASS]") );
        tree.traverseInorder( new PrintWriter( System.out ) );
        System.out.println();
        System.out.print( "Removing 2..." );
        tree.remove( 2 );
        System.out.println( (tree.contains( 2 ) ? "[FAIL]" : "[PASS]") );
        tree.traverseInorder( new PrintWriter( System.out ) );
        System.out.println();
        System.out.print( "Removing 3..." );
        tree.remove( 3 );
        System.out.println( (tree.contains( 3 ) ? "[FAIL]" : "[PASS]") );
        tree.traverseInorder( new PrintWriter( System.out ) );
        System.out.println();
        System.out.print( "Removing -4..." );
        tree.remove( -4 );
        System.out.println( (tree.contains( -4 ) ? "[FAIL]" : "[PASS]") );
        tree.traverseInorder( new PrintWriter( System.out ) );
        System.out.println();
        System.out.print( "Removing 5..." );
        tree.remove( 5 );
        System.out.println( (tree.contains( 5 ) ? "[FAIL]" : "[PASS]") );
        tree.traverseInorder( new PrintWriter( System.out ) );
        System.out.println();
        
        if ( tree.size() == 0 )
        {
            System.out.println( "Testing remove()...[PASS]" );
        }
        else
        {
            System.out.println( "Testing remove()...[FAIL]" );
        }
    }
}
