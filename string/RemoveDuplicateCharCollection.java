package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class RemoveDuplicateCharCollection {

	public static void main(String[] args) {

		String s="javvva is awwesome langauge";
		String str="javvva is awwesome langauge";
		String s1="Apple";

		ArrayList<Character> al=new ArrayList<>();
		
		
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			al.add(s1.charAt(i)); 
			count=Collections.frequency(al, 'p');
			
		}
		System.out.println(count);
		
		
		LinkedHashSet<Character> lhs = new LinkedHashSet<>(); 
		for(int i=0;i<s.length();i++) 
			lhs.add(s.charAt(i)); 

		// print string after deleting duplicate elements 
		for(Character c : lhs) 
			System.out.print(c); 

		System.out.println("===============");
		TreeSet<Character> ts = new TreeSet<>(); 
		for(int i=0;i<str.length();i++) 
			ts.add(str.charAt(i)); 

		// print string after deleting duplicate elements 
		for(Character c1 : ts) 
			System.out.print(c1); 

	}
}





