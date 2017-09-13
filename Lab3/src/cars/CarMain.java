package cars;

/**
 * Entry point into the Cars program.  This object will perform the required tests
 * for the Cars program portion of Lab 3.
 * 
 * @author Benjamin Rood
 * Copyright (C) 2017 Canisius College of Buffalo
 */
public class CarMain
{
    public static void main( String[] args )
    {
        CoolCar       base  = new CoolCar();
        ChevyCar      chevy = new ChevyCar();
        FordCar       ford  = new FordCar();
        VolkswagenCar vwc   = new VolkswagenCar();
        
        System.out.println( "Testing car program" );
        System.out.println( "Base class information:" );
        System.out.println( "Brand: " + base.getBrand() );
        System.out.println( "Model: " + base.getModel() );
        System.out.println( "Year: " + base.getModelYear() );
        System.out.println( "Mileage: " + base.getMileage() );
        System.out.println( "Fuel Level: " + base.getFuelLevel() );
        System.out.println( "Problems: " + base.hasProblems() );
        System.out.println();
        System.out.println( "Chevy class information:" );
        System.out.println( "Brand: " + chevy.getBrand() );
        System.out.println( "Model: " + chevy.getModel() );
        System.out.println( "Year: " + chevy.getModelYear() );
        System.out.println( "Mileage: " + chevy.getMileage() );
        System.out.println( "Fuel Level: " + chevy.getFuelLevel() );
        System.out.println( "Problems: " + chevy.hasProblems() );
        System.out.println();
        System.out.println( "Ford class information:" );
        System.out.println( "Brand: " + ford.getBrand() );
        System.out.println( "Model: " + ford.getModel() );
        System.out.println( "Year: " + ford.getModelYear() );
        System.out.println( "Mileage: " + ford.getMileage() );
        System.out.println( "Fuel Level: " + ford.getFuelLevel() );
        System.out.println( "Problems: " + ford.hasProblems() );
        System.out.println();
        System.out.println( "Volkswagen class information:" );
        System.out.println( "Brand: " + vwc.getBrand() );
        System.out.println( "Model: " + vwc.getModel() );
        System.out.println( "Year: " + vwc.getModelYear() );
        System.out.println( "Mileage: " + vwc.getMileage() );
        System.out.println( "Fuel Level: " + vwc.getFuelLevel() );
        System.out.println( "Problems: " + vwc.hasProblems() );
        System.out.println();
        System.out.println( "Tests complete" );
    }

}
