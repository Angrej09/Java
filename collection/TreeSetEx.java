package collection;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {

		TreeSet<String> hs=new TreeSet<String>();
		hs.add("Ajay");
		hs.add("Ajay");
		hs.add("Ram");
		hs.add("Vijay");
		hs.add("Angrej");
		hs.add("Sahil");
		System.out.println(hs);
		
		for(String s:hs)
		{
			System.out.println(s);
			
		}
		
		TreeSet<Integer> hs1=new TreeSet<Integer>();
		hs1.add(1);
		hs1.add(2);
		hs1.add(5);
		hs1.add(8);
		hs1.add(10);
		hs1.add(9);
		hs1.add(9);
		hs1.add(3);
		
		System.out.println(hs1);
		for(int i:hs1)
		{
			System.out.println(i);
			
		}


	}

}
