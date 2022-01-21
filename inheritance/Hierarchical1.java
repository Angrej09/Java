package inheritance;

class Animal
{
	void animal()
	{
		System.out.println("Animal class");
	}
}

class Dog extends Animal{
	void dog()
	{
		System.out.println("Dog class");
	}
}
class Cat extends Animal
{
	void cat()
	{
		System.out.println("Cat class");
	}
}
public class Hierarchical1 extends Animal {

	public static void main(String[] args) {
	
		Hierarchical1 h=new Hierarchical1();
		h.animal();
		Cat c=new Cat();
		c.cat();
		c.animal();
		Dog d=new Dog();
		d.dog();
		d.animal();
		
		
	}

}
