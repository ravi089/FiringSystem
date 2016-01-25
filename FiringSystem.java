// Class for Firing system.

import java.lang.*;
import java.util.*;

public class FiringSystem
{
	private Organization organization = null;
	public int k;
	
	public FiringSystem( Organization organization, int k )
	{
		this.organization = organization;
		this.k = k;
	}
	
	public int getOptimalFiringCost() throws InValidManagerObject
	{
		return this.organization.getOptimalFiringCost(this.k);
	}

	public int getOptimalFiringCost( int manager ) throws InValidManagerObject
	{
		return this.organization.getOptimalFiringCost(manager, this.k);
	}
	
	public static void main( String[] args )
	{
		try
		{
			FiringSystem fs = new FiringSystem(new MyOrganization(), 2);
			System.out.println("Total cost in saving would be :- " + Integer.toString(fs.getOptimalFiringCost()));
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter the id of manager under cost-cutting ");
			int manager = scanner.nextInt();
			System.out.println("Total cost in saving would be :- " + Integer.toString(fs.getOptimalFiringCost(manager)));
		}
		catch(InValidManagerObject ex )
		{
			System.out.println(ex);
		}
	}
}