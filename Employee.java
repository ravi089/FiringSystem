// Employee class holding details of employee 
// in an organization.

import java.lang.*;
import java.util.*;

public class Employee
{	
	private int id;
	private String name;
	private int rating;     			// 1-Lowest , 5-Highest.
	private long salary;
	
	public Employee( int id, String name )
	{
		this.id = id;
		this.name = name;
	}
	
	public Employee( int id, String name, int rating, long salary )
	{
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.salary = salary;
	}
	
	public void setRating( int rating )
	{
		this.rating = rating;
	}
	
	public void setSalary( long salary )
	{
		this.salary = salary;
	}
	
	public int getID()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getRating()
	{
		return rating;
	}
	
	public long getSalary()
	{
		return salary;
	}
}