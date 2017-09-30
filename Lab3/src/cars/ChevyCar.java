package cars;
/**
 * 
 * Name: Thomas Draves
 * Date: 9-19-2017
 * Class: CSC 213L
 * 
 * Description: Takes all of the methods from the CoolCars class and
 * overrides them to put new returns in for the VolkswagenCar
 *
 */
public class ChevyCar extends CoolCar
{
	public String getBrand()
	{
		return "Chevrolet";
	}
	public String getModel()
	{
		return "Camaro";
	}
	public int getModelYear()
	{
		return 1970;
	}
	public int getMileage()
	{
		return 32768;
	}
	public double getFuelLevel()
	{
		return 0.75;
	}
	public boolean hasProblems()
	{
		return false;
	}
}