// This is the comparator used to compare two employees
// in an organization. Currently 'rating' is used if
// we have same rating then salary is used as criteria.

import java.util.*;
	
public class EmployeeComp implements Comparator<Employee>
{
	public int compare( Employee e1, Employee e2 )
	{
		Integer r1 = new Integer((e1).getRating());
		Integer r2 = new Integer((e2).getRating());
		int rComp = r1.compareTo(r2);

		if ( rComp != 0)  
			return rComp;
		else 
		{
			long s1 = (e1).getSalary();
			long s2 = (e2).getSalary();
			// as we demand descending order.
			if ( s1 < s2 ) return 1;
			else if ( s1 > s2 ) return -1;
			else return 0;
		}
	}
}