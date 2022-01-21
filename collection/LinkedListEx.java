/** LinkedList is faster and better for manipulating data */
package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> addEle=new LinkedList<String>();
		
		/*addEle.add("Apple");
		addEle.add("Mango");
		System.out.println(addEle);
		addEle.add("Banana");//Added in index 0
		addEle.add(1, "Papaya");////Added in index 1
		addEle.add("Apple");//Apple added in index 2
		
		//addEle.set(0, "Guava");//Set (Replacing) Banana with Guava
		//addEle.remove("Apple"); //removing Apple
		addEle.add("grapes");
		addEle.add("xyz");
		addEle.add("abc");//Allows duplicates
		//System.out.println(addEle);
		//addEle.remove("Apple");
		System.out.println(addEle.size());*/
		
		//LinkedList<String> addEle1=new LinkedList<String>();
		List<String> addEle1=new LinkedList<String>();
		addEle1.add("Banana");//Added in index 0
		addEle1.add(1, "Papaya1");////Added in index 1
		addEle1.add("Mango");//Apple added in index 2
		addEle1.add("Apple");
		addEle1.add("Tea");
		addEle1.add("abc");
		
		
		System.out.println(addEle1);
		
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
		

		/*	Iterator  i=addEle.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
		*/
			ListIterator<String>  i2=addEle.listIterator(1);
			while(i2.hasNext())
			{
				System.out.println(i2.next());
			}
		} 

}
