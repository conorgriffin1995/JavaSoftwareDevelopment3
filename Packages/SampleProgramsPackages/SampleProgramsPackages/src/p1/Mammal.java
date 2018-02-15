package p1;

public class Mammal
{
	private String mammalName;

	public Mammal(String name)		
	{
	           mammalName = name;    //set the name
	}
	public String getName()
	{	
	     return mammalName;
	}   
	public void print()
	{	
	     System.out.println("Name is : " + getName() + "\n");
	}
}
