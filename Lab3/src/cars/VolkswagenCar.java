package cars;

public class VolkswagenCar extends CoolCar
{
	@Override
	public String getBrand()
	{
		return "Volkswagon";
	}
	@Override
	public String getModel()
	{
		return "Beetle";
	}
	@Override
	public int getModelYear()
	{
		return 1974;
	}
	@Override
	public int getMileage()
	{
		return 115492;
	}
	@Override
	public double getFuelLevel()
	{
		return 0.25;
	}
	@Override
	public boolean hasProblems()
	{
		return true;
	}
}