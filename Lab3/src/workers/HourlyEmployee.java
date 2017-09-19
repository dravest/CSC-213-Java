package workers;
/**
 * 
 * Name: Thomas Draves
 * Date: 9-19-2017
 * Class: CSC 213L
 * 
 * Description: Takes all the abstract methods from the class Employee
 * Then some new ones that help to define and give values to 
 * things like paycheck amount, pay rate, and hours worked to an hourly worker.
 *
 */
public class HourlyEmployee extends Employee
{
	private double hour = 0;
	private double PayRate = 16.5;
	public HourlyEmployee(String name)
	{
		super(name);
		name = getName();
	}
	public  double getPayRate()
	{
		return PayRate;
	}
	public double getPaycheckAmount()
	{
		return getPayRate() * getHoursWorked();
	}
	public boolean isHourly()
	{
		return true;
	}
	public void setHoursWorked(double hours)
	{
		if (hours >= 0)
		{
			hour = hours;
		}
		if (hours < 0 )
		{
			System.out.println("ERROR: the number of hours worked cannot be < 0");
		}
	}
	public double getHoursWorked()
	{
		return hour;
	}
		
	public double setPayRate(double payRate)
	{
		PayRate = payRate;
		return PayRate;
	}
}