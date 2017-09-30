package workers;
/**
 * 
 * Name: Thomas Draves
 * Date: 9-19-2017
 * Class: CSC 213L
 * 
 * Description: Takes all the abstract methods from the class Employee
 * Then some new ones that help to define and give values to 
 * things like paycheck amount and pay rate to a salary worker.
 *
 */
public class SalariedEmployee extends Employee
{
	private double PayRate = 83572.00;
	public SalariedEmployee(String name)
	{
		super(name);
		name = getName();
	}
	public double setPayRate(double payRate)
	{
		PayRate = payRate;
		return PayRate;
	}
	public  double getPayRate()
	{
		return PayRate;
	}
	public double getPaycheckAmount()
	{
		return getPayRate() / 26;
	}
	public boolean isHourly()
	{
		return false;
	}
}