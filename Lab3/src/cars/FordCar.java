package cars;
/**
 * 
 * Name: Thomas Draves
 * Date: 9-19-2017
 * Class: CSC 213L
 * 
 * Description: Takes all of the methods from the CoolCars class and
 * overrides them to put new returns in for the FordCar
 *
 */
public class FordCar extends CoolCar
{
	public String getBrand()
	{
		return "Ford";
	}
	public String getModel()
	{
		return "Mustang";
	}
	public int getModelYear()
	{
		return 1968;
	}
	public int getMileage()
	{
		return 72500;
	}
	public double getFuelLevel()
	{
		return 0.5;
	}
	public boolean hasProblems()
	{
		return false;
	}
}