package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		

		LinkedHashSet<String> hs=new LinkedHashSet<String>();
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

	}

}
