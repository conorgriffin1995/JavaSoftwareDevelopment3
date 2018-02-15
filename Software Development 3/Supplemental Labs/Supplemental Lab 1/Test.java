import java.util.Scanner;

public class Test 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double totalCost = 0.0;
		boolean moreSchools;
		do
		{
			System.out.println("What is the name of the school?");
			String name = input.nextLine();
			System.out.println("Is this a primary school?");
			boolean isPrimary = input.nextBoolean();			
			System.out.println("What colour should the school uniform be?");
			String colour = input.next();
			System.out.println("How many of these uniforms will you need?");
			int howMany = input.nextInt();
			System.out.println("Does your uniform require an extra coat? true/false");
			boolean coatRequired = input.nextBoolean();
			RegularUniform ru = new RegularUniform(name, isPrimary, colour, howMany, coatRequired);
			double unitCost = ru.calculateCost();
			System.out.println("The unit cost of this school uniform is: " + unitCost + " each.");
			System.out.println("The total cost of all the school uniforms is: " + (unitCost * ru.getHowMany()));
			totalCost = totalCost + (unitCost * ru.getHowMany());
			if(ru.getIsPrimary() == false)
			{
				System.out.println("Do you require a sports uniform?");
				boolean requiresSportsUniform = input.nextBoolean();
				if(requiresSportsUniform == true)
				{
					System.out.println("What quality of material do you want (0 - 100):");
					int materialQuality = input.nextInt();
					System.out.println("Does your uniform require an special footwear? true/false");
					boolean footwearRequired = input.nextBoolean();
					SportsUniform su = new SportsUniform(name, false, materialQuality, footwearRequired);
					double sunit = su.calculateCost();
					System.out.println("The unit cost of this sports uniform order is: " + sunit);
					System.out.println("The total cost of all the sports uniforms is: " + (sunit * ru.getHowMany()));		
					totalCost = totalCost + (sunit * ru.getHowMany());
				}
			}
			
			System.out.println("Do you wish to process another school uniform order? true/false");
			moreSchools = input.nextBoolean();
			input.nextLine();
		}
		while(moreSchools == true);
		System.out.println("Total cost for all schools was " + totalCost);
	}
}
