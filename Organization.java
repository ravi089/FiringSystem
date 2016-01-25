// Class for Organization.

import java.lang.*;
import java.util.*;

public class Organization
{		
	private ArrayList<Employee> employeeList = new ArrayList<Employee>();
	private int count = 0;
	
	public int getEmployeesCount()
	{
		return count;
	}
	
	public void addEmployee( Employee e )
	{
		employeeList.add(e);
		count++;
	}
	
	public void removeEmployee( Employee e )
	{
		employeeList.remove(e);
		count--;
	}
	
	public Employee getEmployee( int id )
	{
		for ( int i = 0; i < employeeList.size(); i++ )
		{
			if ( employeeList.get(i).getID() == id )
				return employeeList.get(i);
		}
		return null;
	}

	// Returns the optimal firing cost for whole organization.
	public int getOptimalFiringCost( int k ) throws InValidManagerObject
	{
		int totalCostSavings = 0;
		for ( int i = 0; i < employeeList.size(); i++ )
		{
			if ( employeeList.get(i) instanceof Manager )
				totalCostSavings += getOptimalFiringCost(employeeList.get(i).getID(), k);
		}
		return totalCostSavings;
	}
	
	// Returns the optimal cost under any manager.
	public int getOptimalFiringCost( int manager, int k ) throws InValidManagerObject
	{
		Employee m = getEmployee(manager);
		if ( (m != null) && (m instanceof Manager) )
			return ((Manager)m).getOptimalFiringCost(k);
		else
			throw new InValidManagerObject("Provided id doesn't belong to any manager.");
	}

}