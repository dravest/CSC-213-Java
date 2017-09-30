package animals;
/**
 * 
 * Name: Thomas Draves
 * Date: 9-19-2017
 * Class: CSC 213L
 * 
 * Description: Takes the Lion class and implements the methods inside it, 
 * LionImpl cause the methods to have print statements. 
 * Also adds in some new methods.
 *
 */
public class LionImpl implements Lion
{
	public void eat()
	{
		System.out.println( "I'm a lion and I eat meat");
	}
	public void sleep()
	{
		System.out.println("I'm a lion and I sleep all day long");
	}	
	public void roar()
	{
		System.out.println("I'm a lion and HEAR ME ROAR");
	}
	public void beTheKing()
	{
		System.out.println("I'm a lion and I'm king of the jungle");
	}
}