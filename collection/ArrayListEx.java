/** ArrayListList is Slower and better for Storing and accessing data */
package collection;

/**
 * Collection is an interface whereas Collections is a class 
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

public class ArrayListEx   {

	public static void main(String[] args) {

		ArrayList<String> addEle=new ArrayList<String>();
		
		/*addEle.add("Apple");
		addEle.add("Mango");
		System.out.println(addEle);*/
		addEle.add("Banana");//Added in index 0
		addEle.add(1, "Papaya");////Added in index 1
		addEle.add("Apple");//Apple added in index 2
		Collections.sort(addEle);
		//addEle.set(0, "Guava");//Set (Replacing) Banana with Guava
		//addEle.remove("Apple"); //removing Apple
		addEle.add("grapes");
		addEle.add("xyz");
		addEle.add("abc");//Allows duplicates
		//System.out.println(addEle);
		//addEle.remove("Apple");
		System.out.println(addEle.size());
		
		ArrayList<String> addEle1=new ArrayList<String>();
		addEle1.add("Banana");//Added in index 0
		addEle1.add(1, "Papaya1");////Added in index 1
		addEle1.add("Mango");//Apple added in index 2
		addEle1.add("Apple");
		addEle1.add("Tea");
		addEle1.add("abc");
		//System.out.println(addEle1);
		
		addEle.retainAll(addEle1);
		//addEle.removeAll(addEle);
		//System.out.println(addEle.get(2));
		//System.out.println(addEle);
		//Collections.sort(addEle); //for sorting the collection of objects 
		
	 
		/*ArrayList addEle=new ArrayList();
		
		addEle.add("Apple");
		addEle.add(2);
		System.out.println(addEle);*/
		
		/*for(String s:addEle)
		{
			System.out.println(s);
		}*/
		

			Iterator  i=addEle.iterator();
			
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
		
			/*ListIterator  i=addEle.listIterator(2);
			while(i.hasNext())
			{
				System.out.println(i.next());
			}*/
		} 
		

	}


