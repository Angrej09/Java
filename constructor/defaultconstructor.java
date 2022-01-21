package constructor;

public class defaultconstructor {
	int i;
	String s;
	
	/*defaultconstructor()// non parameterized User defined constructor
	{
		System.out.println("i is "+i +" and s value is " +s);//after constructor invoked will assign the default value for i and s
	}*/

	public static void main(String[] args) {
		 
		//new defaultconstructor();//constructor invoked	
		System.out.println("i is "+new defaultconstructor().i +" and s value is " +new defaultconstructor().s);

	}

}
