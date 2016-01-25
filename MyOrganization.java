// My organization as an Organization.

import java.lang.*;
import java.util.*;
import java.io.*;

public class MyOrganization extends Organization
{
	private final static String employeeData = "employees.txt";
	private final static String managerData = "managers.txt";
	private final static String organizationData = "myorganization.txt";
	
	public MyOrganization()
	{
		loadData();
	}
	
	private void loadData()
	{
		try
		{
			String line = null;
			// Load all the employees.
			File file = new File(employeeData);
		
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ( (line = br.readLine()) != null && !line.isEmpty())
			{
				String[] tokens = line.split(",");
			
				int id = Integer.parseInt(tokens[0]);
				String name = tokens[1];

				addEmployee(new Employee(id, name));
			}
		
			// Load all the managers.
			line = null;
			file = new File(managerData);
		
			br = new BufferedReader(new FileReader(file));
			while ( (line = br.readLine()) != null && !line.isEmpty())
			{
				String[] tokens = line.split(",");
			
				int id = Integer.parseInt(tokens[0]);
				String name = tokens[1];

				addEmployee(new Manager(id, name));
			}
		
			// Load all the relations.
			line = null;
			file = new File(organizationData);
		
			br = new BufferedReader(new FileReader(file));
			while ( (line = br.readLine()) != null && !line.isEmpty())
			{
				String[] tokens = line.split(",");
			
				int id = Integer.parseInt(tokens[0]);
				String name = tokens[1];
				int rating = Integer.parseInt(tokens[2]);
				long salary = Long.parseLong(tokens[3]);
				
				// Set employee fields.
				Employee e = getEmployee(id);
				if ( e != null )
				{
					e.setRating(rating);
					e.setSalary(salary);
				}
			
				if ( tokens.length == 5 )
				{
					int manager = Integer.parseInt(tokens[4]);

					Employee m = getEmployee(manager);
					if ( m != null && (m instanceof Manager))
						((Manager)m).addEmployee(e);
				}
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}