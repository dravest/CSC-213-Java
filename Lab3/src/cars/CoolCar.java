package cars;

/**
 * Base class for a cool car.
 * 
 * @author Benjamin Rood
 * Copyright (C) 2017 Canisius College of Buffalo
 */
public class CoolCar
{
    /**
     * Creates a new instance of a {@link CoolCar}.
     */
    public CoolCar()
    {
    }
    
    /**
     * Retrieves the brand of the car.
     * 
     * @return The brand of the car.
     */
    public String getBrand()
    {
        return "Pontiac";
    }
    
    /**
     * Retrieves the model of the car.
     * 
     * @return The model of the car.
     */
    public String getModel()
    {
        return "Firebird";
    }
    
    /**
     * Retrieves the model year of the car.
     * 
     * @return The model year of the car.
     */
    public int getModelYear()
    {
        return 1991;
    }
    
    /**
     * Retrieves the current mileage of the car.
     * 
     * @return The current mileage of the car.
     */
    public int getMileage()
    {
        return 65000;
    }
    
    /**
     * Retrieves the current fuel level.  Valid range is 0.00 to 1.00.
     * 
     * @return The current fuel level.
     */
    public double getFuelLevel()
    {
        return 1.00;
    }
    
    /**
     * Determines if the car has mechanical problems or not.
     * 
     * @return <tt>True</tt> if the car has mechanical problems, <tt>false</tt> otherwise.
     */
    public boolean hasProblems()
    {
        return false;
    }
}
