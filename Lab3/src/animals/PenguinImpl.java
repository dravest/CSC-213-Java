package animals;
/**
 * 
 * Name: Thomas Draves
 * Date: 9-19-2017
 * Class: CSC 213L
 * 
 * Description: Takes the Penguin class and implements the methods,
 * so that there is a print statement for each one.
 * Two new methods are added with print statements.
 *
 */
public class PenguinImpl implements Penguin
{
	public void eat()
	{
		System.out.println("I'm a penguin and I eat fish");
	}
	public void sleep()
	{
		System.out.println("I'm a penguin and I sleep in the cold");
	}
	public void waddle()
	{
		System.out.println("I'm a penguin I waddle around in the cold");
	}
}