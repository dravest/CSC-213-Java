package animals;

/**
 * Entry point into the Animals program.  This object will perform the required tests
 * for the Animal program portion of Lab 3.
 * 
 * @author Benjamin Rood
 * Copyright (C) 2017 Canisius College of Buffalo
 */
public class AnimalMain
{
    public static void main( String[] args )
    {
        LionImpl    li = new LionImpl();
        PenguinImpl pi = new PenguinImpl();
        
        System.out.println( "Testing animal program" );
        li.eat();
        li.sleep();
        li.roar();
        li.beTheKing();
        System.out.println();
        pi.eat();
        pi.sleep();
        pi.waddle();
        System.out.println();
        System.out.println( "Tests complete" );
    }

}
