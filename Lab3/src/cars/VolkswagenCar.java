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
public class VolkswagenCar extends CoolCar
{
	public String getBrand()
	{
		return "Volkswagon";
	}
	public String getModel()
	{
		return "Beetle";
	}
	public int getModelYear()
	{
		return 1974;
	}
	public int getMileage()
	{
		return 115492;
	}
	public double getFuelLevel()
	{
		return 0.25;
	}
	public boolean hasProblems()
	{
		return true;
	}
}