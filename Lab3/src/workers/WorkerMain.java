package workers;

/**
 * Entry point into the Workers program.  This object will perform the required tests
 * for the Workers program portion of Lab 3.
 * 
 * @author Benjamin Rood
 * Copyright (C) 2017 Canisius College of Buffalo
 */
public class WorkerMain
{
    public static void main( String[] args )
    {
        HourlyEmployee   he = new HourlyEmployee( "Hourly Bob" );
        SalariedEmployee se = new SalariedEmployee( "Salaired Sally" );
        
        System.out.println( "Testing worker program" );
        System.out.println( "Base info for: " + he.getName() );
        System.out.println( "Pay Rate: " + he.getPayRate() );
        System.out.println( "Hours worked: " + he.getHoursWorked() ); 
        System.out.println( "Hourly: " + he.isHourly() );
        System.out.println( "Paycheck Amount: " + he.getPaycheckAmount() );
        System.out.println();
        System.out.println( "Base info for: " + se.getName() );
        System.out.println( "Pay Rate: " + se.getPayRate() );
        System.out.println( "Paycheck Amount: " + se.getPaycheckAmount() );
        System.out.println( "Hourly: " + se.isHourly() );
        System.out.println();
        System.out.println( "Modifying hours worked for " + he.getName() );
        he.setHoursWorked( 32 );
        System.out.println( "Pay Rate: " + he.getPayRate() );
        System.out.println( "Hours worked: " + he.getHoursWorked() ); 
        System.out.println( "Hourly: " + he.isHourly() );
        System.out.println( "Paycheck Amount: " + he.getPaycheckAmount() );
        System.out.println();
        System.out.println( "Modifying hours worked for " + he.getName() );
        he.setHoursWorked( 80 );
        System.out.println( "Pay Rate: " + he.getPayRate() );
        System.out.println( "Hours worked: " + he.getHoursWorked() ); 
        System.out.println( "Hourly: " + he.isHourly() );
        System.out.println( "Paycheck Amount: " + he.getPaycheckAmount() );
        System.out.println();
        System.out.println( "Modifying hours worked for " + he.getName() );
        he.setHoursWorked( -20 );
        System.out.println( "Pay Rate: " + he.getPayRate() );
        System.out.println( "Hours worked: " + he.getHoursWorked() ); 
        System.out.println( "Hourly: " + he.isHourly() );
        System.out.println( "Paycheck Amount: " + he.getPaycheckAmount() );
        System.out.println();
        System.out.println( "Modifying pay rate for " + he.getName() );
        he.setPayRate( 25.72 );
        System.out.println( "Pay Rate: " + he.getPayRate() );
        System.out.println( "Hours worked: " + he.getHoursWorked() ); 
        System.out.println( "Hourly: " + he.isHourly() );
        System.out.println( "Paycheck Amount: " + he.getPaycheckAmount() );
        System.out.println();
        System.out.println( "Modifying salary for " + se.getName() );
        se.setPayRate( 105987.82 );
        System.out.println( "Pay Rate: " + se.getPayRate() );
        System.out.println( "Paycheck Amount: " + se.getPaycheckAmount() );
        System.out.println( "Hourly: " + se.isHourly() );
        System.out.println();
        System.out.println( "Modifying salary for " + se.getName() );
        se.setPayRate( 110934 );
        System.out.println( "Pay Rate: " + se.getPayRate() );
        System.out.println( "Paycheck Amount: " + se.getPaycheckAmount() );
        System.out.println( "Hourly: " + se.isHourly() );
        System.out.println();
        System.out.println( "Tests complete" );
    }
}
