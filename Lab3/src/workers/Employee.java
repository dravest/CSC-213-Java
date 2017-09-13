package workers;

/**
 * Base class for an object that defines an employee at a company.
 * 
 * @author Benjamin Rood
 * Copyright (C) 2017 Canisius College of Buffalo
 */
public abstract class Employee
{
    /** The name of the {@link Employee}. */
    private String name;
    
    /**
     * Creates a new instance of an {@link Employee}.
     * 
     * @param name The name of the employee.
     */
    protected Employee( String name )
    {
        if ( name == null || "".equals( name ) )
            throw new IllegalArgumentException( "The Employee's name cannot be null or the empty string" );
        
        this.name = name;
    }
    
    /**
     * How much an employee earns, in USD, either by the hour or on an annual basis.
     * 
     * @return How much an employee earns (in USD) by the hour or on an annual basis.
     */
    public abstract double getPayRate();
    
    /**
     * How much an employee should be paid when their paycheck needs to be cut.
     * 
     * @return How much an employee should be paid when their paycheck needs to be cut.
     */
    public abstract double getPaycheckAmount();
    
    /**
     * Returns <tt>true</tt> if this {@link Employee} is paid by the hour, or
     * <tt>false</tt> if this {@link Employee} is paid on an annual basis.
     * 
     * @return <tt>True</tt> if this {@link Employee} is paid by the hour, or
     *         <tt>false</tt> if this {@link Employee} is paid on an annual basis.
     */
    public abstract boolean isHourly();
    
    /**
     * Retrieves the name of the {@link Employee}.
     * 
     * @return The name of the {@link Employee}.
     */
    public final String getName()
    {
        return name;
    }
    
    @Override
    public final String toString()
    {
        String hourly = (isHourly() ? " per hour" : " per year");
        return "Employee " + getName() + ", pay rate " + (isHourly() ? "(per hour)" : "") + " is $" + getPayRate() + hourly;
    }
}
