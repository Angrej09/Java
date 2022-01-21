package encapsulation;

class Encapusle
{
	private int sal;
	private String name;
	
	//getting the values
	public String getName()
	{
		
		return name;
	}
	public int getSal()
	{
		return sal;
	}
	
	//Setting the vlaues
	
	public void setName(String name)
	{
		this.name=name;
	}

	public void setSal(int sal)
	{
		this.sal=sal;
	}
}

public class gettersetterExample {

	public static void main(String[] args) {

		Encapusle e=new Encapusle();
		e.setName("Angrej");
		e.setSal(1000);
		System.out.println(e.getName());
		System.out.println(e.getSal());

	}

}
