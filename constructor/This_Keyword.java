package constructor;


class Student
{
	int rollno;
	String name;
	float fee;

	 Student(int rollno,String name,float fee)
	{
		this.rollno=rollno;//this keyword used to remove the ambiguity if local and global variable name is same
		this.name=name;
		this.fee=fee;
		
	}
	void display() {
		System.out.println(rollno +" " +name +" " + fee);
	}

}
public class This_Keyword {

	public static void main(String[] args) {

		Student s1=new Student(21,"Angrej",500.50f);
		s1.display();
	}

}

