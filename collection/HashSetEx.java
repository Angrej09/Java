package collection;

import java.util.HashSet;

/*public class HashSetEx {
	
	public static void main(String[] args)
	{
		HashSet<String> hs=new HashSet<String>();
		hs.add("Ajay");
		hs.add("Ajay");
		hs.add("Ram");
		hs.add("Vijay");
		System.out.println(hs);
		
		for(String s:hs)
		{
			System.out.println(s);
			
		}

	
		
	}

}*/
class Employee
{
	 String name;
	 int empid;

	Employee(String name,int empid)
	{
		this.name=name;
		this.empid=empid;
	}
}
public class HashSetEx
{
	public static void main(String[] args)
	{
		HashSet<Employee> hs=new HashSet<Employee>();
		Employee e1=new Employee("Angrej",101);
		Employee e2=new Employee("Ramm",102);
		
		
		hs.add(e1);
		hs.add(e2);
		
		for(Employee e:hs)
		{
			System.out.println(e1.name +" " + e2.empid);
		}
		
	}
}
