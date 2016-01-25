// Manager class holding details additional
// to employees in an organization.

import java.util.*;
import java.lang.*;

public class Manager extends Employee
{	
	private ArrayList<Employee> subordinates = new ArrayList<Employee>();
	private int count;
	
    public Manager(int id, String name)
    {
        super(id, name);
		count = 0;
    }

    public Manager(int id, String name, int rating, long salary)
    {
        super(id, name, rating, salary);
		count = 0;
    }

    public void addEmployee(Employee employee)
    {
        subordinates.add(employee);
		count++;
    }

    public int getSubordinateCount()
    {
        return count;
    }

    public ArrayList<Employee> getSubordinates()
    {
        return subordinates;
    }

    public void removeEmployee(Employee employee)
    {
        subordinates.remove(employee);
		count--;
    }
	
	public int getOptimalFiringCost( int k )
	{
		int counter = 0;
		int totalCostSaving = 0;
		ArrayList<Employee> eList = subordinates;
		Collections.sort(eList, new EmployeeComp());
		
		for ( int i = 0; i < eList.size(); i++ )
		{
			if ( counter == k )
				break;
			totalCostSaving += eList.get(i).getSalary();
			counter++;
		}
		
		return totalCostSaving;
	}
}
