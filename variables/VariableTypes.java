package variables;

public class VariableTypes {
	
	//global variables
	static String Student_Name = "Angrej";
	static int Student_ID = 123;   
	 
	public static void main(String[] args) {
	
		//local variables
		float Student_Marks = 95 ; 
		String Student_Grade = "A+";
		
		System.out.println("Student Name " +Student_Name);
		System.out.println("Student ID " +Student_ID);
		System.out.println("Student Marks " +Student_Marks);
		System.out.println("Student Grade " +Student_Grade);
		Student_ID = 100; // value of global variable re-assigned
		System.out.println("Student ID " +Student_ID); //it will print re-assigned value
	}
	  

	
}
