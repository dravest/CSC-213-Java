package cars;

public class ChevyCar extends CoolCar
{
	@Override
	public String getBrand()
	{
		return "Chevrolet";
	}
	@Override
	public String getModel()
	{
		return "Camaro";
	}
	@Override
	public int getModelYear()
	{
		return 1970;
	}
	@Override
	public int getMileage()
	{
		return 32768;
	}
	@Override
	public double getFuelLevel()
	{
		return 0.75;
	}
	@Override
	public boolean hasProblems()
	{
		return false;
	}
}