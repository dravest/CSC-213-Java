package cars;

public class FordCar extends CoolCar
{
	@Override
	public String getBrand()
	{
		return "Ford";
	}
	@Override
	public String getModel()
	{
		return "Mustang";
	}
	@Override
	public int getModelYear()
	{
		return 1968;
	}
	@Override
	public int getMileage()
	{
		return 72500;
	}
	@Override
	public double getFuelLevel()
	{
		return 0.5;
	}
	@Override
	public boolean hasProblems()
	{
		return false;
	}
}